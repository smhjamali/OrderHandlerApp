package ir.jamali.orderhandler.model.user;

import ir.jamali.datatransferobjects.user.RoleDTO;
import ir.jamali.orderhandler.model.GenericEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author hosein
 */
@Entity
@Table(name = "tbl_role")
public class Role extends GenericEntity {

    @Column(name = "NAME", length = 600)
    private String name;
    @Column(name = "EMAIL", length = 600)
    private String email;

    public Role(String name, String email) {
        this.name = name;
        this.email = email;
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }     
    
    public RoleDTO getTransferObject(){
        RoleDTO dto = new RoleDTO(this.getId(), this.getName(), this.getEmail());
        return dto;
    }
}
