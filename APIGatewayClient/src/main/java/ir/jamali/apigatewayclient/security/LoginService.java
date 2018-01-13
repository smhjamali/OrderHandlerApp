package ir.jamali.apigatewayclient.security;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import ir.jamali.datatransferobjects.user.AccountDTO;
import ir.jamali.server.security.SecurityBusinessInterface;
import ir.jamali.client.security.ISecurity;

@Stateless(mappedName = "ISecurity")
@Remote(ISecurity.class)
public class LoginService implements ISecurity {

	@EJB(name = "SecurityService")
	private SecurityBusinessInterface securityService;
	
	public void login(AccountDTO accountDTO) {		
		System.out.print("66546454");
	}
	
	public void signup(AccountDTO accountDTO) {		
		System.out.print("66546454");
	}	
}
