package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(MAX)")
    private String name;
    @Column(name = "Gender", columnDefinition = "NVARCHAR(MAX)")
    private boolean gender;
    @Column(name = "Birthday", columnDefinition = "DATE")
    private Date birthday;
    @Column(name = "Country")
    private String country;
    @Column(name = "Company", columnDefinition = "NVARCHAR(MAX)")
    private String company;
    @Column(name = "Salary")
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, boolean gender, Date birthday, String country, String company, Double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.country = country;
        this.company = company;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    
}
