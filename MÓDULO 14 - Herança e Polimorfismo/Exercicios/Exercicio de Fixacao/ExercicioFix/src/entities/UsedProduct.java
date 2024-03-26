package entities;

public final class UsedProduct extends Product {

    private String manufactureDate;

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public UsedProduct() {
    }

    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public String getManufactureDate() {
        return manufactureDate;
    }

    //! ----------------------------------------          TO-STRING   --------------------------------------------------

    @Override
    public String toString() {
        return super.toString() +
               "\n manufactureDate:  " + manufactureDate + "\n";

    }

}