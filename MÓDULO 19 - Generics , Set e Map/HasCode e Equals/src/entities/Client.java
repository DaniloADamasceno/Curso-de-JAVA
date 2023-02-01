package entities;

import java.util.Objects;

public class Client {

    private final String name;
    private String email;

    //--------------------------------------------- Construtor ------------------------------------------------------
    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //--------------------------------------------- Getters and Setters ---------------------------------------------
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //-------------------------------------------- HasCode e Equals---------------------------------------------------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return name.equals(client.name) && getEmail().equals(client.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getEmail());
    }
}
