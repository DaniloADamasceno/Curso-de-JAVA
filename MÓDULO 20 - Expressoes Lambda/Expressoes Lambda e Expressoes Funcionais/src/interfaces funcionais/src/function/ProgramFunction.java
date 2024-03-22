package function;


import function.entitiesFunction.ProductFunction;
import function.utilFunction.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

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

        for (ProductFunction productListFunction : list) {
            System.out.println("Lista de TODOS os Produtos " + productListFunction);
        }

        //^^----------------------------------   Implementando a INTERFACE FUNCTION   ----------------------------------
        System.out.println("------------   Interface CONSUMER   ------------");
        List<String> namesUpperCase = list.stream().map(new UpperCaseName()).toList();
        namesUpperCase.forEach(System.out::println);
        System.out.println(); // Quebra de linha

        //^^----------------------------------   Método Estático   -----------------------------------------------------
        System.out.println("------------   Método Estático   ------------");
        List<String> namesStatic = list.stream().map(ProductFunction::staticUpperCaseName).toList();
        namesStatic.forEach(System.out::println);
        System.out.println(); // Quebra de linha

        //^^----------------------------------   Método Não Estático   -------------------------------------------------
        System.out.println("------------   Método NÃO Estático   ------------");
        List<String> namesNotStatic = list.stream().map(ProductFunction::naoStaticUpperCaseName).toList();
        namesNotStatic.forEach(System.out::println);
        System.out.println(); // Quebra de linha

        //^^----------------------------------   Expressão Lambda Declarada   ------------------------------------------
        System.out.println("------------   Método Lambda Declarada   ------------");
        Function<ProductFunction, String> functionLambdaDeclarada = p -> p.getName().toUpperCase();
        List<String> namesLambda = list.stream().map(functionLambdaDeclarada).toList();
        namesLambda.forEach(System.out::println);
        System.out.println(); // Quebra de linha

        //^^----------------------------------   Expressão Lambda InLine   ---------------------------------------------
        System.out.println("------------   Método Lambda InLine   ------------");
        List<String> namesLambdaInLine = list.stream().map(pNameFunction -> pNameFunction
                .getName().toUpperCase()).toList();

        System.out.println(); // Quebra de linha

    }
}