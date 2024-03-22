package application;

import dataBase.DataBase;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        System.out.println("Testing connection with database... ");

        Connection conn = DataBase.getConnection();                         // criando a conexão com o banco de dados
        DataBase.closeConnection();                                         // fechando a conexão com o banco de dados
        System.out.println();
        System.out.println();
        System.out.println("Database connection successful!");

    }
}