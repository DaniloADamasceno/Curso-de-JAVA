package entities;

import java.util.Objects;

public class ProductTreeSet implements Comparable<ProductTreeSet> {

    private String name;
    private Double price;

    //------------------------------ Construtor -------------------------------------------------------------
    public ProductTreeSet(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //------------------------------ Getters and Setters -----------------------------------------------------
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

    //------------------------------ Métodos -------------------------------------------------------------
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int compareTo(ProductTreeSet o) {
        return name.toUpperCase().compareTo(o.getName().toUpperCase());
    }

    //------------------------------ hashCode e equals ----------------------------------------------------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductSet product)) return false;
        return getName().equals(product.getName()) && getPrice().equals(product.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

}
