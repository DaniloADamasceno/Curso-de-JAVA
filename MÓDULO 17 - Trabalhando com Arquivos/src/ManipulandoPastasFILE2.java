import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasFILE2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o caminho da pasta: ");
        String stringPath = scan.nextLine();

        File path = new File(stringPath);                               // A variável path pode ser tanto o caminho de um arquivo ou de uma pasta

        //%% -->Para Mostrar as Pastas
        File[] folders = path.listFiles(File::isDirectory);                 // Criando um vetor de arquivos e passando o caminho da pasta e o método isDirectory para verificar se é uma pasta

        //%% --> para mostrar a lista de todas as pastas existentes no caminho do diretório informado
        System.out.println("PASTAS | folders:");
        System.out.println(); // Quebra de linha
        for (File folder : folders != null ? folders : new File[0]) {
            System.out.println(folder);
        }

        //%% --> Para Mostrar os Arquivos
        File[] files = path.listFiles(File::isFile);                        // Criando um vetor de arquivos e passando o caminho da pasta e o método isFile para verificar se é um arquivo

        //%% --> para mostrar a lista de todas os Arquivos existentes no caminho do diretório informado
        System.out.println("ARQUIVOS | FILES:");
        System.out.println();
        for (File file : files) {
            System.out.println(files);
        }

        //%% --> Criando uma pasta dentro ddo caminho informado
        boolean pastaCriada = new File(stringPath + "\\pasta Criada no JAVA").mkdir(); // Criando uma pasta dentro da pasta informada
        System.out.println("Diretório Criando com sucesso | Directory creates successfully : " + pastaCriada);

        scan.close();
    }
}
