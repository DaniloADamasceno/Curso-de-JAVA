package app;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo2 {

    public static void main(String[] args){

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10,12,14,16,18,21));
        Set<Integer> b = new TreeSet<>(Arrays.asList(1,3,5,7,8,11,12,15,16,19,20));

        System.out.println("Conjunto de números A: " + a);
        System.out.println("Conjunto de números B: " + b);
        System.out.println(); // Quebra de linha

        //^^-----------------------------------------    União   --------------------------------------------
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("Conjuntos de números com União entre A e B" + c);

        //^^-----------------------------------------   Intersecção   ---------------------------------------
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("Conjunto de números com Intersecção entre A e B" +d);

        //^^-----------------------------------------   Diferença   -----------------------------------------
        Set<Integer> e = new TreeSet<>(a);
        e.retainAll(b);
        System.out.println("Conjunto de números com Diferença entre A e B" + e);
    }
}
