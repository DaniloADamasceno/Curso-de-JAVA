package steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 10, 7, 12, 15, 21, 17, 19, 16, 1, 9, 33, 45, 56, 25, 30, 48, 99);
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));  // o toArray() converte o stream em um array

        Stream<Double> stMap = list.stream().map(x -> x * 8.5);   // o map() aplica uma função a cada elemento do stream
        System.out.println(Arrays.toString(stMap.toArray()));


    }
}
