package steam.exercicio;

import steam.exercicio.entitiesStream.ProductStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AppStream {

    public static void main(String[] args) {
        /*
              Fazer um programa para ler um conjunto de produtos a partir de um arquivo em formato .csv
        (suponha que exista pelo menos um produto).
              Em seguida mostrar o preço médio dos produtos.
        Depois, mostrar os nomes, em ordem decrescente, dos produtos que possuem preço inferior ao preço médio.
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

            //^^-----------------------------------   Calcula a média dos preços   -------------------------------------
            double medio = list.stream()
                                   .map(ProductStream::getPriceProductStream)    // para cada elemento da lista, pega o preço
                                   .reduce(0.0, Double::sum) / list.size(); // soma todos os preços e divide pela quantidade de elementos da lista
            System.out.println("Average price: / Preço médio: " + String.format("%.2f", medio));

            //^^---------------   Mostra os nomes dos produtos com preço inferior ao preço médio   ---------------------
            Comparator<String> comp = (x, y) -> x.toUpperCase().compareTo(y.toUpperCase());             // cria um comparador para ordenar a lista de forma decrescente
            List<String> names = list.stream()                                   // cria uma lista de ‘strings’
                    .filter(p -> p.getPriceProductStream() < medio)                // filtra os produtos com preço inferior ao preço médio
                    .map(ProductStream::getNameProductStream)                         // para cada elemento da lista, pega o nome
                    .sorted((x, y) -> y.compareTo(x))                 // ordena a lista de forma decrescente
                    .sorted(comp.reversed())                          // converte a lista para uma lista de ‘strings’
                    .toList();                                                   // converte a lista para uma lista de ‘strings’

            System.out.println("<<<--- Names of products with price less than average price: / Nomes dos produtos com preço inferior ao preço médio: --->>>");
            names.forEach(System.out::println);                                              // mostra os nomes dos produtos com preço inferior ao preço médio

        } catch (IOException err) {
            System.out.println("⚠️ ⚠️Error:  " + err.getMessage());
            throw new RuntimeException(err);
        }
        scanner.close();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
