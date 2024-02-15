import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterANDBufferedWriter {  // Classe responsável por criar um arquivo de texto


    public static void main(String[] args) {

        String[] lines = new String[]{"Bom dia", "Boa tarde", "Boa noite"};                         // Estanciando a String com os 3 valores

        // Caminho do arquivo de Texto a ser criado
        String path = "assets/FileWriter_BufferedWriter.txt";

        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(path))) {    // para criar um arquivo de texto do ZERO
            //try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(path, true))) { // Para criar um arquivo de texto que ja existe adicione TRUE
            for (String line : lines) {
                buffWriter.write(line);
                buffWriter.newLine();
            }
        } catch (IOException err) {
            err.printStackTrace();                                                                    // Imprimindo o erro
        }
    }
}