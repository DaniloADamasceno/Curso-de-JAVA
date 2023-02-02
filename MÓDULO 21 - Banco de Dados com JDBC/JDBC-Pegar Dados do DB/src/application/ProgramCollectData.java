package application;

import dataBase.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgramCollectData {
    public static void main(String[] args) {

        System.out.println("Testing connection with database... COLLLECT DATA");

        Connection connect = null;                                          // objeto para conectar com o banco de dados
        Statement statement = null;                                         // objeto para executar comandos SQL
        ResultSet resultSet = null;                                         // objeto para armazenar o resultado de uma consulta SQL

        System.out.println();

        try{
            connect = DB.getConnection();                                   // criando a conexão com o banco de dados
            statement = connect.createStatement();                           // criando o objeto para executar comandos SQL
            resultSet = statement.executeQuery("SELECT * FROM department");  // criando o objeto para armazenar o resultado de uma consulta SQL

            while(resultSet.next()){
                System.out.println(resultSet.getInt("Id") + " >>> " + resultSet.getString("Name"));
            }
        } catch (SQLException err) {                                       // tratando erros
            err.printStackTrace();
        }
        finally {                                                          // fechando a conexão com o banco de dados
            DB.closeResultSet(resultSet);
            DB.closeStatment(statement);
            DB.closeConnection();


        }


        System.out.println();
        System.out.println();
        System.out.println("Database connection successful!");

    }
}

