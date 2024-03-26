package entities;

public abstract class Base {

    private String name;
    private Double annualIncome;

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public Base() {}

    public Base(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    //! ----------------------------------------          METHODS   ----------------------------------------------------
    //%% Taxa
    public abstract Double tax();

}