package clientPensao;

public class Cliente {

    private String name;
    private String email;
    private int room;

    //! -----------------------------------   Constructors  -----------------------------------------------------------
    public Cliente(String name, String email, int room) {
        this.name  = name;
        this.email = email;
        this.room  = room;
    }

    //!-----------------------------------   Getters and Setters -------------------------------------------------------
    //-----------------------------------
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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    //!-----------------------------------   toString  -----------------------------------------------------------------
    public String toString() {
        return "Cliente: \n name=" + name +
               "\n email=" + email +
               "\n room=" + room + "\n";
    }
}