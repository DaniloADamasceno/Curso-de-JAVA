package app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo1 {
    public static void main(String[] args) {

        Set<String> setOriginalList = new HashSet<>();                      // Muito Rápido, mas não e ordenado
        Set<String> treeSetList = new TreeSet<>();                          // Mais lento, mas mantém a Ordem
        Set<String> linkedHashSetList = new LinkedHashSet<>();              // Não tão Rápido quanto o HasSet, mas Mantém a Ordem

        setOriginalList.add("TV");
        setOriginalList.add("Notebook");
        setOriginalList.add("Tablet");
        setOriginalList.add("Alexa");
        setOriginalList.add("Computador");
        setOriginalList.add("Telefone");
        setOriginalList.add("SmartTV");
        setOriginalList.add("SmartWatch");

        setOriginalList.forEach(System.out::println);                         // Imprime a Lista

        setOriginalList.remove("TV");                                              // Remove o Elemento
        setOriginalList.removeIf(x -> x.length() >= 6);                        // Remove o Elemento que satisfaz a condição (onde o X tem que ser maior que 3)


        for (String ListSET : setOriginalList) {
            System.out.println(ListSET);
            System.out.println();                                           // Quebra de Linha
        }
    }
}