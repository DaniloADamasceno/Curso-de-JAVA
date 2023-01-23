package predicate;

import predicate.entitiesPredicate.Product;
import predicate.utilPredicate.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

/*
 Fazer um pograma que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço mínimo seja 100.
 */
public class ProgramPredicate {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Televisão", 2200.00));
        list.add(new Product("Notebook", 3800.00));
        list.add(new Product("Tablet", 1400.00));
        list.add(new Product("Mouse", 89.00));
        list.add(new Product("HD Case", 87.90));
        list.add(new Product("Fone de Ouvido 'Boqueta'", 57.90));
        list.add(new Product("Teclado", 49.99));
        list.add(new Product("Impressora", 509.00));

        //--------------------------------   Utilizando removeIf()   ---------------------------------------------------
        System.out.println("  <<< -----------------------------------------------------------------  Espresão Lambda:");
        list.removeIf(product -> product.getPrice() >= 100.00);            // Remove da lista somente os produtos cujo preço seja maior ou igual a 100
        for (Product product : list) {
            System.out.println(product);
        }
        System.out.println();                                             // Quebra de linha
        System.out.println(" <<< ---------------------------------- >>> ");
        //--------------------------------   Utilizando Predicate   ----------------------------------------------------
        System.out.println("  <<< -------------------------------------------------------------  Interface PREDICATE:");
        list.removeIf(new ProductPredicate());                            // Remove da lista somente os produtos cujo preço seja maior ou igual a 100
        for (Product product : list) {
            System.out.println(product);
        }
        System.out.println();                                             // Quebra de linha
        System.out.println(" <<< ---------------------------------- >>> ");
        //------------------------------------   Utilizando o Metodo Estático   ------------------------------------------
        System.out.println("  <<< -----------------------------------------------------------------  Metodo Estático:");
        list.removeIf(Product::staticProductPredicate);
        for (Product product : list) {
            System.out.println(product);
        }
        System.out.println();                                             // Quebra de linha
        System.out.println(" <<< ---------------------------------- >>> ");
        //------------------------------------   Utilizando o Metodo Não Estático   ------------------------------------
        System.out.println("  <<< -------------------------------------------------------------  Metodo Não Estático:");
        list.removeIf(Product::naoStaticProductPredicate);
        for (Product product : list) {
            System.out.println(product);
        }
        System.out.println();                                             // Quebra de linha
        System.out.println(" <<< ---------------------------------- >>> ");
        //------------------------------------   Expressão Lambda Declarada   ------------------------------------------
        System.out.println("  <<< ------------------------------------------------------- Expressão Lambda Declarada:");
        double valueMinimo = 100.00;
        Predicate<Product> predi = lambdaDeclarado -> lambdaDeclarado.getPrice() >= valueMinimo;
        list.removeIf(predi);
        for (Product lambdaDeclarado : list) {
            System.out.println(lambdaDeclarado);
        }
        System.out.println();                                             // Quebra de linha
        System.out.println(" <<< ---------------------------------- >>> ");

        //------------------------------------   Expressão Lambda Inline   ----------------------------------------------
        System.out.println("  <<< ---------------------------------------------------------- Expressão Lambda Inline:");
        double valueMinimo2 = 100.00;
        list.removeIf((lambdaInLine) -> lambdaInLine.getPrice() >= valueMinimo2);
        for (Product lambdaInLine :list) {
            System.out.println(lambdaInLine);
        }


    }
}
