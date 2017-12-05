package ir.jamali.datatransferobjects.schedule;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author hosein
 */
public class FreeDayDTO implements Serializable {
    
    private String id;
    private Date day;
    private String description;

    public FreeDayDTO(String id, Date day, String description) {
        this.id = id;
        this.day = day;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final FreeDayDTO other = (FreeDayDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
        
}
