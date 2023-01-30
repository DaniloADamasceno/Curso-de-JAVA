package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection conn = null;
    //----------------------------------------   Methods   -------------------------------------------------------------
    public static Connection getConnection() {                                          // método para conectar com o banco de dados
        if (conn == null) {
            try {
                Properties props = loadProperties();                           // pegando as propriedades do arquivo db.properties
                String url = props.getProperty("dburl");                       // pegando a url do arquivo db.properties
                conn = DriverManager.getConnection(url, props);          // criando a conexão com o banco de dados
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    private static Properties loadProperties() {  // método para carregar as propriedades do arquivo db.properties
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException err) {
            throw new DbException(err.getMessage());

        }
    }




    public static void closeConnection() { // método para fechar a conexão com o banco de dados
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }



}
