import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryAndCatch {

    public static void main(String[] args) {
        System.out.println();// quebra de linha

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os Dados dos vetores:  ");
        try {
            String[] vector = sc.nextLine().split(" ");

            System.out.print("Digite a posição do vetor que deseja ver:  ");
            int positionVector = sc.nextInt();
            System.out.println( "A Posição do Vetor é: "+ vector[positionVector]);


        } catch (ArrayIndexOutOfBoundsException ArrayError) { // quando o Tamanho do vetor não corresponde 
            System.out.println("Error !!! ( Array Inesperado)");
        } catch (InputMismatchException StringNotNumber) {
            System.out.println("Erro inesperado (String não e Numero) ");
        }

        System.out.println(); // quebra de linha
        System.out.println("----->>  Fim do programa  <<-----");
        System.out.println(); // quebra de linha
        sc.close();
    }
}
