package ir.jamali.orderhandler.model.location;

import ir.jamali.datatransferobjects.location.BusinessLocationDTO;
import ir.jamali.orderhandler.model.GenericEntity;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author hosein
 */
@Table
@Entity(name = "tbl_business_location")
public class BusinessLocation extends GenericEntity {

    @Column(name = "TITLE", length = 1000)
    private String title;
    @Column(name = "AVERAGE_RATING")
    private Double averageRating;
    @Column(name = "MANAGER_NAME")
    private String managerName;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "PHONE")
    private String phone;
    @ElementCollection
    @CollectionTable(name = "tbl_b_l_images", joinColumns = @JoinColumn(name = "IMAGE_KEY"))
    private List<String> images;
    @Column(name = "LATITUDE")
    private Double latitude;
    @Column(name = "LONGITUDE")
    private Double longitude;
    @ManyToOne
    @JoinColumn(name = "CITY_ID")
    private City city;
    @Column(name = "ADDRESS", length = 2000)
    private String address;

    public BusinessLocation() {
    }

    public BusinessLocation(String title, Double averageRating, String managerName, String mobile, String phone, List<String> images, Double latitude, Double longitude, City city, String address) {
        this.title = title;
        this.averageRating = averageRating;
        this.managerName = managerName;
        this.mobile = mobile;
        this.phone = phone;
        this.images = images;
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BusinessLocationDTO getTransferObject() {
        BusinessLocationDTO dto = new BusinessLocationDTO(
                this.getId(), this.getTitle(), this.getAverageRating(),
                this.getManagerName(), this.getMobile(), this.getPhone(),
                this.getImages(), this.getLatitude(), this.getLongitude(),
                this.getCity().getTransferObject(), this.getAddress()
        );
        return dto;
    }

}
