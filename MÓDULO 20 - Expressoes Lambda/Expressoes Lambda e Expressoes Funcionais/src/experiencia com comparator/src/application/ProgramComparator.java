package application;

import entities.Product;
import entities.MyComparator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramComparator {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1900.00));
        list.add(new Product("Notebook", 3200.00));
        list.add(new Product("Tablet", 1450.00));
        list.add(new Product("Mouse", 50.00));
        //---------------------------------------------------------
        //   Metodos disponiveis para chamar a classe Comparator
        //---------------------------------------------------------

        //---------------------------------- Implementação da Interface Comparator -------------------------------------
        list.sort(new MyComparator());              // Ordena a lista usando o método compare da classe myComparator

        System.out.println("------>>>   Com a Implementaçao da Classe myComparator:   <<<----------------------------");
        for (Product prod : list) {
            System.out.println(prod);
        }
        System.out.println();                                                                         // Quebra de linha
        //---------------------------------- Implementação de Classe Anonima -------------------------------------------
        Comparator<Product> compAnonima = new Comparator<>() {                        // Implementação de classe anonima
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };


        list.sort(compAnonima);                                 // Ordena a lista usando o método compare da classe anonima
        System.out.println("------------>>>   Com a Implementaçao da Classe Anonima   <<<----------------------------");

        for (Product prod : list) {
            System.out.println(prod);
        }
        System.out.println();                                                                         // Quebra de linha

        //---------------------------------- Implementação de Expressão Lambda -----------------------------------------

        Comparator<Product> compLambda = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort(compLambda);                                 // Ordena a lista usando o método compare da classe anonima
        System.out.println("------------>>>   Com a Implementaçao da Expressão Lambda   <<<--------------------------");

        for (Product prod : list) {
            System.out.println(prod);
        }
        System.out.println();                                                                         // Quebra de linha
        System.out.println("------------>>>   Com a Implementaçao da Expressão Lambda Resumida   <<<-----------------");
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        for (Product prod : list) {
            System.out.println(prod);
        }
    }
}


