import clientPensao.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Pensao {
    public static void main(String[] args) throws Exception {
        /*
            A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados
             pelos números 0 a 9.
        Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade "N"
        representando o número de estudantes que vão alugar quartos("N" pode ser de 1 a 10). Em seguida, registre o
        aluguel dos"N" estudantes.
             Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele
             escolheu(de 0 a 9).
        Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
        um relatório de todas as ocupações do pensionato, por ordem de quarto, conforme exemplo.
         */
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        Cliente[] vector = new Cliente[10]; //---- Vetor para a criação dos Quartos

        System.out.print(" Digite a quantidade de quartos a serem alugados:  ");
        int nQuarto = in.nextInt();

        for(int i = 0; i < nQuarto; i++) {
            System.out.println();
            System.out.print("Rent #" + i + ":");
            System.out.println();

            System.out.print("Nome do Cliente:  ");
            String name = in.next();

            System.out.print("Email:");
            String email = in.next();

            System.out.print("Número do quarto ----> Entre 0 e 9:  ");
            int room = in.nextInt();
            vector[room] = new Cliente(name, email, room); //---- vetor de armazenamento para os clientes 
        }

        System.out.println();
        System.out.println("Quartos ocupados:  ");
        for(int i = 0; i < 10; i++) {
            if(vector[i] != null) {
                System.out.println(i + ": " + vector[i]);
            }
        }
        in.close();
    }
}
