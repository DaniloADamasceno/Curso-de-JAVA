package application;

import db.DBUpdate;
import db.DbExceptionUpdate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProgramUpdate {
    public static void main(String[] args) {
        System.out.println("Testing connection with database... 🆙 JDBC - Atualizando 🆙 Dados no DB ");
        System.out.println();

        Connection connUpdate = null;
        PreparedStatement preStatment = null;

        try {
            connUpdate = DBUpdate.getConnection();
            preStatment = connUpdate.prepareStatement(
                    "UPDATE Seller "
                    + "SET BaseSalary = BaseSalary + ?"
                    + "WHERE "
                    + "(DepartmentId = ?)");

            preStatment.setDouble(1, 389);
            preStatment.setInt(2, 4);

            int AffectedRows = preStatment.executeUpdate();                                  // retorna o número de linhas afetadas
            System.out.println(" Rows affected: /Linhas Afetadas pelo Update " + AffectedRows);

        } catch (SQLException errUpdate) {
            throw new DbExceptionUpdate(errUpdate.getMessage());
        } finally {                                                                         // fechando a conexão com o banco de dados
            DBUpdate.closeStatement(preStatment);
            DBUpdate.closeConnection();
        }
    }
}
