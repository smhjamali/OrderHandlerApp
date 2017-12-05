package ir.jamali.orderhandler.model.schedule;

import ir.jamali.datatransferobjects.schedule.FreeDayDTO;
import ir.jamali.datatransferobjects.schedule.ScheduleDTO;
import ir.jamali.orderhandler.model.GenericEntity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author hosein
 */
@Table
@Entity(name = "tbl_schedule")
public class Schedule extends GenericEntity {

    @Column(name = "INCLD_OFFICIAL_FREE_DAYS")
    private Boolean includeOfficialFreeDays;
                
    @ManyToOne
    @JoinColumn(name = "WORKING_DAY_ID")
    private WorkingDay workingDay;

    @ManyToMany
    @JoinTable(name = "tbl_none_official_f_d",
            joinColumns=@JoinColumn(name = "SCHEDULE_ID", referencedColumnName = "ID"),
            inverseJoinColumns=@JoinColumn(name = "FREE_DAY_ID", referencedColumnName = "ID"))
    private List<FreeDay> noneOfficialFreeDays;

    public Schedule() {
    }

    public Schedule(Boolean includeOfficialFreeDays, WorkingDay workingDay, List<FreeDay> noneOfficialFreeDays) {
        this.includeOfficialFreeDays = includeOfficialFreeDays;
        this.workingDay = workingDay;
        this.noneOfficialFreeDays = noneOfficialFreeDays;
    }

    public Boolean getIncludeOfficialFreeDays() {
        return includeOfficialFreeDays;
    }

    public void setIncludeOfficialFreeDays(Boolean includeOfficialFreeDays) {
        this.includeOfficialFreeDays = includeOfficialFreeDays;
    }

    public WorkingDay getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(WorkingDay workingDay) {
        this.workingDay = workingDay;
    }

    public List<FreeDay> getNoneOfficialFreeDays() {
        return noneOfficialFreeDays;
    }

    public void setNoneOfficialFreeDays(List<FreeDay> noneOfficialFreeDays) {
        this.noneOfficialFreeDays = noneOfficialFreeDays;
    }
        
    public ScheduleDTO getTransferObject(){
        List<FreeDayDTO> freeDays = new ArrayList<>(this.getNoneOfficialFreeDays().size());
        for(FreeDay fd : this.getNoneOfficialFreeDays()){
            freeDays.add(fd.getTransferObject());
        }
        ScheduleDTO dto = new ScheduleDTO(this.getId(), this.getIncludeOfficialFreeDays(), this.getWorkingDay().getTransferObject(), freeDays);
        return dto;
    }
}
