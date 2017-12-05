package ir.jamali.orderhandler.utils;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 *
 * @author hosein
 */
public class FacesUtil implements Serializable {

    public static void addMessage(Severity severity, String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, message, message));
    }
    
    public static void addMessage(String cliendId, Severity severity, String message) {
        FacesContext.getCurrentInstance().addMessage(cliendId, new FacesMessage(severity, message, message));
    }
    
}
