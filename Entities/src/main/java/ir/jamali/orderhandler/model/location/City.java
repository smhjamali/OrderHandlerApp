package ir.jamali.orderhandler.model.location;

import ir.jamali.datatransferobjects.location.CityDTO;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author hosein
 */
@Entity
@Table(name = "tbl_city")
public class City implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "NAME")
    private String name;
    @ManyToOne
    @JoinColumn(name = "STATE_ID")    
    private State state;

    public City() {
    }

    public City(long id, String name, State state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }        
    
    public CityDTO getTransferObject(){
        CityDTO dto = new CityDTO(this.getId(), this.getName());
        return dto;
    }
}
