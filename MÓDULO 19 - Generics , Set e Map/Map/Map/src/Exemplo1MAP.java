import java.util.Map;
import java.util.TreeMap;

public class Exemplo1MAP {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Snow");
        cookies.put("email", "snow@gmail.com");
        cookies.put("telefone", "99.99999-9999");
        cookies.put("endereço", "Rua do Dog, 1234");
        cookies.put("salario", "desempregado");
        cookies.put("raça", "vira-lata");

        cookies.remove("email");                                                                    // remove um elemento do Map pela chave
        cookies.put("telefone-secundario", "55.55555-5555");                                             // adiciona um elemento ao Map
        cookies.put("telefone-secundario", "33.22222-1111");                                             // Adiciona um elemento e sobrescreve o anterior

        System.out.println("Contains 'salario' cookies:  " + cookies.containsKey("salario"));       // retorna o tamanho do Map
        System.out.println("Contains 'endereço' cookies:  " + cookies.get("endereço"));                  // retorna o valor da Key passada como parâmetro
        System.out.println("Tamanho do Cookies:  " + cookies.size());                                    // retorna o tamanho do Map
        System.out.println();


        System.out.println("  ----->>> Todos os cookies:  <<<<-----");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));

        }


    }
}