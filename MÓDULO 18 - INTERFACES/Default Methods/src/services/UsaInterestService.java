package services;

public class UsaInterestService implements InterestServiceINTER {

    private Double interestRate;

    //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public UsaInterestService() {
    }

    //!  ----------------------------------------    GETTERS AND SETTERS    --------------------------------------------
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
