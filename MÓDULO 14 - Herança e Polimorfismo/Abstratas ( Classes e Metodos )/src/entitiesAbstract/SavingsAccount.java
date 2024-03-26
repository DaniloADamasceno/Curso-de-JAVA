package entitiesAbstract;

public final class SavingsAccount extends Account {

    private double interestRate; // taxa de juros

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public SavingsAccount() {}

    public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }
    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    //! ----------------------------------------          METHODS   ----------------------------------------------------
    //%% Atualizar o saldo da conta
    public void updateBalance() {
        balance += balance * interestRate;
    }

    //%% Sacar
    @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }
}
