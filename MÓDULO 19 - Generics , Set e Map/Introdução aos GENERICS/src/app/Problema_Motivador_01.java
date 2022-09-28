package app;

import java.util.Scanner;
//import services.PrintService;
import services.PrintService_Obj;

public class Problema_Motivador_01 {

  public static void main(String[] args) throws Exception {
    /*
            Fazer um programa que leia uma quantidade N, e depois N números inteiros. 
        Ao final, imprima esses números de forma organizada conforme exemplo.
        Em seguida, informar qual foi o primeiro valor informado.
         */

    Scanner scan = new Scanner(System.in);

    //PrintService printS = new PrintService(); //para uma lista de inteiros
    PrintService_Obj obj_print = new PrintService_Obj(); // para uma lista com Objects

    System.out.print("How many values? || Quantos valores?  ");
    int values = scan.nextInt();

    obj_print.addValue("Miguel"); // para add uma String na lista
    for (int i = 0; i < values; i++) {
      Integer value = scan.nextInt();
      obj_print.addValue(value); // add este valor no obj_pri (PrintService) usando o método addValue
    }

    obj_print.print();
    Integer x = (Integer) obj_print.first(); // Tem que fazer o cast para Integer, pois o método first retorna um Objects
    System.out.println("First || Primeiro : " + x); // imprime o primeiro valor da lista

    System.out.println(); // Quebra de linha
    scan.close();
  }
}
// Da uma exceção pois o método first() retorna um Object, e não um Integer e ele não pode converter um Object em Integer
