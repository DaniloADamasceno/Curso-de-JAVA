package exemploArray;

public class ProductsNominal {

    private String name;
    private double price;

    //! ------------------------------------   Constructors     --------------------------------------------------------
    public ProductsNominal(String name, double price) { // criando os Construtores
        this.name  = name;
        this.price = price;
    }

    //!-----------------------------------   Getters and Setters     ---------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}