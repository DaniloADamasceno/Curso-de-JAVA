package app;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo2 {

    public static void main(String[] args){

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10,12,14,16,18,21));
        Set<Integer> b = new TreeSet<>(Arrays.asList(1,3,5,7,8,11,12,15,16,19,20));

        //-----------------------------------------    União   --------------------------------------------
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //-----------------------------------------   Intersecção   ---------------------------------------
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //-----------------------------------------   Diferença   -----------------------------------------
        Set<Integer> e = new TreeSet<>(a);
        e.retainAll(b);
        System.out.println(e);
    }
}
