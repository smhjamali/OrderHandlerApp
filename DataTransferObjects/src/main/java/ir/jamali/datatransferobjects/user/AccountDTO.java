package ir.jamali.datatransferobjects.user;

import ir.jamali.datatransferobjects.servicetype.RegularServiceDTO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author hosein
 */
public class AccountDTO implements Serializable {
    
    private String id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private String lastIpAddress;
    private Date lastLoginDate;
    private Date createDate;       
    private List<RegularServiceDTO> regularServices;
            
    public AccountDTO(String id, String username, String password, String salt, String email, String lastIpAddress, Date lastLoginDate, Date createDate, List<RegularServiceDTO> regularServices) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.lastIpAddress = lastIpAddress;
        this.lastLoginDate = lastLoginDate;
        this.createDate = createDate;
        this.regularServices = regularServices;
    }

    public AccountDTO(String username, String password, String salt, String email, String lastIpAddress, Date lastLoginDate, Date createDate) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.lastIpAddress = lastIpAddress;
        this.lastLoginDate = lastLoginDate;
        this.createDate = createDate;
    }    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastIpAddress() {
        return lastIpAddress;
    }

    public void setLastIpAddress(String lastIpAddress) {
        this.lastIpAddress = lastIpAddress;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<RegularServiceDTO> getRegularServices() {
        return regularServices;
    }

    public void setRegularServices(List<RegularServiceDTO> regularServices) {
        this.regularServices = regularServices;
    }    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AccountDTO other = (AccountDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
        
}
