package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String email;
    private Double baseSalary;
    private Date birthDate;
    private Department department;

    //--------------------------------------------  Constructors   -----------------------------------------------------
    public Seller() {
    }

    public Seller(Integer id, String name, String email, Double baseSalary, Date birthDate, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.birthDate = birthDate;
        this.department = department;
    }
    //--------------------------------------------  Getters and Setters   ----------------------------------------------

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

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    //--------------------------------------------  toString   ---------------------------------------------------------

    @Override
    public String toString() {
        return "Seller/ Vendedor [" +
                "id=" + id +
                ", name/nome ='" + name + '\'' +
                ", email='" + email + '\'' +
                ", baseSalary/salario =" + baseSalary +
                ", birthDate/data de nascimento=" + birthDate +
                ", department =" + department;
    }

    //--------------------------------------------  hashCode and equals   ----------------------------------------------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller seller)) return false;

        if (!getId().equals(seller.getId())) return false;
        return getDepartment().equals(seller.getDepartment());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getDepartment().hashCode();
        return result;
    }

    //--------------------------------------------  Methods   ----------------------------------------------------------
}
