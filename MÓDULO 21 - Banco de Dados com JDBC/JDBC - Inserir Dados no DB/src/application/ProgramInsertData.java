package application;

import dB.DBInsert;
import java.sql.PreparedStatement;

import java.sql.*;


public class ProgramInsertData {
    public static void main(String[] args) {

        System.out.println("Testing connection with database... INSERT DATA ");

        Connection connect = null;                                          // objeto para conectar com o banco de dados
        PreparedStatement preparedStatement = null;                         // objeto para executar comandos SQL

        try{
            connect = DBInsert.getConnection();                             // criando a conexão com o banco de dados
            preparedStatement = connect.prepareStatement
                    ("INSERT INTO seller" + "(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                            "VALUES" + "(?, ?, ?, ?, ?)",                  // criando o objeto para executar comandos SQL
                    Statement.RETURN_GENERATED_KEYS);                       // criando o objeto para armazenar o resultado de uma consulta SQL
            preparedStatement.setString(1, "Ralfh");
            preparedStatement.setString(2, "Ralfh@Hotmail.com");
            preparedStatement.setDate(3,
                    new java.sql.Date(1992, 11, 13));
            preparedStatement.setDouble(4, 3359.9);
            preparedStatement.setInt(5, 3);

            //preparedStatement.executeUpdate();                             // executando o comando SQL

            int changedLines = preparedStatement.executeUpdate();         // executando o comando SQL
            if(changedLines > 0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                while(resultSet.next()){
                    int id = resultSet.getInt(1);
                    System.out.println("Done! Id / Pronto ID = " + id);
                }
            }
            else{
                System.out.println("No lines changed! No ID generated! / Nenhuma linha foi alterada! Nenhum ID foi gerado!");
            }


        } catch (SQLException err) {                                       // tratando erros
            err.printStackTrace();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        finally {                                                          // fechando a conexão com o banco de dados
            DBInsert.closeStatment(preparedStatement);
            DBInsert.closeConnection();
        }



        System.out.println();
        System.out.println();
        System.out.println("Database connection successful!");

    }
}