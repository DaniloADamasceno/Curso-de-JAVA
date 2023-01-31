package dataBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection connect = null;
    //----------------------------------------   Methods   -------------------------------------------------------------
    public static Connection getConnection() {                                 // método para conectar com o banco de dados
        if (connect == null) {
            try {
                Properties props = loadProperties();                           // pegando as propriedades do arquivo db.properties
                String url = props.getProperty("dburl");                       // pegando a url do arquivo db.properties
                connect = DriverManager.getConnection(url, props);       // criando a conexão com o banco de dados
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return connect;
    }

    private static Properties loadProperties() {  // método para carregar as propriedades do arquivo db.properties
        try (FileInputStream fileInpStream = new FileInputStream("D:\\Danilo A. Damasceno\\Desktop\\JavaScript e JAVA\\JAVA\\Modulos 17 a 22\\Curso-de-JAVA\\MÓDULO 21 - Banco de Dados com JDBC\\jdbc\\db.properties")) {
            Properties propsLoad = new Properties();
            propsLoad.load(fileInpStream);
            return propsLoad;
        } catch (IOException err) {
            throw new DbException(err.getMessage());

        }
    }




    public static void closeConnection() { // método para fechar a conexão com o banco de dados
        if (connect != null) {
            try {
                connect.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }



}
