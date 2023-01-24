package consumer.entitiesConsumer;

public class ProductConsumer {

    private String name;
    private Double price;

    //----------------------------------------------------   Construtors   ---------------------------------------------
    public ProductConsumer(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //----------------------------------------------   Getters and Setters   -------------------------------------------
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
    //----------------------------------------------   Methods   -------------------------------------------------------

    public static void staticPriceUpdate(ProductConsumer pConsumer) {
        pConsumer.setPrice(pConsumer.getPrice() * 1.1);
    }

    public void naoStaticPriceUpdate() {  // Método não estatico
        price = price * 1.1;
    }

    //----------------------------------------------   toString()   ----------------------------------------------------
    @Override
    public String toString() {

        return "Product/Produto >> " +
                "Name/Nome = " + name +
                "--> Price/Preço = " + String.format("%.2f", price);
    }
}
