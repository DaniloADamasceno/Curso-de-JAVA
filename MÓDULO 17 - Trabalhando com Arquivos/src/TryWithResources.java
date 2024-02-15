import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

  public static void main(String[] args) throws Exception {
    String arquivoDeTexto =
      "assets/FileWriter_BufferedWriter.txt";

    // NÃO PRECISA MAIS FECHAR O ARQUIVO, O JAVA FECHA AUTOMATICAMENTE O ARQUIVO
    // para que isso aconteça, é necessário que se declare o arquivo dentro do try
    try (
      BufferedReader bReader = new BufferedReader(
        new FileReader(arquivoDeTexto)
      )
    ) {
      String line = bReader.readLine();               // Lendo a primeira linha do arquivo

      while (line != null) {                          // ler enquanto a linha não for nula
        System.out.println(line);
        line = bReader.readLine();                    // Lendo a próxima linha do arquivo
      }
    } catch (IOException err) {
      System.out.println("ERROR: " + err.getMessage());
    }
  }
}
