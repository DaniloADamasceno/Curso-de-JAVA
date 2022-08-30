package entities;

public class Product {

    public String name;
    public Double price;
    public Integer quantity;



    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //---------------------------
    //!   GETS AND SETS
    //---------------------------
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    //---------------------------
    //!    METODOS
    //---------------------------

    public double total() {
        return price * quantity;
    }
    
}