package ir.jamali.orderhandler.model.servicetype;

import ir.jamali.datatransferobjects.servicetype.RegularServiceDTO;
import ir.jamali.orderhandler.model.GenericEntity;
import ir.jamali.orderhandler.model.location.BusinessLocation;
import ir.jamali.orderhandler.model.schedule.Schedule;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author hosein
 */
@Entity
@Table(name = "tbl_regular_service")
public class RegularService extends GenericEntity {

    @ManyToOne
    @JoinColumn(name = "BUSINESS_LOCATION_ID")
    private BusinessLocation location;
    @ManyToOne
    @JoinColumn(name = "SCHEDULE_ID")
    private Schedule schedule;
    @Column(name = "SERVICE_NAME", length = 500)
    private String name;

    public RegularService() {
    }

    public RegularService(BusinessLocation location, Schedule schedule, String name) {
        this.location = location;
        this.schedule = schedule;
        this.name = name;
    }

    public BusinessLocation getLocation() {
        return location;
    }

    public void setLocation(BusinessLocation location) {
        this.location = location;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RegularServiceDTO getTransferObject() {
        RegularServiceDTO dto = new RegularServiceDTO(
                this.getId(), this.getLocation().getTransferObject(), 
                this.getSchedule().getTransferObject(), this.getName());
        return dto;
    }
}
