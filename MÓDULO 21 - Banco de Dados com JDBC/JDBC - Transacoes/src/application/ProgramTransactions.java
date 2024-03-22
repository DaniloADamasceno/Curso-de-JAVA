package application;

import dataBASE.DBTransactions;
import dataBASE.DbExceptionTransactions;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgramTransactions {
    public static void main(String[] args) {
        System.out.println("Testing connection with database...  JDBC - TRANSAÇÕES de Dados no DB ");

        Connection connTrasaction = null;
        Statement StatmentTrans = null;

        //%% Atualizando o Salário Base dos Vendedores
        try {
            connTrasaction = DBTransactions.getConnection();
            connTrasaction.setAutoCommit(false);                                          // desabilitando o auto commit
            StatmentTrans = connTrasaction.createStatement();

            int row1One = StatmentTrans.executeUpdate("UPDATE seller SET BaseSalary = 4573 WHERE DepartmentId = 1");
            int row2Two = StatmentTrans.executeUpdate("UPDATE seller SET BaseSalary = 3125 WHERE DepartmentId = 2");
            connTrasaction.commit();

            System.out.println("Rows Affected: / Linhas afetadas = " + row1One);
            System.out.println("Rows Affected: / Linhas afetadas = " + row2Two);

        } catch (
                SQLException errTransactions) {
            try {
                connTrasaction.rollback();                                                      // desfazendo as alterações no banco de dados
                throw new DbExceptionTransactions(
                        "Error trying to rollback! / Erro ao tentar Fazer as alterações no banco de dados! " + errTransactions.getMessage());
            } catch (SQLException errRollback) {
                throw new DbExceptionTransactions(
                        "Error trying to rollback! / Erro ao tentar desfazer as alterações no banco de dados! " + errRollback.getMessage());
            }
        } finally {                                                                         // fechando a conexão com o banco de dados
            DBTransactions.closeStatement(StatmentTrans);
            DBTransactions.closeConnection();
        }
    }
}