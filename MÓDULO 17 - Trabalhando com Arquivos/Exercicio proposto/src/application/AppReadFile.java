package application;

import entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppReadFile {

    public static void main(String[] args) throws ParseException {
    /*
    Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. 
    Cada item possui um nome, preço unitário e quantidade, separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv",
    localizado em uma subpasta chamada "out" a partir da pasta original do arquivo de origem,
    contendo apenas o nome e o valor total para aquele item (preço unitário multiplicado pela quantidade), conforme exemplo.
    
    ---------Source FILE:-------------------|----------- Output File ( out/summary.csv)|---------------
                                            |
    TV LED,1290.99,1                        |               TV LED,R$1290.99
    Video-Game Chair,350.50,3               |               Video-Game Chair,R$1051.50
    Iphone X,900.00,2                       |               Iphone X,R$1800.00
    Samsung Galaxy 9,850.00,2               |               Samsung Galaxy 9,1700.00
                                            |   
    ________________________________________|__________________________________________________________
     */

        Locale.setDefault(Locale.US); // Definindo o padrão de localização para o US
        Scanner scan = new Scanner(System.in); // Instanciando o Scanner
        List<Product> list = new ArrayList<>(); // Instanciando a lista de produtos
        System.out.print(" Digite o Caminho do Arquivo | Enter the file path:   ");
        String filePath = scan.nextLine();

        File sourceFILE = new File(filePath);
        String sourceFolderString = sourceFILE.getParent(); // Pegando o caminho da pasta do arquivoDeTexto

        boolean success = new File(sourceFolderString + "\\Pagina Criada OUT").mkdir(); // Criando a pasta "out" dentro da pasta do arquivoDeTexto

        String targetFileString = sourceFolderString + "\\Pagina Criada OUT\\summary.csv"; // Criando o caminho do arquivo de saída

        try (BufferedReader buffReader = new BufferedReader(new FileReader(filePath))) {
            String itemCSV = buffReader.readLine();
            while (itemCSV != null) {
                String[] fields = itemCSV.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCSV = buffReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(targetFileString))) {
            for (Product item : list) {
                buffWriter.write(item.getName() + "," + String.format("%.2f", item.total()));
                buffWriter.newLine();
            }

            System.out.println(targetFileString + " CRIADO COM SUCESSO! | CREATED SUCCESSFULLY!");

        } catch (IOException err) {
            System.out.println("ERRO AO CRIAR O ARQUIVO | ERROR CREATING FILE: " + err.getMessage());
        }
    }
}
