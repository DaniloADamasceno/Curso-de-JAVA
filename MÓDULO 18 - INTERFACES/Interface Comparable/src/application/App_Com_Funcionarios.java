package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionarios;

public class App_Com_Funcionarios {

  public static void main(String[] args) throws Exception {
    /*
         Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por linha), 
         armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-losordenadamente na tela. 
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

    List<Funcionarios> list = new ArrayList<>();

    String path =
      "D:\\Danilo A. Damasceno\\Desktop\\JavaScript e JAVA\\JAVA\\Modulos 17 a 20\\Curso-de-JAVA\\Módulo 18 - INTERFACES\\Interface Comparable\\Texto_Teste_Funcionarios.csv";

    try (BufferedReader brReader = new BufferedReader(new FileReader(path))) {
      String funcionarioCSV = brReader.readLine();
      while (funcionarioCSV != null) {
        String[] fields = funcionarioCSV.split(","); // cria um vetor de strings separado por virgula
        list.add(new Funcionarios(fields[0], Double.parseDouble(fields[1])));
        funcionarioCSV = brReader.readLine();
      }

      Collections.sort(list);

      for (Funcionarios employee : list) {
        System.out.println(employee.getName() + ", " + employee.getSalary());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
