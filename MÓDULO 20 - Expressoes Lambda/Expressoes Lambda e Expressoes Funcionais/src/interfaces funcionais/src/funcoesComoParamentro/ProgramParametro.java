package funcoesComoParamentro;

import funcoesComoParamentro.entitiesParametro.ProductParametro;
import funcoesComoParamentro.modelServiceParamentro.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramParametro {

    /*
    Fazer um programa que, a patir de uma lista de produtos,
    Calcule a soma dos preços somente dos produtos cujo nome começa com a letra 'T'
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<ProductParametro> list = new ArrayList<>();

        list.add(new ProductParametro("Televisão", 1789.00));
        list.add(new ProductParametro("Mouse", 49.99));
        list.add(new ProductParametro("Tablet", 1149.99));
        list.add(new ProductParametro("HD Case", 79.90));
        list.add(new ProductParametro("Notebook", 3299.00));
        list.add(new ProductParametro("Desktop", 2550.00));
        list.add(new ProductParametro("Impressora", 299.00));
        list.add(new ProductParametro("MacBook AIR", 7899.00));
        list.add(new ProductParametro("Sound Bar", 789.00));
        list.add(new ProductParametro("Mouse PAD", 72.00));
        list.add(new ProductParametro("Teclado", 199.80));
        list.add(new ProductParametro("Monitor", 899.00));
        list.add(new ProductParametro("Headset", 299.30));
        list.add(new ProductParametro("Tabua de passar", 99.99));


        ProductService productService = new ProductService();
        double summ = productService.filteredSum(list, pParametro -> pParametro.getName().charAt(0) == 'H');

        System.out.println("Soma = " + String.format("%.2f", summ));
    }
}
