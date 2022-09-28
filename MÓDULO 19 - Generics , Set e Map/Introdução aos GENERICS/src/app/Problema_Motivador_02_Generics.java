package app;

import java.util.Scanner;
import services.PrintService_Generics;

public class Problema_Motivador_02_Generics {

  public static void main(String[] args) throws Exception {
    /*
            Fazer um programa que leia uma quantidade N, e depois N números inteiros. 
        Ao final, imprima esses números de forma organizada conforme exemplo.
        Em seguida, informar qual foi o primeiro valor informado.
         */

    Scanner scan = new Scanner(System.in);

    PrintService_Generics<Integer> Generics_print = new PrintService_Generics<>(); // para lista com Generics

    System.out.print("How many values? || Quantos valores?  ");
    int values = scan.nextInt();

    for (int i = 0; i < values; i++) {
      Integer value = scan.nextInt();
      Generics_print.addValue(value); // add este valor no obj_pri (PrintService) usando o método addValue
    }

    Generics_print.print();
    Integer x = Generics_print.first(); // Sem a necessidade de dar um Cast, pois o método first retorna um Integer
    System.out.println("First || Primeiro : " + x); // imprime o primeiro valor da lista

    System.out.println(); // Quebra de linha
    scan.close();
  }
}
// Da uma exceção pois o método first() retorna um Object, e não um Integer e ele não pode converter um Object em Integer
