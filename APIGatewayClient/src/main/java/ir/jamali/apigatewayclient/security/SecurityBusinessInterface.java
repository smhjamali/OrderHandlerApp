package ir.jamali.apigatewayclient.security;

import ir.jamali.datatransferobjects.user.AccountDTO;
import java.io.Serializable;

/**
 *
 * @author hosein
 */
public interface SecurityBusinessInterface extends Serializable {
    
    public void createAccount(AccountDTO accountDTO);
    public void updateAccount(AccountDTO accountDTO);
    public AccountDTO findAccountById(Long accountId);
}
