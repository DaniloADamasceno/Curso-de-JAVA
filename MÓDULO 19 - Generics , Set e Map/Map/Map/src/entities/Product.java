package entities;

public class Product {

    private String name;
    private Double price;

    //-------------------------------------  Construtor  -------------------------------------
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //-------------------------------------  Getters and Setters  -------------------------------------
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

    //-------------------------------------  toString  -------------------------------------
    @Override
    public String toString() {
        return name
                + ", "
                + String.format("%.2f", price);
    }

    //-------------------------------------  hashCode and equals  -------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (!getName().equals(product.getName())) return false;
        return getPrice().equals(product.getPrice());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getPrice().hashCode();
        return result;
    }
}
