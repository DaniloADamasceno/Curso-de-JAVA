import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Exemplo2MAP {

    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product pro1 = new Product("SmartTV", 1900.00);
        Product pro2 = new Product("Notebook", 6200.00);
        Product pro3 = new Product("Tablet", 1400.00);
        Product pro4 = new Product("Alexa", 399.00);
        Product pro5 = new Product("Aspirador de Pó", 300.00);
        Product pro6 = new Product("Geladeira", 2700.00);
        Product pro7 = new Product("Fogão", 650.00);
        Product pro8 = new Product("Microondas", 500.00);

        stock.put(pro1, 2100.00);
        stock.put(pro2, 5200.00);
        stock.put(pro3, 1359.00);
        stock.put(pro4, 297.00);
        stock.put(pro5, 189.00);
        stock.put(pro6, 2348.00);

        Product ps = new Product("SmartTV", 1900.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
