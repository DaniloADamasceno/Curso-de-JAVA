package funcoesComoParamentro;

import funcoesComoParamentro.entitiesParametro.ProductParameter;
import funcoesComoParamentro.modelServiceParamentro.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramParametro {

    /*
    Fazer um programa que, a partir de uma lista de produtos,
    Calcule a soma dos preços somente dos produtos cujo nome começa com a letra 'T'
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Lista de 'Produtos Parâmetro'" + "\n");

        List<ProductParameter> list = new ArrayList<>();
        list.add(new ProductParameter("Televisão", 1789.00));
        list.add(new ProductParameter("Mouse", 49.99));
        list.add(new ProductParameter("Tablet", 1149.99));
        list.add(new ProductParameter("HD Case", 79.90));
        list.add(new ProductParameter("Notebook", 3299.00));
        list.add(new ProductParameter("Desktop", 2550.00));
        list.add(new ProductParameter("Impressora", 299.00));
        list.add(new ProductParameter("MacBook AIR", 7899.00));
        list.add(new ProductParameter("Sound Bar", 789.00));
        list.add(new ProductParameter("Mouse PAD", 72.00));
        list.add(new ProductParameter("Teclado", 199.80));
        list.add(new ProductParameter("Monitor", 899.00));
        list.add(new ProductParameter("Headset", 299.30));
        list.add(new ProductParameter("Tabua de passar", 99.99));

        for (ProductParameter pList : list) {
            System.out.println("Lista de 'Produtos Parâmetro'" + pList);
        }
        System.out.println(); // Quebra de linha


        ProductService productService = new ProductService();
        double sumProductParameter = productService.filteredSum(list,
                pParameter -> pParameter.getName().charAt(0) == 'H');

        System.out.println("Soma dos produtos que iniciam com a letra 'H' é de = " +"R$"+ String.format("%.2f", sumProductParameter));
    }
}
