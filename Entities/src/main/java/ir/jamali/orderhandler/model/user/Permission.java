package ir.jamali.orderhandler.model.user;

import ir.jamali.datatransferobjects.user.PermissionDTO;
import ir.jamali.orderhandler.model.GenericEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author hosein
 */
@Entity
@Table(name = "tbl_permission")
public class Permission extends GenericEntity {

    @Column(name = "EMAIL", length = 600)
    private String name;
    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;

    public Permission(String name, Role role) {
        this.name = name;
        this.role = role;
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public PermissionDTO getTransferObject(){
        PermissionDTO dto = new PermissionDTO(this.getId(), this.getName(), this.getRole().getTransferObject());
        return dto;
    }
}
