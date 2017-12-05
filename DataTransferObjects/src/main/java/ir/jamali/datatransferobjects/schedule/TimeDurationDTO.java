package ir.jamali.datatransferobjects.schedule;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author hosein
 */
public class TimeDurationDTO implements Serializable {
    
    private String id;
    private Date beginTime;
    private Date endTime;    
    private String description;

    public TimeDurationDTO(String id, Date beginTime, Date endTime, String description) {
        this.id = id;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
        final TimeDurationDTO other = (TimeDurationDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
        
}
