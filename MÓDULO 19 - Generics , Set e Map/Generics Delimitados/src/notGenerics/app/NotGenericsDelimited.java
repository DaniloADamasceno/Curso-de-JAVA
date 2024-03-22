package notGenerics.app;

import generics.entities.Product;
import generics.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NotGenericsDelimited {

    public static void main(String[] args) throws IOException {
    /*
            Uma empresa de consultoria deseja avaliar o desempenho de produtos, funcionários, dentre outras coisas.
        Um dos cálculos que ela precisa é encontrar o maior dentre um conjunto de elementos. 
            Fazer um programa que leia um conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
        mostre o mais caro deles
         */

        List<Product> list = new ArrayList<>();

        String path =
                "MÓDULO 19 - Generics , SET e MAP/Generics Delimitados/assets/Exemplo-Generics-Delimitados.txt";

        try (BufferedReader brReader = new BufferedReader(new FileReader(path))) {
            String line = brReader.readLine();

            while (line != null) {
                list.add(Integer.parseInt(line), null);
                line = brReader.readLine();
            }

            Product xMax = CalculationService.max(list);
            System.out.println("Max: || Máximo: " + xMax);
            System.out.println(xMax);
            System.out.println();// Quebra de linha
        }
    }
}
