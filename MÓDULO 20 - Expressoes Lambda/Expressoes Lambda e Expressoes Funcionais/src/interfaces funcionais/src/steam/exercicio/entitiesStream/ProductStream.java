package steam.exercicio.entitiesStream;

public class ProductStream {

    private final String nameProductStream;
    private final Double priceProductStream;

    //^^ -------------------------------------------------- Constructor ------------------------------------------------
    public ProductStream(String name, Double price) {
        this.nameProductStream = name;
        this.priceProductStream = price;
    }

    //^^ -------------------------------------------------- Getters and Setters-----------------------------------------
    public String getNameProductStream() {
        return nameProductStream;
    }

    public Double getPriceProductStream() {
        return priceProductStream;
    }

    //^^-------------------------------------------------- To String ---------------------------------------------------
    @Override
    public String toString() {
        return "Product|Produto >> " +
               "Name|Nome = " + nameProductStream +
               "--> Price|Preço = " + String.format("%.2f", priceProductStream);
    }


}
