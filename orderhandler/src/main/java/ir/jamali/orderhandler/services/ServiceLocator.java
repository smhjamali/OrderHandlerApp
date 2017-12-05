package ir.jamali.orderhandler.services;

import ir.jamali.apigatewayclient.security.SecurityBusinessInterface;
import java.io.Serializable;

/**
 *
 * @author hosein
 */
public interface ServiceLocator extends Serializable {
    public abstract SecurityBusinessInterface lookupSecurityService();
}
