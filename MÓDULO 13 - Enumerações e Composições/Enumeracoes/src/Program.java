import entities.Pedidos;
import instituition.OrderStatus;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pedidos pedido = new Pedidos(1, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println("Pedidos: " + pedido);
        System.out.println();

        OrderStatus osOne = OrderStatus.DELIVERED; // instanciei o orderStatus do tipo entrega sem converter para string
        OrderStatus osTwo = OrderStatus.valueOf("DELIVERED"); // instanciei o orderStatus do tipo entrega convertendo ele para String com o VALUE_OF

        System.out.println(osOne);
        System.out.println(osTwo);
        sc.close();
    }
}
