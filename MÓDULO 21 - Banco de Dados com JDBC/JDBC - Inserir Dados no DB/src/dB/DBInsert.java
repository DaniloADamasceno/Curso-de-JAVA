package dB;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBInsert {


    private static Connection connect = null;

    //----------------------------------------   Methods   -------------------------------------------------------------
    public static Connection getConnection() {                                 // método para conectar com o banco de dados
        if (connect == null) {
            try {
                Properties props = loadProperties();                           // pegando as propriedades do arquivo db.properties
                String url = props.getProperty("dburl");                       // pegando a url do arquivo db.properties
                connect = DriverManager.getConnection(url, props);       // criando a conexão com o banco de dados
            } catch (SQLException e) {
                throw new DbExceptionInsert(e.getMessage());
            }
        }
        return connect;
    }

    private static Properties loadProperties() {  // método para carregar as propriedades do arquivo db.properties
        try (FileInputStream fileInpStream = new FileInputStream("D:\\Danilo A. Damasceno\\Desktop\\JavaScript e JAVA\\JAVA\\Modulos 17 a 22\\Curso-de-JAVA\\MÓDULO 21 - Banco de Dados com JDBC\\db.properties")) {
            Properties propsLoad = new Properties();
            propsLoad.load(fileInpStream);
            return propsLoad;
        } catch (IOException err) {
            throw new DbExceptionInsert(err.getMessage());
        }
    }

    public static void closeStatment(Statement statement) { // método para fechar o statement
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new DbExceptionInsert(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) { // método para fechar o ResultSet
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new DbExceptionInsert(e.getMessage());
            }
        }
    }


    public static void closeConnection() { // método para fechar a conexão com o banco de dados
        if (connect != null) {
            try {
                connect.close();
            } catch (SQLException e) {
                throw new DbExceptionInsert(e.getMessage());
            }
        }
    }
}


