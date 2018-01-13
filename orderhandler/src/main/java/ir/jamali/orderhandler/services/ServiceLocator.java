package ir.jamali.orderhandler.services;

import java.io.Serializable;

import ir.jamali.client.security.ISecurity;

/**
 *
 * @author hosein
 */
public interface ServiceLocator extends Serializable {
    public abstract ISecurity lookupSecurityService();
}
