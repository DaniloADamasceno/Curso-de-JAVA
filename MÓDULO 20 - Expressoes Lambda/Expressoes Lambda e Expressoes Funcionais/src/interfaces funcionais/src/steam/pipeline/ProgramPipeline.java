package steam.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramPipeline {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Integer> list = Arrays.asList(1, 2, 4, 6, 10, 7, 12, 5, 21, 17, 19, 16, 11, 9, 33, 47, 56, 25, 30, 48, 99);
        Stream<Double> st1 = list.stream().map(x -> x *2.5 );
        System.out.println(Arrays.toString(st1.toArray()));

        int somaStream = list.stream().reduce(0, (x, y) -> x + y); // o reduce() reduz o stream a um único valor
        System.out.println("Soma das Listas: " + somaStream);



        List<Double> newListPipeline = list.stream()
                .filter(x -> x % 2 == 0)                  // o filter() filtra os elementos do stream de acordo com uma condição || Pegar todos os elementos pares
                .map(x -> x * 2.5)                          // o map() aplica uma função a cada elemento do stream || Multiplicar cada elemento por 2.5
                .collect(Collectors.toList());           // o collect() coleta os elementos do stream e os armazena em uma lista || Armazenar os elementos em uma lista
        System.out.println(Arrays.toString(newListPipeline.toArray()));   // o toArray() converte o stream em um array
    }
}
