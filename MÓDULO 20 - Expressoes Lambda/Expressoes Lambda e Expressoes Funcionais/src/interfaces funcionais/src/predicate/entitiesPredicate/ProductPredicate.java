package predicate.entitiesPredicate;

public class ProductPredicate {

    private String name;
    private Double price;

    //-------------------------------------  Constructor  ---------------------------------------------
    public ProductPredicate(String name, Double price) {
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

    //!-------------------------------------  Methods  ------------------------------------------------
    // MÉTODO ESTATICO PRECISA DE UM ARGUMENTO PARA SER ATRIBUIDO A UMA VARIAVEL
    public static boolean staticProductPredicate(ProductPredicate product) {   // outra forma de fazer o mesmo que o ProductPredicate.java e chamando o metodo statico
        return product.getPrice() >= 100;
    }

    public boolean naoStaticProductPredicate() {     // outra forma de fazer o mesmo que o ProductPredicate.java e chamando o metodo nao statico
        return price >= 100;
    }

    //-------------------------------------  toString  -----------------------------------------------
    @Override
    public String toString() {
        return "Product/Produto >> " +
                "Name/Nome = " + name +
                "--> Price/Preço = " + price;
    }
}
