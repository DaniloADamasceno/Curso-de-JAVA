package application;

import db.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! #01.1 ");

        Connection conn = DB.getConnection();                 // criando a conexão com o banco de dados
        DB.closeConnection();                                         // fechando a conexão com o banco de dados

        System.out.println("------");

    }
}