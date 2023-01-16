package exemplos;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioResolvido1 {
    /*
        Um Site de ‘internet’ registra um log. de acesso dos seus ususarios.
        Um registro de log. consiste no nome de usuário (apenas uma palavra)
     e o instante em que o usuario acessou o site no formato ‘DD/MM/YYYY HH:MM:SS’ (ISO 8601).
        Fazer um programa que leia o log. de acessos a partir de um arquivo, e depois informe quanto usuarios distintos acessaram o site.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file full path / Digite o nome do arquivo: ");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();

            String line = bufferedReader.readLine();                                                                    // Lê a primeira linha do arquivo
            while (line != null) {                                                                                      // Enquanto a linha não for nula
                String[] fields = line.split(" ");                                                               // Separa os campos da linha
                String username = fields[0];                                                                            // Pega o primeiro campo
                Date moment = Date.from(Instant.parse(fields[1]));                                       // Pega o segundo campo o campo da Data

                set.add(new LogEntry(username, moment));                                                                // Adiciona o usuário no Set

                line = bufferedReader.readLine();                                                                       // Lê a próxima linha
            }

            System.out.println("Total users: / Total de Usuários: " + set.size());
        } catch (IOException e) {
            System.out.println("ERROR : " + e.getMessage());
        }
        scanner.close();
        System.out.println();                                                                                           // Quebra de linha
    }
}

