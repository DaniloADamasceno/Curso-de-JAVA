package entities;

public final class ImportedProduct extends Product {

    private double customsFee;

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public double getCustomsFee() {
        return customsFee;
    }

    //! ----------------------------------------        TO-STRING   ----------------------------------------------------

    @Override
    public String toString() {
        return
                super.toString() +
                "\n customsFee:  " + customsFee + "\n";
    }

}