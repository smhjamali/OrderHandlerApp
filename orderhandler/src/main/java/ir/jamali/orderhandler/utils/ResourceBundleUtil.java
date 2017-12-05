package ir.jamali.orderhandler.utils;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.faces.context.FacesContext;

/**
 *
 * @author hosein
 */
public class ResourceBundleUtil implements Serializable {
    
    public static String getMessage(String basename, String key){
        ResourceBundle bundle = ResourceBundle.getBundle(basename, FacesContext.getCurrentInstance().getViewRoot().getLocale());
        return bundle.getString(key);
    }
}
