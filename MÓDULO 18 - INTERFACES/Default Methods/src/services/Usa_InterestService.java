package services;

public class Usa_InterestService implements InterestService_INTER {

    private Double interestRate;

    //----------------------
    //!       CONSTRUCTOR
    //----------------------
    public Usa_InterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Usa_InterestService() {
    }

    //----------------------------
    //!       GETTERS AND SETTERS
    //----------------------------
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    //----------------------
    //!       METHODS
    //----------------------
  
}
