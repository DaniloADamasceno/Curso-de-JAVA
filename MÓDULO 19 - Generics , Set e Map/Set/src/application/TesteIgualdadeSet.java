package application;

import entities.Product;

import java.util.HashSet;
import java.util.Set;

public class TesteIgualdadeSet {

    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("Televisão", 2.300));
        set.add(new Product("Notebook", 4.500));
        set.add(new Product("Celular", 6.800));
        set.add(new Product("Som", 1.200));

        Product product1 = new Product("Notebook", 4.500);

        System.out.println("O Product1 ja foi criado anteriormente ?  " + set.contains(product1));
    }


}

