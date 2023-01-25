package steam.exercicio;

import steam.exercicio.entitiesStream.ProductStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {
        /*
     Fazer um programa para ler os dados (nome, email e salário) de funcionários a partir de um arquivo em formato.csv.
     Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor fornecido pelo usuário.
     Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
         */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full file path:/ Entre com o caminho completo do arquivo: ");
        String path = scanner.nextLine();

        try (BufferedReader buffReader = new BufferedReader(new FileReader(path))) {
            List<ProductStream> list = new ArrayList<>();

            String line = buffReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new ProductStream(fields[0], Double.parseDouble(fields[1])));
                line = buffReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("🚩🚩Error:  " + e.getMessage());
        }

        scanner.close();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
