package dB;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBInsert {


    private static Connection connect = null;

    //^^----------------------------------------   Methods   -----------------------------------------------------------
    //%% Conectar com o banco de dados
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

    //%% Carregar as propriedades do arquivo db.properties
    private static Properties loadProperties() {
        try (FileInputStream fileInpStream = new FileInputStream(
                "MÓDULO 21 - Banco de Dados com JDBC/db.properties")) {
            Properties propsLoad = new Properties();
            propsLoad.load(fileInpStream);
            return propsLoad;
        } catch (IOException err) {
            throw new DbExceptionInsert(err.getMessage());
        }
    }

    //%% Fechar o Statement
    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new DbExceptionInsert(e.getMessage());
            }
        }
    }

    //%% Fechar o ResultSet
    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new DbExceptionInsert(e.getMessage());
            }
        }
    }

    //%% Fechar a Conexão com o banco de dados
    public static void closeConnection() {
        if (connect != null) {
            try {
                connect.close();
            } catch (SQLException e) {
                throw new DbExceptionInsert(e.getMessage());
            }
        }
    }
}


