package ir.jamali.orderhandler.model.schedule;

import ir.jamali.datatransferobjects.schedule.TimeDurationDTO;
import ir.jamali.orderhandler.model.GenericEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author hosein
 */
@Table
@Entity(name = "tbl_time_duration")
public class TimeDuration extends GenericEntity {
    
    @Column(name = "BEGIN")
    @Temporal(value = TemporalType.TIME)
    private Date beginTime;
    @Column(name = "END")
    @Temporal(value = TemporalType.TIME)
    private Date endTime;    
    @Column(name = "DESCRIPTION")
    private String description;

    public TimeDuration() {
    }

    public TimeDuration(Date beginTime, Date endTime, String description) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.description = description;
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
        
    public TimeDurationDTO getTransferObject(){
        TimeDurationDTO dto = new TimeDurationDTO(
        this.getId(), this.getBeginTime(), this.getEndTime(), this.getDescription());
        return dto;
    }
}
