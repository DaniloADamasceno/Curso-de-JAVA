import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivosDeTexto {

    public static void main(String[] args) {

        //%%   Para Importar um arquivo do tipo texto
        File file = new File(
                "assets/arquivo de test.txt"
        );

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {                                  // Testar se ainda existe uma nova linha no arquivo
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {                                       // Tratamento de erro na leitura do arquivo
            System.out.println("ERROR:  " + e.getMessage());
        }
    }
}
