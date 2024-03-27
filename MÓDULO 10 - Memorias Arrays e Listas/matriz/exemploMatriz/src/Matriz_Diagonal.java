import java.util.Locale;
import java.util.Scanner;

public class Matriz_Diagonal {

  public static void main(String[] args) throws Exception {
    /*
                Fazer um programa para ler um número inteiro "N" e uma matriz de ordem "N" contendo números inteiros.
         Em seguida, mostrar a diagonal principal ea quantidade de valores negativos da matriz.
         */

    Scanner in = new Scanner(System.in);
    Locale.setDefault(Locale.ENGLISH);

    System.out.print("Enter the number of elements da Matriz: ");
    int numElements = in.nextInt();
    //-------------------------
    //      Criar uma Matriz
    //-------------------------
    int[][] matriz = new int[numElements][numElements];

    for (int i = 0; i < matriz.length; i++) { // --------------- quantidade linhas 
      for (int j = 0; j < matriz[i].length; j++) { // --------quantidade de colunas 
        matriz[i][j] = in.nextInt();
      }
    }

    System.out.print("Main Diagonal:");
    for (int i = 0; i < matriz.length; i++) {
      System.out.print(matriz[i][i] + " ");
    }
    System.out.println();

    //----------------------------
    // Fazer a contagem de números negativos
    //----------------------------

    int count = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] < 0) {
                count++;
            }
        }
    }
    System.out.println("Negative elements: " + count);

    in.close();
  }
}
