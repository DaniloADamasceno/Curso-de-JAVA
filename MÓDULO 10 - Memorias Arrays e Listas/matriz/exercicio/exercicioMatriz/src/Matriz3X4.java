import java.util.Locale;
import java.util.Scanner;

public class Matriz3X4 {

    public static void main(String[] args) throws Exception {
    /*
    Fazer um programa para ler dois números inteiros "M" e "N", e depois ler uma matriz de M linhas por N colunas
    contendo números inteiros,
    podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, 
    mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.
    
    Linhas da matriz --> 3          Colunas da Matriz --> 4
    Valores inseridos:
                    10 8 15 12
                    21 11 23 8
                    14 5 13 19
    Número que sera dado por ocorrência --->   8
    Position 0,1:
    Left: 10
    Right: 15
    Down: 11
    Position 1,3:
    Left: 23
    Up: 12
    Down: 19
     */

        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);


        System.out.print("Digite o número de linhas da matriz:  ");
        int matrizLinha = in.nextInt();
        System.out.print("Digite o número de colunas da matriz:  ");
        int matrizColunas = in.nextInt();

        //%%  Criar a Matriz
        int[][] matriz = new int[matrizLinha][matrizColunas];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println();
        System.out.print(" Digite o número que sera dado como ocorrência:  ");
        int occurrence = in.nextInt();


        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(occurrence == matriz[i][j]) {
                    System.out.printf("Posição do número  %d  é :  " + i + " , " + j + " : \n", occurrence);
                    if(j > 0) {
                        System.out.println("O Número a ESQUERDA é: " + matriz[i][j - 1]);
                    }
                    if(i > 0) {
                        System.out.println("O Número a SUPERIOR é: " + matriz[i - 1][j]);
                    }
                    if(j < matriz[i].length - 1) {
                        System.out.println("O Número a DIREITA é: " + matriz[i][j + 1]);
                    }
                    if(i < matriz[i].length - 1) {
                        System.out.println("O Número a INFERIOR é: " + matriz[i + 1][j]);
                    }
                }
            }
        }
        in.close();
    }
}
