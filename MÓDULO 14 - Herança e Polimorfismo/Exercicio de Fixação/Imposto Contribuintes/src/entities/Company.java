package entities;

public final class Company extends Base {

    Integer numberOfEmployees;


    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public Company() {
    }

    public Company(String name, Double annualIncome, Integer numberOfFunconarios) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfFunconarios;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    //! ----------------------------------------          METHODS   ----------------------------------------------------

    //%% Taxa
    @Override
    public final Double tax() {
        double tax = 0.0;

        if (numberOfEmployees > 10) {
            tax = getAnnualIncome() * 0.14;
        } else {
            tax = getAnnualIncome() * 0.16;
        }
        return tax;
    }
}