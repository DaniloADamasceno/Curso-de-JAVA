package application;

import entities.ProductTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TesteIgualdadeTreeSet {

        public static void main(String[] args) {
            Set<ProductTreeSet> set = new TreeSet<>();

            set.add(new ProductTreeSet("Televisão", 2.300));
            set.add(new ProductTreeSet("Notebook", 4.500));
            set.add(new ProductTreeSet("Celular", 6.800));
            set.add(new ProductTreeSet("Som", 1.200));

            for (ProductTreeSet prodTreeSet : set) {
                System.out.println(prodTreeSet);
            }




        }
}
