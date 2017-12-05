package ir.jamali.datatransferobjects.schedule;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author hosein
 */
public class WorkingDayDTO implements Serializable {
    
    private String id;
    private Date beginTime;
    private Date endTime;    
    private List<TimeDurationDTO> breaks;

    public WorkingDayDTO(String id, Date beginTime, Date endTime, List<TimeDurationDTO> breaks) {
        this.id = id;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.breaks = breaks;
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

    public List<TimeDurationDTO> getBreaks() {
        return breaks;
    }

    public void setBreaks(List<TimeDurationDTO> breaks) {
        this.breaks = breaks;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.id);
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
        final WorkingDayDTO other = (WorkingDayDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
        
}
