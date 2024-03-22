package funcoesComoParamentro.entitiesParametro;

public class ProductParameter {

    private String name;
    private Double price;

    //^^---------------------------------------------  Constructor  ----------------------------------------------------
    public ProductParameter(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //^^------------------------------------------  Getters and Setters  -----------------------------------------------
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

    //^^-------------------------------------------------  Methods  ----------------------------------------------------

    //^^-----------------------------------------------  toString  -----------------------------------------------------
    @Override
    public String toString() {
        return "Product|Produto >> " +
               "Name|Nome = " + name +
               "--> Price/Preço = " + String.format("%.2f", price);
    }
}
