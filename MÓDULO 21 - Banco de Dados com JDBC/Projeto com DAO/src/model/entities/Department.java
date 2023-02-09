package model.entities;

import java.io.Serial;
import java.io.Serializable;  // Serializable é uma ‘interface’ que permite converter o objeto em uma sequência de bytes,
// para poder ser salvo em um arquivo, enviado por uma rede, etc.

public class Department implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    //--------------------------------------------  Constructors   -----------------------------------------------------
    public Department() {}
    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    //--------------------------------------------  toString   ---------------------------------------------------------

    @Override
    public String toString() {
        return "Department/Departamento [" +
                "id=" + id +
                ", name/nome='" + name + '\'' +
                ']';
    }

    //--------------------------------------------  hashCode and equals   ----------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    //--------------------------------------------  Methods   ----------------------------------------------------------

}
