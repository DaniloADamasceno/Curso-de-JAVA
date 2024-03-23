package appDiamante;

import deviceDiamante.ConcretePrinter;
import deviceDiamante.ConcreteScanner;
import deviceDiamante.Multifuncional;

public class AppDiamante {

    public static void main(String[] args) throws Exception {

        System.out.println("--------------- >>>>> Herança Múltipla - Problema Diamante <<<<< ---------------");
        System.out.println();// Quebra de linha

        System.out.println("---------- >>>> Impressora <<<< ----------");
        ConcretePrinter printer = new ConcretePrinter("1052");
        printer.processDoc("My Letter || Minha Letra");
        printer.print("My Letter || Minha Letra");
        System.out.println(); // quebra de linha

        System.out.println("---------- >>>> Scanner <<<< ----------");
        ConcreteScanner scanner = new ConcreteScanner("2052");
        scanner.processDoc("My Email || Meu Email");
        System.out.println("Scan result || Resultado Scanner :  " + scanner.scan());
        System.out.println(); // quebra de linha

        System.out.println("---------- >>>> MULTIFUNCIONAL <<<< ----------");
        Multifuncional multifuncional = new Multifuncional("3052");
        multifuncional.processDoc("My dissertation || Minha Dissertação");
        multifuncional.print("My dissertation || Minha Dissertação");
        System.out.println("Scan result || Resultado Scanner :  " + multifuncional.scan());
        System.out.println(); // quebra de linha

    }
}
  

