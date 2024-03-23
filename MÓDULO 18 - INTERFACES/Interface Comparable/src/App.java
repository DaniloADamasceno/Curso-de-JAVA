import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
    /*
         Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por linha), 
         armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los ordenadamente na tela.
         Nota: o caminho do arquivo pode ser informado "hardcode".
         
        Maria Brown
        Alex Green
        Bob Grey
        Anna White
        Alex Black
        Eduardo Rose
        William Red
        Marta Blue
        Alex Brown
         */

        List<String> list = new ArrayList<>();

        String path = "MÓDULO 18 - INTERFACES/Interface Comparable/src/assets/Texto_Teste.txt";

        try (BufferedReader brReader = new BufferedReader(new FileReader(path))) {

            String name = brReader.readLine();
            while (name != null) {
                list.add(name);
                name = brReader.readLine();
            }

            Collections.sort(list);

            for (String x : list) {
                System.out.println(x);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
