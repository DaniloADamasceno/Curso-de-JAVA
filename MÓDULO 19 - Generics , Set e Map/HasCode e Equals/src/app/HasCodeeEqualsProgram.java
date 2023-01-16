package app;

import entities.Client;

public class HasCodeeEqualsProgram {
    public static void main(String[] args) {

        // Equals
        // Método que compara o conteúdo de dois objetos, retornando se e ou não falso

        String a = "Equals";
        String b = "HasCode";

        System.out.println(a.equals(b));                                                               // Metodo que compara elementos

        System.out.println();                                                                          //Quebra de linha
        System.out.println("----------------------------------------");

        // HasCode
        // Método que retorna um número inteiro representando um código gerado a partir das inforações do objeto

        String c = "EqualsHASCODE";
        String d = "HasCodeHASCODE";

        System.out.println("O HasCode de EqualsHASCODE da String 'c' é: " + c.hashCode());
        System.out.println("O HasCode de HasCodeHASCODE da String 'd' é: " +d.hashCode());

        System.out.println();                                                                          //Quebra de linha
        System.out.println("----------------------------------------");


        //-----------------------------------------------------------------------------------------------------------//

        Client client1 = new Client("Snow", "snow@email.java");
        Client client2 = new Client("Snow", "Nain@email.java");
        Client client3 = new Client("Snoopy", "Snoopy@email.java");

        System.out.println("O HasCode de Client #1 é:" + client1.hashCode());
        System.out.println("O HasCode de Client #2 é:" + client2.hashCode());
        System.out.println("O HasCode de Client #3 é:" + client3.hashCode());

        System.out.println(client1.equals(client2));
        System.out.println(client1.equals(client3));
        System.out.println(client2.equals(client3));





    }
}

