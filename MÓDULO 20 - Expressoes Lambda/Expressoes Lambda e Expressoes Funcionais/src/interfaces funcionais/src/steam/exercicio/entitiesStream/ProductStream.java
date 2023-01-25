package steam.exercicio.entitiesStream;

public class ProductStream {

    private String name;
    private Double price;

    // -------------------------------------------------- Constructor --------------------------------------------------
    public ProductStream(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // -------------------------------------------------- Getters and Setters-------------------------------------------
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    //-------------------------------------------------- To String -----------------------------------------------------
    @Override
    public String toString() {
        return "Product/Produto >> " +
                "Name/Nome = " + name +
                "--> Price/Preço = " + String.format("%.2f", price);
    }


}
