package dataBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DataBaseDAO {

    private static Connection conn = null;

    //%% Conectar com o banco de dados
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DataBaseExceptionDAO(e.getMessage());
            }
        }
        return conn;
    }

    //%% Fechar a Conexão com o banco de dados
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DataBaseExceptionDAO(e.getMessage());
            }
        }
    }

    //%% Carregar as propriedades do arquivo db.properties
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream(
                "MÓDULO 21 - Banco de Dados com JDBC/db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DataBaseExceptionDAO(e.getMessage());
        }
    }

    //%% Fechar o Statement
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DataBaseExceptionDAO(e.getMessage());
            }
        }
    }

    //%% Fechar o ResultSet
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DataBaseExceptionDAO(e.getMessage());
            }
        }
    }
}
