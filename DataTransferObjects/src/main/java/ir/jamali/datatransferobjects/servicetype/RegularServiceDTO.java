package ir.jamali.datatransferobjects.servicetype;

import ir.jamali.datatransferobjects.location.BusinessLocationDTO;
import ir.jamali.datatransferobjects.schedule.ScheduleDTO;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hosein
 */
public class RegularServiceDTO implements Serializable {
    
    private String id;
    private BusinessLocationDTO location;
    private ScheduleDTO schedule;
    private String name;

    public RegularServiceDTO(String id, BusinessLocationDTO location, ScheduleDTO schedule, String name) {
        this.id = id;
        this.location = location;
        this.schedule = schedule;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BusinessLocationDTO getLocation() {
        return location;
    }

    public void setLocation(BusinessLocationDTO location) {
        this.location = location;
    }

    public ScheduleDTO getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleDTO schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final RegularServiceDTO other = (RegularServiceDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
        
}
