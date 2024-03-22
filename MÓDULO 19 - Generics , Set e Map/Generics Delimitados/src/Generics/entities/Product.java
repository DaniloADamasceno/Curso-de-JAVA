package generics.entities;

public class Product implements Comparable<Product> {


    private String name;
    private Double price;

    //^^ ------------------------------------------    Construtores    -------------------------------------------------
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //^^ ---------------------------------------------    Getters e Setters --------------------------------------------
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

    //!-------------------------------------------------    Methods   --------------------------------------------------
    @Override
    public String toString() {
        return "Product [ name || Nome=" + name + ", price || Preço=" + String.format("%.2f", price) + "]";
    }

    @Override
    public int compareTo(Product o) {
        return price.compareTo(o.getPrice()); // Compara o preço do produto com o preço do outro produto

    }

}