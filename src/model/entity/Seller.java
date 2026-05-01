package model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Seller {

    private Integer id;
    private String name;
    private String email;
    private Date brithDate;
    private Double salary;

    public Seller(Integer id, String name, String email, Date brithDate, Double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.brithDate = brithDate;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(Date brithDate) {
        this.brithDate = brithDate;
    }

    public Double getSalary() {
        return salary;
    }





}
