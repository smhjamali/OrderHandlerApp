package ir.jamali.apigateway.common;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hosein
 */
public class GenericService implements Serializable {
    
    @PersistenceContext(unitName = "orderhandler_pu")
    private EntityManager entityManager;

    public GenericService() {
    }    

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
        
}
