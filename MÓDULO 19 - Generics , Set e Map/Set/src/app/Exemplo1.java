package app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();                                  // Muito Rápio, mas não e ordenado
        Set<String> set2 = new TreeSet<>();                                 // Mais lento, mas mantem a Ordem
        Set<String> set3 = new LinkedHashSet<>();                           // Não tão Rapido quanto o HasSet, mas Mantem a Ordem

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Alexa");
        set.add("Computador");
        set.add("Telefone");
        set.add("SmartTV");
        set.add("SmartWatch");

        set.remove("TV");                                               // Remove o Elemento
        set.removeIf(x -> x.length() >= 6);                        // Remove o Elemento que satisfaz a condição (onde o X tem que ser maior que 3)


        for (String ListSET : set) {
            System.out.println(ListSET);

            System.out.println();                                           // Quebra de Linha

        }
    }
}