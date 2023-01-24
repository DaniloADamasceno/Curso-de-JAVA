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
        List<ProductConsumer> list = new ArrayList<>();
        list.add(new ProductConsumer("Televisão", 2200.00));
        list.add(new ProductConsumer("Notebook", 3800.00));
        list.add(new ProductConsumer("Tablet", 1400.00));
        list.add(new ProductConsumer("Mouse", 89.00));
        list.add(new ProductConsumer("HD Case", 87.90));
        list.add(new ProductConsumer("Fone de Ouvido 'Boqueta'", 57.90));
        list.add(new ProductConsumer("Teclado", 49.99));
        list.add(new ProductConsumer("Impressora", 509.00));

        //----------------------------------   Implementando a INTERFACE CONSUMER   ------------------------------------
        System.out.println("------------   Interface CONSUMER   ------------");

        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();

        //----------------------------------   Método Estatico   -------------------------------------------------------
        System.out.println("------------   Metodo Estatico   ------------");
        list.forEach(ProductConsumer::staticPriceUpdate);
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();
        //----------------------------------   Método Não Estatico   ---------------------------------------------------
        System.out.println("------------   Metodo NÃO Estatico   ------------");
        list.forEach(ProductConsumer::naoStaticPriceUpdate);
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();
        //----------------------------------   Expressão Lambda Declarada   --------------------------------------------
        System.out.println("------------   Metodo Lambda Declarada   ------------");
        double percIncrease = 1.25;                                                                    // 25% de aumento
        Consumer<ProductConsumer> consumer = productConsumer -> productConsumer.setPrice(productConsumer.getPrice() * percIncrease);
        list.forEach(consumer);
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();
        //----------------------------------   Expressão Lambda InLine   -----------------------------------------------
        System.out.println("------------   Metodo Lambda InLine   ------------");
        double percIncrease2 = 1.5;                                                                    // 50% de aumento
        list.forEach(productConsumer -> productConsumer.setPrice(productConsumer.getPrice() * percIncrease2));
        list.forEach(System.out::println);
        System.out.println();
        System.out.println();
    }
}
