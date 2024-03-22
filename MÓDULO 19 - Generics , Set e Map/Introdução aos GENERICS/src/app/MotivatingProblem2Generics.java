package app;

import services.PrintServiceGenerics;

import java.util.Scanner;

public class MotivatingProblem2Generics {

    public static void main(String[] args) throws Exception {
    /*
            Fazer um programa que leia uma quantidade N, e depois N números inteiros. 
        Ao final, imprima esses números de forma organizada conforme exemplo.
        Em seguida, informar qual foi o primeiro valor informado.
         */

        Scanner scan = new Scanner(System.in);

        PrintServiceGenerics<Integer> genericsPrint = new PrintServiceGenerics<>(); // para lista com Generics

        System.out.print("How many values? || Quantos valores?  ");
        int values = scan.nextInt();

        for (int i = 0; i < values; i++) {
            Integer value = scan.nextInt();
            genericsPrint.addValue(value); // add este valor no obj_pri (PrintService) usando o método addValue
        }

        genericsPrint.print();
        Integer x = genericsPrint.first(); // Sem a necessidade de dar um Cast, pois o método first retorna um Integer
        System.out.println("First || Primeiro : " + x); // imprime o primeiro valor da lista

        System.out.println(); // Quebra de linha
        scan.close();
    }
}
// Retorna exceção pois o método first() retorna um Object, e não um Integer e ele não pode converter um Object em Integer
