package consumer;

import consumer.entitiesConsumer.ProductConsumer;
import consumer.utilConsumer.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ProgramConsumer {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("------------   Lista de Produtos   ------------");
        List<ProductConsumer> list = new ArrayList<>();
        list.add(new ProductConsumer("Televisão", 2200.00));
        list.add(new ProductConsumer("Notebook", 3800.00));
        list.add(new ProductConsumer("Tablet", 1400.00));
        list.add(new ProductConsumer("Mouse", 89.00));
        list.add(new ProductConsumer("HD Case", 87.90));
        list.add(new ProductConsumer("Fone de Ouvido 'Boqueta'", 57.90));
        list.add(new ProductConsumer("Teclado", 49.99));
        list.add(new ProductConsumer("Impressora", 509.00));

        list.forEach(System.out::println);
        System.out.println();

        //^^----------------------------------   Implementando a INTERFACE CONSUMER   ----------------------------------
        System.out.println("------------   Interface CONSUMER   ------------");

        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();

        //^^----------------------------------   Método Estático   -----------------------------------------------------
        System.out.println("------------   Método Estático   ------------");
        System.out.println("------------    + 10% de Aumento após Interface CONSUMER   ------------");
        list.forEach(ProductConsumer::staticPriceUpdate);
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();

        //^^--------------------------------   Método Não Estático   ---------------------------------------------------
        System.out.println("------------   Método NÃO Estático   ------------");
        System.out.println("------------    + 10% de Aumento após Método Estático   ------------");
        list.forEach(ProductConsumer::naoStaticPriceUpdate);
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();
        //^^----------------------------------   Expressão Lambda Declarada   ------------------------------------------
        System.out.println("------------   Método Lambda Declarada   ------------");
        System.out.println("------------    + 25% de Aumento após Método Não Estático   ------------");
        double percentIncrease25 = 1.25;                                                                    // 25% de aumento
        Consumer<ProductConsumer> consumer = productConsumer -> productConsumer.setPrice(productConsumer.getPrice() * percentIncrease25);
        list.forEach(consumer);
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();

        //^^--------------------------------   Expressão Lambda InLine   -----------------------------------------------
        System.out.println("------------   Método Lambda InLine   ------------");
        System.out.println("------------    + 50% de Aumento após Método Lambda Declarada   ------------");
        double percentIncrease50 = 1.5;                                                                    // 50% de aumento
        list.forEach(productConsumer -> productConsumer.setPrice(productConsumer.getPrice() * percentIncrease50));
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();
    }
}
