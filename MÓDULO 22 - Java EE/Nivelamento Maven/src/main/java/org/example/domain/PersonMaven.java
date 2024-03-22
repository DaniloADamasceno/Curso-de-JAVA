package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class PersonMaven implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id  //
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;

    //!-------------------------------------------------   Constructors   ----------------------------------------------
    public PersonMaven() {
    }

    public PersonMaven(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //!-------------------------------------------------   Getters and Setters   ---------------------------------------
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

    //!-------------------------------------------------   ToString   --------------------------------------------------
    @Override
    public String toString() {
        return "Person >>>  ID= #" + id + "    NAME= " + name + "         E-MAIL= " + email;
    }
}
