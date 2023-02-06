package application;

import database.DBDelete;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing connection with database... 🚮 JDBC - DELETANDO 🚮 Dados no DB ");

        Connection conn = DBDelete.getConnection();                 // criando a conexão com o banco de dados
        DBDelete.closeConnection();                                 // fechando a conexão com o banco de dados
        System.out.println();
        System.out.println();
        System.out.println("Databas" +
                "e connection successful!");

    }
}