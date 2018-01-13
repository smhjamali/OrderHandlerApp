package ir.jamali.client.security;

import ir.jamali.datatransferobjects.user.AccountDTO;
import java.io.Serializable;

/**
 *
 * @author hosein
 */
public interface ISecurity extends Serializable {
    
    public void login(AccountDTO accountDTO);
    public void signup(AccountDTO accountDTO);
    
}
