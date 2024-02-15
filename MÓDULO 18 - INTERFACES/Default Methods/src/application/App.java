package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService_INTER;

public class App {
    public static void main(String[] args) throws Exception {

        /*
            Fazer um programa para ler uma quantia e a duração em meses de um empréstimo. 
        Informar o valor a ser pago após decorrido o prazo do empréstimo, conforme regras de juros do Brasil.
        A regra de cálculo de juros do Brasil é juro composto padrão de 2% ao mês.
        
         */
        
        Locale.setDefault(Locale.ENGLISH);
        Scanner scan = new Scanner(System.in);

        System.out.print(" Amount of money || Quantia em dinheiro : ");
        double amount = scan.nextDouble(); // Quantia em dinheiro

        System.out.print(" Months || Meses : ");
        int months = scan.nextInt(); // Meses

        InterestService_INTER BrazIntService = new BrazilInterestService(2.0);
        double payment = BrazIntService.payment(amount, months);

        System.out.println(); // Quebra de linha
        System.out.println(" Payment after months || Pagamento após " + months + " meses : "
                + String.format("%.2f", payment));
        System.out.println(" Interest || Juros : " + String.format("%.2f", payment - amount));
        System.out.println(); // Quebra de linha
        scan.close();
    }
}
