package predicate;

import predicate.entitiesPredicate.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

/*
 Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço mínimo seja 100.
 */
public class ProgramPredicate {

    public static void main(String[] args) {

        //%% Lista de produtos
        Locale.setDefault(Locale.US);
        List<ProductPredicate> list = new ArrayList<>();
        list.add(new ProductPredicate("Televisão", 2200.00));
        list.add(new ProductPredicate("Notebook", 3800.00));
        list.add(new ProductPredicate("Tablet", 1400.00));
        list.add(new ProductPredicate("Mouse", 89.00));
        list.add(new ProductPredicate("HD Case", 87.90));
        list.add(new ProductPredicate("Fone de Ouvido 'Boqueta'", 57.90));
        list.add(new ProductPredicate("Teclado", 49.99));
        list.add(new ProductPredicate("Impressora", 509.00));

        for (ProductPredicate productListPredicated : list) {
            System.out.println("Lista de Produtos Cadastrados: " + productListPredicated);
        }
        System.out.println();                                             // Quebra de linha

        //^^--------------------------------   Utilizando removeIf()   -------------------------------------------------
        System.out.println("  <<< -----------------------------------------------------------  Utilizando removeIf():");
        list.removeIf(product -> product.getPrice() >= 100.00);            // Remove da lista somente os produtos cujo preço seja maior ou igual a 100
        for (ProductPredicate product : list) {
            System.out.println(product);
        }
        System.out.println();                                             // Quebra de linha

        //^^--------------------------------   Utilizando Predicate   --------------------------------------------------
        System.out.println("  <<< -------------------------------------------------------------  Interface PREDICATE:");
        list.removeIf(new predicate.utilPredicate.ProductPredicate());      // Remove da lista somente os produtos cujo preço seja maior ou igual a 100
        for (ProductPredicate product : list) {
            System.out.println(product);
        }
        System.out.println();                                             // Quebra de linha

        //^^------------------------------------   Utilizando o Método Estático   --------------------------------------
        System.out.println("  <<< -----------------------------------------------------------------  Método Estático:");
        list.removeIf(ProductPredicate::staticProductPredicate);
        for (ProductPredicate product : list) {
            System.out.println(product);
        }
        System.out.println();                                             // Quebra de linha

        //^^------------------------------------   Utilizando o Método Não Estático   ----------------------------------
        System.out.println("  <<< -------------------------------------------------------------  Método Não Estático:");
        list.removeIf(ProductPredicate::naoStaticProductPredicate);
        for (ProductPredicate product : list) {
            System.out.println(product);
        }
        System.out.println();                                             // Quebra de linha
        System.out.println(" <<< --------------------------------- >>> ");
        //------------------------------------   Expressão Lambda Declarada   ------------------------------------------
        System.out.println("  <<< ------------------------------------------------------- Expressão Lambda Declarada:");
        double minimumValue = 100.00;
        Predicate<ProductPredicate> productPredicatePredicate = lambdaDeclarado -> lambdaDeclarado.getPrice() >= minimumValue;
        list.removeIf(productPredicatePredicate);
        for (ProductPredicate lambdaDeclarado : list) {
            System.out.println(lambdaDeclarado);
        }
        System.out.println();                                             // Quebra de linha

        //^^------------------------------------   Expressão Lambda Inline   -------------------------------------------
        System.out.println("  <<< ---------------------------------------------------------- Expressão Lambda Inline:");
        double minimumValue2 = 100.00;
        list.removeIf((lambdaInLine) -> lambdaInLine.getPrice() >= minimumValue2);
        for (ProductPredicate lambdaInLine :list) {
            System.out.println(lambdaInLine);
        }


    }
}
