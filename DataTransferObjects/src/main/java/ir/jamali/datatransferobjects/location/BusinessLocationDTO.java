package ir.jamali.datatransferobjects.location;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author hosein
 */
public class BusinessLocationDTO implements Serializable {

    private String id;
    private String title;
    private Double averageRating;
    private String managerName;
    private String mobile;
    private String phone;
    private List<String> images;
    private Double latitude;
    private Double longitude;
    private CityDTO city;
    private String address;

    public BusinessLocationDTO(String id, String title, Double averageRating, String managerName, String mobile, String phone, List<String> images, Double latitude, Double longitude, CityDTO city, String address) {
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
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
        final BusinessLocationDTO other = (BusinessLocationDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }        
    
}
