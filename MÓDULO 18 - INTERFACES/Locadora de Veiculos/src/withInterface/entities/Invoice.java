package withInterface.entities;

public class Invoice {

    private Double basicPayment;
    private Double tax;


    //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Invoice() {
    }

    //!  ----------------------------------------    GETTERS AND SETTERS    --------------------------------------------
    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    //!   -------------------------------------------      METHODS      ------------------------------------------------
    //%%  Total do pagamento + imposto
    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }

    //!   -------------------------------------------      TO-STRING      ----------------------------------------------
    @Override
    public String toString() {
        return (
                "Pagamento |INVOICE :   \n" +
                "Basic Payment: " + basicPayment +
                "\n" +
                "Tax: " + tax +
                "" +
                "Total Payment: " + getTotalPayment());
    }
}
