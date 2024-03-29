package entities;

public class Product {

    private String name;
    private Double price;

    //^^-------------------------------------  Constructor  ------------------------------------------------------------
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //^^-------------------------------------  Getters and Setters  ----------------------------------------------------
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

    //^^-------------------------------------  toString  ---------------------------------------------------------------
    @Override
    public String toString() {
        return "Product|Produto [ " +
               "Name|Nome ='" + name +
               ", Price|Preço = " + "R$" + price + ']';
    }
}
