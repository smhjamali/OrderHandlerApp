package ir.jamali.apigateway.security;

import ir.jamali.apigateway.common.GenericService;
import ir.jamali.dao.user.AccountDao;
import ir.jamali.datatransferobjects.user.AccountDTO;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import ir.jamali.server.security.SecurityBusinessInterface;

/**
 *
 * @author hosein
 */
@Stateless
@Remote(SecurityBusinessInterface.class)
public class SecurityService extends GenericService implements SecurityBusinessInterface {  
    
    public void createAccount(AccountDTO accountDTO) {
        AccountDao accountDao = new AccountDao(getEntityManager());
        accountDao.create(accountDTO);
    }
    
    public void updateAccount(AccountDTO accountDTO) {
        AccountDao accountDao = new AccountDao(getEntityManager());
        accountDao.update(accountDTO);
    }
    
    public AccountDTO findAccountById(Long accountId) {
        AccountDao accountDao = new AccountDao(getEntityManager());
        return accountDao.findById(accountId);
    }
    
}
