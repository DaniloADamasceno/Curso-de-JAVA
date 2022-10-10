package Sem_Generics.app;

import Sem_Generics.services.CalculationService;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Generics.entities.Product;

public class Sem_GenericsDelimitados {

  public static void main(String[] args) throws IOException {
    /*
            Uma empresa de consultoria deseja avaliar a performance de produtos,funcionários, dentre outras coisas.
        Um dos cálculos que ela precisa é encontrar o maior dentre um conjunto de elementos. 
            Fazer um programa que leia um conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
        mostre o mais caro deles
         */

    List< Product> list = new ArrayList<>();

    String path =
      "D:\\Danilo A. Damasceno\\Desktop\\JavaScript e JAVA\\JAVA\\Modulos 17 a 20\\Curso-de-JAVA\\MÓDULO 19 - Generics , Set e Map\\Generics Delimitados\\arc\\Exemplo-Generics-Delimitados.txt";

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
