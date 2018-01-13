package ir.jamali.orderhandler.services.cache;

import ir.jamali.client.security.ISecurity;
import ir.jamali.orderhandler.cdi.qualifiers.WildflyCompatibleServiceLocator;
import ir.jamali.orderhandler.services.ServiceLocator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author hosein
 */
@Named(value = "serviceLocatorCache")
@Singleton
public class ServiceLocatorCache implements ServiceLocator {
    
    private ISecurity securityService;    
    
    public ISecurity lookupSecurityService() {
        try {
            if(securityService == null){            	
            	Context ic = new InitialContext();            	            	            	                                                
                securityService = (ISecurity) ic.lookup(SECURITY_SERVICE_EJB_GLOBAL_JNDI_NAME);
            }
            return securityService;
        } catch (NamingException ex) {
            Logger.getLogger(ServiceLocatorCache.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static final String SECURITY_SERVICE_EJB_GLOBAL_JNDI_NAME = "java:comp/env/ejb/ISecurity";
    
}
