package ir.jamali.orderhandler.model.schedule;

import ir.jamali.datatransferobjects.schedule.TimeDurationDTO;
import ir.jamali.datatransferobjects.schedule.WorkingDayDTO;
import ir.jamali.orderhandler.model.GenericEntity;
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
@Table
@Entity(name = "tbl_working_day")
public class WorkingDay extends GenericEntity {

    @Column(name = "BEGIN")
    @Temporal(value = TemporalType.TIME)
    private Date beginTime;
    @Column(name = "END")
    @Temporal(value = TemporalType.TIME)
    private Date endTime;

    @ManyToMany
    @JoinTable(name = "tbl_w_d_breaks",
            joinColumns = @JoinColumn(name = "WORDING_DAY_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "TIME_DURATION_ID", referencedColumnName = "ID"))
    private List<TimeDuration> breaks;

    public WorkingDay() {
    }

    public WorkingDay(Date beginTime, Date endTime, List<TimeDuration> breaks) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.breaks = breaks;
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

    public List<TimeDuration> getBreaks() {
        return breaks;
    }

    public void setBreaks(List<TimeDuration> breaks) {
        this.breaks = breaks;
    }

    public WorkingDayDTO getTransferObject() {
        List<TimeDurationDTO> breaks = new ArrayList<>(this.getBreaks().size());
        for (TimeDuration brks : this.getBreaks()) {
            breaks.add(brks.getTransferObject());
        }
        WorkingDayDTO dto = new WorkingDayDTO(
                this.getId(), this.getBeginTime(), this.getEndTime(), breaks);
        return dto;
    }

}
