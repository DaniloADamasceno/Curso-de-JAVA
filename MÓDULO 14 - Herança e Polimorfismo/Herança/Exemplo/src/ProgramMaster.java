import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaster {

    public static void main(String[] args) throws Exception {
    /*
    Suponha um negócio de banco que possui uma conta comum e uma conta para empresas, 
    sendo que a conta para empresa possui todos os membros da conta comum,
    mais um limite de empréstimo e uma operação de realizar empréstimo.
    
    || Business Account
    
    number: Integer
    holder: String
    balance: Double
    loanLimit: Double
    -----------------------------
    +withdraw(amount: Double)->  void
    deposit (amount: Double). -> void
    loan amount: Double): void
    
    - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    || Account
    number: Integer
    holder. string
    balance: Double
    -----------------------------
    withdraw (amount: Double) . -> void
    deposit (amount: Double). -> void
    
     */
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account acOne = new Account(1001, "Miguel", 0.0);
        System.out.println(acOne);

        BusinessAccount accBusiness = new BusinessAccount(1002, "Nina", 0.0, 100.0);

        //%% UpCasting
        Account accOne = accBusiness;
        System.out.println(accOne);
        Account accTwo = new BusinessAccount(1003, "Snow", 200.0, 100.0);
        Account accThree = new SavingsAccount(1004, "Frederico", 300.0, 0.10);

        //%% DownCasting
        BusinessAccount accFor = (BusinessAccount) accTwo;
        accFor.loan(200.0);

        // no DownCasting tem que sempre fazer a checagem de tipo
        if (accThree instanceof BusinessAccount) {
            BusinessAccount accFive = (BusinessAccount) accThree;
            accFive.loan(200.0);
            System.out.println("Fiz o Empréstimo");
        }

        if (accThree instanceof SavingsAccount) {
            SavingsAccount accFive = (SavingsAccount) accThree;
            accFive.updateBalance();
            System.out.println("Fiz o Update");
        }
        System.out.println();
        System.out.println("_____________________________________________________");
        System.out.println();

        Account accSix = new Account(1006, "Malu", 1000.0);
        System.out.println("Malu sacou R$ 200.00 e tera uma taxa de R$ 5.00 de acréscimo");
        accSix.withdraw(200.0);
        System.out.println(accSix.getBalance()); // tera que ficar R$ 795,00

        System.out.println();

        Account accSeven = new SavingsAccount(1007, "Snoop", 500.0, 0);
        System.out.println("Snoop sacou R$ 250.00 sem taxas pois suas conta e uma poupança");
        accSeven.withdraw(250.0);
        System.out.println(accSeven.getBalance()); // tera que ficar R$ 250,00

        System.out.println();

        Account accEight = new BusinessAccount(1008, "Maggie", 1500.0, 500.00);
        System.out.println("Maggie sacou R$ 493.00 e tera uma taxa de R$ 2.00(Business) de acréscimo e R$ 5.00 (Account)");
        accEight.withdraw(493.00);
        System.out.println(accEight.getBalance()); // tera que ficar R$ 1000.00

        System.out.println();
        sc.close();
    }
}
