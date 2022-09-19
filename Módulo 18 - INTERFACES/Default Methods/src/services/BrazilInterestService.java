package services;

public class BrazilInterestService {

  private Double interestRate;

  //----------------------
  //!       CONSTRUCTOR
  //----------------------
  public BrazilInterestService(Double interestRate) {
    this.interestRate = interestRate;
  }

  public BrazilInterestService() {}

  //----------------------------
  //!       GETTERS AND SETTERS
  //----------------------------
  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
      this.interestRate = interestRate;
  }
  
  //----------------------
    //!       METHODS
    //----------------------
    public double payment(double amount, int months) {
        return amount * Math.pow(1.0 + interestRate / 100.0, months);
    }
}
