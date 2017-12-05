package ir.jamali.orderhandler.model.schedule;

import ir.jamali.datatransferobjects.schedule.FreeDayDTO;
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
@Entity(name = "tbl_free_day")
public class FreeDay extends GenericEntity {

    @Column(name = "DAY")
    @Temporal(value = TemporalType.DATE)
    private Date day;
    @Column(name = "DESCRIPTION")
    private String description;

    public FreeDay() {
    }

    public FreeDay(Date day, String description) {
        this.day = day;
        this.description = description;
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
        
    public FreeDayDTO getTransferObject(){
        FreeDayDTO dto = new FreeDayDTO(
        this.getId(), this.getDay(), this.getDescription()
        );
        return dto;
    }
    
}
