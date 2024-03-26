package entities;

public final class Individual extends Base {

    Double healthExpenditures;

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    //! ----------------------------------------          METHODS   ----------------------------------------------------

    //%% Taxa
    @Override
    public final Double tax() {
        double tax = 0.0;

        if (getAnnualIncome() < 20000.0) {
            tax = getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
        } else {
            tax = getAnnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
        return tax;
    }
}