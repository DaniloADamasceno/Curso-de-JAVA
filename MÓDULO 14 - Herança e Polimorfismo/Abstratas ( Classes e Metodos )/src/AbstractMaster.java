import entitiesAbstract.Account;
import entitiesAbstract.BusinessAccount;
import entitiesAbstract.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AbstractMaster {

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
    +withdraw(amount: Double) -> void
    deposit (amount: Double). -> void
    loan amount: Double): void
    
    - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    || Account
    number: Integer
    holder. string
    balance: Double
    -----------------------------
    withdraw (amount: Double) . void
    deposit (amount: Double). void
    
     */
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
/*
        Quando adicionar a classe abstrata, não precisa instanciar a classe abstrata, só instanciar a classe que herda da classe abstrata.
         com isso eu não precisarei mais utilizar a classe Account
*/
        List<Account> list = new ArrayList<>(); // para criar uma nova lista de contas

        list.add(new SavingsAccount(2002, "Samuel Abstract", 1000.0, 00.05));
        list.add(new SavingsAccount(2002, "Ismael Abstract", 1000.0, 00.05));
        list.add(new SavingsAccount(2002, "Manuel Abstract", 1000.0, 00.05));

        list.add(new BusinessAccount(2003, "Mary Abstract", 1500.0, 1000.0));
        list.add(new BusinessAccount(2003, "Nair Abstract", 1500.0, 1000.0));
        list.add(new BusinessAccount(2003, "Lola Abstract", 1500.0, 1000.0));

        double soma = 0.0;

        //%% Somar todos os saldos
        for (Account acc : list) {
            soma += acc.getBalance();
        }

        System.out.println();
        System.out.printf("Total de todos os Saldos em conta é: %.2f\n", soma);


        //%% Para depositar 10 reais em cada conta
        for (Account acc : list) {
            acc.deposit(10.0);
        }
        System.out.println();
        for (Account acc : list) {
            System.out.printf("Atualização da conta %d : %.2f%n ", acc.getNumber(), acc.getBalance());
        }
        System.out.println();
        sc.close();
    }
}
