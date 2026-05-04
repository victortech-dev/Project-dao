package model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Seller implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private Date brithDate;
    private Double Basesalary;

    private Department department;

    public Seller(Integer id, String name, String email, Date brithDate, Double Basesalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.brithDate = brithDate;
        this.Basesalary = Basesalary;
        this.department = department;
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
        return Basesalary;
    }

    public void setSalary(Double salary) {
        this.Basesalary = Basesalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", brithDate=" + brithDate +
                ", salary=" + Basesalary +
                ", department=" + department +
                '}';
    }
}
