package ir.jamali.orderhandler.model.user;

import ir.jamali.datatransferobjects.servicetype.RegularServiceDTO;
import ir.jamali.datatransferobjects.user.AccountDTO;
import ir.jamali.orderhandler.model.GenericEntity;
import ir.jamali.orderhandler.model.servicetype.RegularService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author hosein
 */
@Entity
@Table(name = "tbl_user")
public class Account extends GenericEntity {

    @Column(name = "USERNAME", length = 50)
    private String username;
    @Column(name = "PASSWORD", length = 600)
    private String password;
    @Column(name = "SALT", length = 600)
    private String salt;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "LAST_IP_ADDRESS")
    private String lastIpAddress;

    @Column(name = "LAST_LOGIN_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date lastLoginDate;
    @Column(name = "CREATE_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createDate;

    @ManyToMany
    @JoinTable(name = "tbl_r_s_of_account",
            joinColumns = @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "REGULAR_SERVICE_ID", referencedColumnName = "ID"))
    private List<RegularService> regularServices;

    public Account() {
    }

    public Account(String username, String password, String salt, String email, String lastIpAddress, Date lastLoginDate, Date createDate, List<RegularService> regularServices) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.lastIpAddress = lastIpAddress;
        this.lastLoginDate = lastLoginDate;
        this.createDate = createDate;
        this.regularServices = regularServices;
    }

    public Account(String username, String password, String salt, String email, String lastIpAddress, Date lastLoginDate, Date createDate) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.lastIpAddress = lastIpAddress;
        this.lastLoginDate = lastLoginDate;
        this.createDate = createDate;
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

    public List<RegularService> getRegularServices() {
        return regularServices;
    }

    public void setRegularServices(List<RegularService> regularServices) {
        this.regularServices = regularServices;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public AccountDTO getTransferObject() {
        List<RegularServiceDTO> rss = new ArrayList<>(this.getRegularServices().size());
        for(RegularService rs : this.getRegularServices()){
            rss.add(rs.getTransferObject());
        }
        AccountDTO dto = new AccountDTO(this.getId(), this.getUsername(),
                this.getPassword(), this.getSalt(), this.getEmail(), this.getLastIpAddress(),
                this.getLastLoginDate(), this.getCreateDate(), rss);
        return dto;
    }

}
