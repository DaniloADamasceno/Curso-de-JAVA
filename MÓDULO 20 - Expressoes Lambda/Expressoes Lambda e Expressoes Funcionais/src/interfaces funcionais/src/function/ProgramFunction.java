package function;


import function.entitiesFunction.ProductFunction;
import function.utilFunction.UperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProgramFunction {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<ProductFunction> list = new ArrayList<>();
        list.add(new ProductFunction("Televisão", 2200.00));
        list.add(new ProductFunction("Notebook", 3800.00));
        list.add(new ProductFunction("Tablet", 1400.00));
        list.add(new ProductFunction("Mouse", 89.00));
        list.add(new ProductFunction("HD Case", 87.90));
        list.add(new ProductFunction("Fone de Ouvido 'Boqueta'", 57.90));
        list.add(new ProductFunction("Teclado", 49.99));
        list.add(new ProductFunction("Impressora", 509.00));

        //----------------------------------   Implementando a INTERFACE FUNCTION   ------------------------------------
        System.out.println("------------   Interface CONSUMER   ------------");
        List<String> namesUprcase = list.stream().map(new UperCaseName()).collect(Collectors.toList());
        namesUprcase.forEach(System.out::println);
        System.out.println();

        //----------------------------------   Método Estatico   -------------------------------------------------------
        System.out.println("------------   Metodo Estatico   ------------");
        List<String> namesEstatico = list.stream().map(ProductFunction::staticUperCaseName).collect(Collectors.toList());
        namesEstatico.forEach(System.out::println);
        System.out.println();

        //----------------------------------   Método Não Estatico   ---------------------------------------------------
        System.out.println("------------   Metodo NÃO Estatico   ------------");
        List<String> namesNaoEstatic = list.stream().map(ProductFunction::naoStaticUperCaseName).collect(Collectors.toList());
        namesNaoEstatic.forEach(System.out::println);
        System.out.println();

        //----------------------------------   Expressão Lambda Declarada   --------------------------------------------
        System.out.println("------------   Metodo Lambda Declarada   ------------");
        List<String> namesLambda =list.stream().map(ProductFunction -> ProductFunction.getName().toUpperCase()).collect(Collectors.toList());
        namesLambda.forEach(System.out::println);
        System.out.println();

        //----------------------------------   Expressão Lambda InLine   -----------------------------------------------
        System.out.println("------------   Metodo Lambda InLine   ------------");
        List<String> namesLamndbaInLine = list.stream().map(pNameFunction -> pNameFunction.getName().toUpperCase()).collect(Collectors.toList());

        System.out.println();

    }
}