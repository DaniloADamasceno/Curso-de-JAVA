import java.util.Locale;
import java.util.Scanner;

public class ExemploOneArrays {

    public static void main(String[] args) throws Exception {
    /*
            Faça um programa para ler um número inteira N e a altura de N pessoas. Armazene as Ns alturas em um vetor .
        Em seguida mostre a Altura media das pessoas. 
         */

        Locale.setDefault(Locale.ENGLISH);
        Scanner Sc = new Scanner(System.in);

        System.out.print("Digite o número de pessoas para o calculo da altura : ");
        int altura = Sc.nextInt();
        System.out.println();
        System.out.printf("Digite a Altura das pessoas: \n");
        double[] vector = new double[altura]; // --------------------para criar um vetor

        for(int i = 0; i < altura; i++) {
            vector[i] = Sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < altura; i++) {
            soma += vector[i];
        }

        double average = soma / altura;

        System.out.printf(" A Média das Alturas é: %.2f \n", average);

        Sc.close();
    }
}
