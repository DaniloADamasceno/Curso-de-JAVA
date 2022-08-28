import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_e_BufferedReader {

  public static void main(String[] args) throws Exception {
    String arquivoDeTexto =
      "D:\\Danilo A. Damasceno\\Desktop\\JavaScript e JAVA\\JAVA\\Modulos 17 a 20\\MÓDULO 17 - Trabalhando com Arquivos\\assets\\arquivo.txt";
    FileReader fReader = null; // FileReader é uma classe que lê arquivos de texto
    BufferedReader bReader = null; // BufferedReader é uma classe que lê arquivos de texto

    try {
      fReader = new FileReader(arquivoDeTexto); // Instanciando o FileReader para ler a arquivo
      bReader = new BufferedReader(fReader); // Instanciando o BufferedReader o fReader
      String line = bReader.readLine(); // Lendo a primeira linha do arquivo

      while (line != null) { // ler enquanto a linha não for nula
        System.out.println(line);
        line = bReader.readLine(); // Lendo a próxima linha do arquivo
      }
    } catch (IOException err) {
      System.out.println("ERROR: " + err.getMessage());
  } finally {
        try{
      if (fReader != null) {
        fReader.close();
      }
      if (bReader != null) {
        bReader.close();
      }
    }
    catch(IOException err){
     err.printStackTrace();
    }
  }
}
}
