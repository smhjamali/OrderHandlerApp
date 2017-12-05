package ir.jamali.orderhandler.services.wildfly;

import ir.jamali.apigatewayclient.security.SecurityBusinessInterface;
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
@Named(value = "wildflyServiceLocator")
@Singleton
@WildflyCompatibleServiceLocator
public class WildflyServiceLocator implements ServiceLocator {
    
    private static SecurityBusinessInterface securityService;    
    
    @Override
    public SecurityBusinessInterface lookupSecurityService() {
        try {
            if(securityService == null){
                Properties prop = new Properties();
                prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");            
                Context ejbServerContext = new InitialContext(prop);                           
                securityService = (SecurityBusinessInterface) ejbServerContext.lookup(SECURITY_SERVICE_EJB_GLOBAL_JNDI_NAME);
            }
            return securityService;
        } catch (NamingException ex) {
            Logger.getLogger(WildflyServiceLocator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static final String SECURITY_SERVICE_EJB_GLOBAL_JNDI_NAME = "ejb:OrderHandlerApp/APIGateway//SecurityService!ir.jamali.apigatewayclient.security.SecurityBusinessInterface";
    
}
