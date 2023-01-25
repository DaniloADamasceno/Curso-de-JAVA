package steam;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 10, 7, 12, 15, 21, 17, 19, 16, 1, 9, 33, 45, 56, 25, 30, 48, 99);
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));  // o toArray() converte o stream em um array

        Stream<Double> stMap = list.stream().map(x -> x * 8.5);// o map() aplica uma função a cada elemento do stream
        System.out.println(Arrays.toString(stMap.toArray()));

        Stream<String> stringStream = Stream.of("Snow", "Snoop", "Malu", "Frederico", "Nina", "Maggie");
        System.out.println(Arrays.toString(stringStream.toArray()));

        Stream<Integer> stInteger = Stream.iterate(0, x -> x + 5); // o iterate() cria um stream infinito
        System.out.println(Arrays.toString(stInteger.limit(20).toArray())); // o limit() limita o tamanho do stream a 20 elementos

        //----------------------------------- Stream para gerar a sequencia de Fibonacci -------------------------------
        Stream<Long> streamFibonacci = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(streamFibonacci.limit(30).toArray()));


    }
}
