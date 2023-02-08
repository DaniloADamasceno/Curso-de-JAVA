import java.io.File; // Importa a classe File
import java.io.IOException; // Importa a classe IOException
import java.util.Scanner;

public class FILE_Ler_arquivos_de_texto {

  public static void main(String[] args) {
    //*------------- Para Importar um arquivo do tipo texto
    File file = new File(
      "D:\\Danilo A. Damasceno\\Desktop\\JavaScript e JAVA\\JAVA\\Modulos 17 a 20\\MÓDULO 17 - Trabalhando com Arquivos\\assets\\arquivo.txt"
    );

    try (Scanner scan = new Scanner(file)) {
      while (scan.hasNextLine()) { // Testar se ainda existe uma nova linha no arquivo
        System.out.println(scan.nextLine());
      }
    } catch (IOException e) { // Tratamento de erro na leitura do arquivo
      System.out.println("ERROR:  " + e.getMessage());
    }
  }
}
