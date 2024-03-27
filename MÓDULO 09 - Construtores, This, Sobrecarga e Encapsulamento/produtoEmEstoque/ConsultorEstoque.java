package produtoEmEstoque;

import java.util.Locale;
import java.util.Scanner;

public class ConsultorEstoque {

    public static void main(String[] args) {
    /*
        Fazer um programa para ler os dados de um produto em estoque (nome, preço e
        quantidade no estoque). Em seguida:
        
        • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
        estoque)
        • Realizar uma entrada no estoque e mostrar novamente os dados do produto
        • Realizar uma saída no estoque e mostrar novamente os dados do produto
        Para resolver este problema, você deve criar
        
        */
        Locale.setDefault(Locale.ENGLISH);
        Scanner Sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto");
        System.out.println();

        System.out.print("NOME:");
        String nameProduto = Sc.next();

        System.out.print("PREÇO:");
        double price = Sc.nextDouble();

        System.out.print("QUANTIDADE EM ESTOQUE:");
        int quantity = Sc.nextInt();
        System.out.println();

        produtoEmEstoque.entities.Produto produto = new produtoEmEstoque.entities.Produto(nameProduto, price, quantity);

        System.out.println("Informações do produto:     " + produto);
        System.out.println();

        System.out.print(" Quantidade a ser adicionada ao estoque:");
        int addStock = Sc.nextInt(); // receber novos valores de estoque
        produto.addQuantity(addStock);
        System.out.println();

        System.out.println("Dados atualizados do produto:     " + produto);
        System.out.println();

        System.out.print(" Quantidade a ser Removida do estoque");
        int removed = Sc.nextInt(); // receber novos valores de estoque
        produto.removeProducts(removed);
        System.out.println();

        System.out.println("Dados atualizados do produto:     " + produto);
        System.out.println();

        Sc.close();
    }
}
