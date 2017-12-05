package ir.jamali.datatransferobjects.schedule;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author hosein
 */
public class ScheduleDTO implements Serializable {
    
    private String id;
    private Boolean includeOfficialFreeDays;
    private WorkingDayDTO workingDay;
    private List<FreeDayDTO> noneOfficialFreeDays;

    public ScheduleDTO(String id, Boolean includeOfficialFreeDays, WorkingDayDTO workingDay, List<FreeDayDTO> noneOfficialFreeDays) {
        this.id = id;
        this.includeOfficialFreeDays = includeOfficialFreeDays;
        this.workingDay = workingDay;
        this.noneOfficialFreeDays = noneOfficialFreeDays;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIncludeOfficialFreeDays() {
        return includeOfficialFreeDays;
    }

    public void setIncludeOfficialFreeDays(Boolean includeOfficialFreeDays) {
        this.includeOfficialFreeDays = includeOfficialFreeDays;
    }

    public WorkingDayDTO getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(WorkingDayDTO workingDay) {
        this.workingDay = workingDay;
    }

    public List<FreeDayDTO> getNoneOfficialFreeDays() {
        return noneOfficialFreeDays;
    }

    public void setNoneOfficialFreeDays(List<FreeDayDTO> noneOfficialFreeDays) {
        this.noneOfficialFreeDays = noneOfficialFreeDays;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final ScheduleDTO other = (ScheduleDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
        
}
