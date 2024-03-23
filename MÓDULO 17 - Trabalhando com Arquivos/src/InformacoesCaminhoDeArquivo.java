import java.io.File;
import java.util.Scanner;

public class InformacoesCaminhoDeArquivo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o caminho do arquivo | Enter the file path: ");
        String filePath = scan.nextLine();

        File path = new File(filePath);

        System.out.println(" Nome do Arquivo | getName:   " + path.getName());          // Retorna somente o nome do arquivo
        System.out.println(" Caminho do Arquivo | getParent:   " + path.getParent());   // Retorna o caminho do arquivo
        System.out.println(" Caminho Completo | getPath:   " + path.getPath());         // Retorna o caminho Completo

        scan.close();
    }
}
