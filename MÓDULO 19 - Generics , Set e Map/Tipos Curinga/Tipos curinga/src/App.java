import java.util.Arrays;
import java.util.List;

public class App {


    /*
     Para utilizar os tipos curingas deve-se colocar o símbolo "?" no lugar do tipo genérico.
        Exemplo: List<? extends Product> list = new ArrayList<>();
        os tipos curingas são utilizados para permitir que uma classe trabalhe com tipos genéricos de formato desconhecido.

     */
    public static void main(String[] args) throws Exception {
    

    List<Integer> myInteiros = Arrays.asList(3, 12, 5, 122, 7);
    printList(myInteiros);

    System.out.println();// Quebra de linha
    List< String> myStrings = Arrays.asList("Miguel", "Snow", "Nina", "Flora");
    printList(myStrings);

    }
  

    //%% utilizando o tipo curinga ? para permitir que a classe trabalhe com tipos genéricos de formato desconhecido
    
  public static void printList(List<?> list) {
    for (Object obj1 : list) {
      System.out.println(obj1);
    }
  }
}
