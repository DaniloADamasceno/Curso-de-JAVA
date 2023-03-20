package application;

import dataBase.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        System.out.println("Testing connection with database... ");

        Connection conn = DB.getConnection();                         // criando a conexão com o banco de dados
        DB.closeConnection();                                         // fechando a conexão com o banco de dados
        System.out.println();
        System.out.println();
        System.out.println("Database connection successful!");

    }
}