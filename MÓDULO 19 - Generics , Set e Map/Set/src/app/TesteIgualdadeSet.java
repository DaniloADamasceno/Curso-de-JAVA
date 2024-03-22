package app;

import entities.ProductSet;

import java.util.HashSet;
import java.util.Set;

public class TesteIgualdadeSet {

    public static void main(String[] args) {

        Set<ProductSet> set = new HashSet<>();

        set.add(new ProductSet("Televisão", 2.300));
        set.add(new ProductSet("Notebook", 4.500));
        set.add(new ProductSet("Celular", 6.800));
        set.add(new ProductSet("Som", 1.200));

        ProductSet product1 = new ProductSet("Notebook", 4.500);
        System.out.println("O Product1 ja foi criado anteriormente ?  " + set.contains(product1));
    }


}

