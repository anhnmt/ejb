package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Trip")
public class Trip {
    @Id
    @Column(name = "TripId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tripId;

    @Column(name = "TripName", columnDefinition = "NVARCHAR(MAX)")
    private String tripName;

    @Column(name = "Driver", columnDefinition = "NVARCHAR(MAX)")
    private String driver;

    @Column(name = "DateMaking", columnDefinition = "DATETIME2")
    private Date dateMaking;

    @Column(name = "Guest", columnDefinition = "NVARCHAR(MAX)")
    private Integer guest;

    @Column(name = "Price")
    private Double price;

    public Trip() {
    }

    public Trip(Integer tripId, String tripName, String driver, Date dateMaking, Integer guest, Double price) {
        this.tripId = tripId;
        this.tripName = tripName;
        this.driver = driver;
        this.dateMaking = dateMaking;
        this.guest = guest;
        this.price = price;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Date getDateMaking() {
        return dateMaking;
    }

    public void setDateMaking(Date dateMaking) {
        this.dateMaking = dateMaking;
    }

    public Integer getGuest() {
        return guest;
    }

    public void setGuest(Integer guest) {
        this.guest = guest;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
