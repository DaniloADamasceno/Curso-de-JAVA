package entities;

public final class SavingsAccount extends Account {

  private double interestRate; // taxa de juros

  //!--------------------------------------          Construtores     --------------------------------------------------
  public SavingsAccount() {}

  public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  //! ------------------------------------------          Getters e Setters     ----------------------------------------
  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }

  //! ----------------------------------------          Métodos   ------------------------------------------------------
  //%% Atualização de saldo
  public void updateBalance() {
    balance += balance * interestRate;
  }

  //%% Retirada
  @Override
  public void withdraw(Double amount) {
    balance -= amount;
  }
}
