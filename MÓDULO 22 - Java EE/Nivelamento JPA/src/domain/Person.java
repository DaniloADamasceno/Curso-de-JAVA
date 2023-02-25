package domain;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;

    //-------------------------------------------------   Constructors   -----------------------------------------------
    public Person() {
    }

    public Person(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    //-------------------------------------------------   Getters and Setters   ----------------------------------------
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

    //-------------------------------------------------   ToString   ---------------------------------------------------
    @Override
    public String toString() {
        return "Person >>>  ID= #" + id + "    NAME= " + name +  "         E-MAIL= " + email;
    }
}
