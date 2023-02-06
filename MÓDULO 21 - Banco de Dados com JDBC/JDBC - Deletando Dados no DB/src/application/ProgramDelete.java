package application;

import database.DBDelete;
import database.DbExceptionDelete;
import database.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProgramDelete {
    public static void main(String[] args) {
        System.out.println("Testing connection with database... 🚮 JDBC - DELETANDO 🚮 Dados no DB ");

        Connection connUpdate = null;
        PreparedStatement preStatment = null;

        try {
            connUpdate = DBDelete.getConnection();
            preStatment = connUpdate.prepareStatement(
                    "DELETE FROM Department "
                            + "WHERE "
                            + "(Id = ?)");
            preStatment.setInt(1, 4);

            int AffectedRows = preStatment.executeUpdate();                                  // retorna o número de linhas afetadas

            System.out.println(" Rows affected: /Linhas Afetadas pelo Update " + AffectedRows);

        } catch (SQLException errDelete) {
            throw new DbIntegrityException(errDelete.getMessage());
        } finally {                                                                         // fechando a conexão com o banco de dados
            DBDelete.closeStatment(preStatment);
            DBDelete.closeConnection();
        }

    }
}