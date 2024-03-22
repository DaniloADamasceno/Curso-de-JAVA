public class Main {
    public static void main(String[] args) {

        // Equals
        // Método que compara o conteúdo de dois objetos, retornando se e/ou não falso

        String a = "Equals";
        String b = "HasCode";

        System.out.println(a.equals(b));                                                               // Método que compara elementos

        System.out.println();                                                                          //Quebra de linha
        System.out.println("----------------------------------------");

        // HasCode
        // Método que retorna um número inteiro representando um código gerado a partir das inforações do objeto

        String c = "EqualsHASCODE";
        String d = "HasCodeHASCODE";

        System.out.println("o HasCode de EqualsHASCODE é: " + c.hashCode());
        System.out.println("o HasCode de HasCodeHASCODE é: " +d.hashCode());

        System.out.println();                                                                          //Quebra de linha
        System.out.println("----------------------------------------");
        }
    }

