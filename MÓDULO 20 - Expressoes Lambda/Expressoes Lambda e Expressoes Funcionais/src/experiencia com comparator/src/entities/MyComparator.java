package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {                                    // Recebe dois produtos e compara
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());                      // Retorna um inteiro
    }
}

