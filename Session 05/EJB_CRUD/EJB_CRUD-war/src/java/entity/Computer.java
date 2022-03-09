package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Computer")
public class Computer {
    @Id
    @Column(name = "ComId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comId;
    @Column(name = "ComName", columnDefinition = "NVARCHAR(MAX)")
    private String comName;
    @Column(name = "Producer", columnDefinition = "NVARCHAR(MAX)")
    private String producer;
    @Column(name = "DateMaking", columnDefinition = "DATETIME")
    private Date dateMaking;
    @Column(name = "YearWarranty")
    private Integer yearWarranty;
    @Column(name = "Config", columnDefinition = "NVARCHAR(MAX)")
    private String config;
    @Column(name = "Price")
    private Double price;

    public Computer() {
    }

    public Computer(Integer comId, String comName, String producer, Date dateMaking, Integer yearWarranty, String config, Double price) {
        this.comId = comId;
        this.comName = comName;
        this.producer = producer;
        this.dateMaking = dateMaking;
        this.yearWarranty = yearWarranty;
        this.config = config;
        this.price = price;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Date getDateMaking() {
        return dateMaking;
    }

    public void setDateMaking(Date dateMaking) {
        this.dateMaking = dateMaking;
    }

    public Integer getYearWarranty() {
        return yearWarranty;
    }

    public void setYearWarranty(Integer yearWarranty) {
        this.yearWarranty = yearWarranty;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
