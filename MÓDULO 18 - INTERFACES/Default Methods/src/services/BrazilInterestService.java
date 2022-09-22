package services;

public class BrazilInterestService implements InterestService_INTER {

  private Double interestRate;

  //----------------------
  //!       CONSTRUCTOR
  //----------------------
  public BrazilInterestService(Double interestRate) {
    this.interestRate = interestRate;
  }

  public BrazilInterestService() {
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
