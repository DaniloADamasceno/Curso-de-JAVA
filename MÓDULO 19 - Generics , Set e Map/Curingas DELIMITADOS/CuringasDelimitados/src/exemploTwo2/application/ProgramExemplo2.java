package exemploTwo2.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramExemplo2 {


    /*
     Fazer um método que copia os elements de uma lista para outra lista que pode ser mais genérica que a primeira

      List<Integer> myIntegers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> myDoubles = Arrays.asList(3.14, 5.35, 6.76);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myIntegers, myObjs);

        copy(myDoubles, myObjs);
     */
    public static void main(String[] args) {
        List<Integer> myIntegers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> myDoubles = Arrays.asList(3.14, 5.35, 6.76);
        List<Object> myObjs = new ArrayList<Object>();

        copyList(myIntegers, myObjs);
        System.out.println("Lista de INTEIROS:");
        printList(myObjs);

        System.out.println();                                                                            // Saltar linha

        copyList(myDoubles, myObjs);
        System.out.println("Lista de DOUBLE:");
        printList(myObjs);
    }

    //------------------
    //   Método
    //------------------
    // O método recebe uma lista de números e uma lista de objetos
    // O primeiro parámetro é uma lista de números que pode ser Integer, Double, Float, etc. e o segundo parámetro é uma lista de objetos
    public static void copyList(List<? extends Number> source,
                                List<? super Number> destiny) {
        destiny.addAll(source);
    }

    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.print(obj + "😜 ");
        }

        System.out.println();                                                                        // Saltar uma linha
    }
}
