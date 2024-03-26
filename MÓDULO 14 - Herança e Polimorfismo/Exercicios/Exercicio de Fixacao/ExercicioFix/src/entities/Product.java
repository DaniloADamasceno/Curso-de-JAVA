package entities;

public class Product {
    private String name;
    private double price;

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //! ----------------------------------------        TO-STRING   ----------------------------------------------------
    public String toString() {
        return "Product: \n name:  " + name + "\n price:  " + price;
    }


}