package ir.jamali.dao.user;

import ir.jamali.datatransferobjects.user.AccountDTO;
import ir.jamali.orderhandler.model.user.Account;
import java.io.Serializable;
import javax.persistence.EntityManager;

/**
 *
 * @author hosein
 */
public class AccountDao implements Serializable {
    
    private EntityManager entityManager;

    public AccountDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public void create(AccountDTO accountDTO) {
        Account acount = new Account(accountDTO.getUsername(), accountDTO.getPassword(), 
                accountDTO.getSalt(), accountDTO.getEmail(), accountDTO.getLastIpAddress(), 
                accountDTO.getLastLoginDate(), accountDTO.getCreateDate());
        entityManager.persist(acount);
    }
    
    public void update(AccountDTO accountDTO) {
        Account account = entityManager.find(Account.class, accountDTO.getId());
        account.setEmail(accountDTO.getEmail());
        entityManager.merge(account);
    }
    
    public AccountDTO findById(Long accountId) {
        Account account = entityManager.find(Account.class, accountId);
        return account.getTransferObject();
    }
}
