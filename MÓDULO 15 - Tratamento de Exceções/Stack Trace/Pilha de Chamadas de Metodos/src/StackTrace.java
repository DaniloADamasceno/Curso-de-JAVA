import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class StackTrace {

    public static void main(String[] args) throws Exception {

        method01();
        System.out.println(); // quebra de linha
        System.out.println("Fim do programa");
        System.out.println(); // quebra de linha
    }

    //!   ------------------------------------   Chamada de Métodos   ----------------------------------------------------

    public static void method01() {
        System.out.println("🆙 ----------> Method Start #01  <----------");
        method02();
        System.out.println("🔴 ----------> Method End   #01  <---------- 🔴");
    }

    public static void method02() {
        System.out.println("🆙 ----------> Method Start #02    <----------");

        System.out.println(); // quebra de linha
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print(" Digite os Dados dos vetores:");
        try {
            String[] vector = sc.nextLine().split(" ");

            System.out.print("Digite a posição do vetor que deseja ver:  ");
            int positionVector = sc.nextInt();
            System.out.println("A Posição do Vetor é: " + vector[positionVector]);
        } catch (ArrayIndexOutOfBoundsException ArrayError) { // quando o Tamanho do vetor não corresponde

            ArrayError.printStackTrace(); // Para imprimir o erro na tela (Os chamados )
            System.out.println("Error !!! ( Array Inesperado)");
        } catch (InputMismatchException StringNotNumber) {
            System.out.println("Erro inesperado (String não e Numero) ");
            StringNotNumber.printStackTrace(); // Para imprimir o erro na tela (Os chamados )
        }
        System.out.println("🔴----------> Method End #02  <---------- 🔴");

        sc.close();
    }
}
