package exemploArray;

import java.util.Locale;
import java.util.Scanner;
//import java.util.Vector;

public class ExemploTwoArrays {

    public static void main(String[] args) {
    /*
         Fazer um programa para ler um número inteiro "N" e os dados(nome e preço) de "N" Produtos. Armazene os "N"
         produtos em um vetor.
         Em seguida, mostrar o preço médio dos produtos.
         */
        Locale.setDefault(Locale.ENGLISH);
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int numberOfProduts = Sc.nextInt();

        ProductsNominal[] vetor = new ProductsNominal[numberOfProduts]; //--------------- importando a Classe

        for(int i = 0; i < vetor.length; i++) {
            //Sc.nextInt();
            System.out.print("Digite o nome do produto:  ");
            String name = Sc.next();
            System.out.print("Digite o Preço do produto R$:  ");
            double price = Sc.nextDouble();
            vetor[i] = new ProductsNominal(name, price); //---------- para o vetor receber os dados lidos
            // anteriormente .
        }

        double sum = 0.0; // -------------------------------para somar todos os valores
        for(int i = 0; i < vetor.length; i++) {
            sum += vetor[i].getPrice();
        }

        double media = sum / numberOfProduts;
        System.out.println();
        System.out.printf(" a Média de preço dos produtos é: %.2f \n", media);
        System.out.println();

        Sc.close();
    }
}
