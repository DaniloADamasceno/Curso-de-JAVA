package application;

import db.DBUpdate;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing connection with database... 🆙 JDBC - Atualizando 🆙 Dados no DB ");

        Connection conn = DBUpdate.getConnection();                 // criando a conexão com o banco de dados
        DBUpdate.closeConnection();                                 // fechando a conexão com o banco de dados
        System.out.println();
        System.out.println();
        System.out.println("Databas" +
                "e connection successful!");

    }
}
