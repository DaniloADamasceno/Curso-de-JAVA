package model.dao.implement;

import dataBase.DataBaseDAO;
import dataBase.DataBaseExceptionDAO;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection connDao;

    //-----------------------------------------------   Constructor   --------------------------------------------------
    public DepartmentDaoJDBC(Connection connDao) {
        this.connDao = connDao;
    }

    //-----------------------------------------------   Methods   ------------------------------------------------------

    private Department instantiateDepartment(ResultSet resultSet) throws SQLException {
        Department depart = new Department();
        depart.setId(resultSet.getInt("DepartmentId"));
        depart.setName(resultSet.getString("DepName"));
        return depart;
    }

    @Override
    public void insert(Department testDepartment) { //------------------------  INSERT  --------------------------------

        PreparedStatement prepStatment = null;

        try {
            prepStatment = connDao.prepareStatement(
                    "INSERT INTO department "
                            + "(Name) "
                            + "VALUES "
                            + "(?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            prepStatment.setString(1, testDepartment.getName());

            int numberLinesDepartment = prepStatment.executeUpdate();
            if (numberLinesDepartment > 0) {
                ResultSet resultSet = prepStatment.getGeneratedKeys();

                if (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    testDepartment.setId(id);
                }
                DataBaseDAO.closeResultSet(resultSet);  // fechando o resultSet
            } else {
                throw new DataBaseExceptionDAO("⛔ Unexpected error! No rows affected! / NENHUMA LINHA FOI AFETADA!⛔");
            }

        } catch (SQLException errInsertDepartment) {
            throw new DataBaseExceptionDAO(errInsertDepartment.getMessage());

        } finally {
            DataBaseDAO.closeStatement(prepStatment);
        }

    }

    @Override
    public void update(Department testDepartment) { //------------------------  UPDATE  --------------------------------

        PreparedStatement prepStatment = null;
        ResultSet resultSet = null;

        try {
            prepStatment = connDao.prepareStatement(
                    "UPDATE department "
                            + "SET Name = ? "
                            + "WHERE Id = ?");
            prepStatment.setString(1, testDepartment.getName());
            prepStatment.setInt(2, testDepartment.getId());

            prepStatment.executeUpdate();

        } catch (SQLException errUpdateDepartment) {
            throw new RuntimeException(errUpdateDepartment);
        } finally {
            DataBaseDAO.closeStatement(prepStatment);
        }
    }

    @Override
    public void deleteById(Integer id) { //----------------------------  DELETE  ---------------------------------------

        PreparedStatement prepStatment = null;

        try {
            prepStatment = connDao.prepareStatement(
                    "DELETE FROM department "
                            + " WHERE Id = ? ");
            prepStatment.setInt(1, id);
            int deletedRowsDepartment = prepStatment.executeUpdate();

            if (deletedRowsDepartment == 0) {
                throw new DataBaseExceptionDAO("⛔ Id not found! / ID NÃO ENCONTRADO! ⛔");
            }

        } catch (SQLException errDelete) {
            throw new RuntimeException(errDelete);
        } finally {
            DataBaseDAO.closeStatement(prepStatment);

        }
    }

    @Override
    public Department findById(Integer id) { //----------------------------  FIND BY ID  -------------------------------

        PreparedStatement prepStatment = null;
        ResultSet resultSet = null;
        try {
            prepStatment = connDao.prepareStatement(
                    "SELECT * FROM department WHERE Id = ?");
            prepStatment.setInt(1, id);
            resultSet = prepStatment.executeQuery();
            if (resultSet.next()) {
                Department depart = new Department();
                depart.setId(resultSet.getInt("Id"));
                depart.setName(resultSet.getString("Name"));
                return depart;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DataBaseExceptionDAO(e.getMessage());
        }
        finally {
            DataBaseDAO.closeStatement(prepStatment);
            DataBaseDAO.closeResultSet(resultSet);
        }

    }

    @Override
    public List<Department> findAll() { //----------------------------  FIND ALL  --------------------------------------
        PreparedStatement prepStatment = null;
        ResultSet resultSet = null;
        try {
            prepStatment = connDao.prepareStatement(
                    "SELECT * "
                    + "FROM department "
                    + "ORDER BY Name");
            resultSet = prepStatment.executeQuery();

            List<Department> listByDepartment = new ArrayList<>();

            while (resultSet.next()) {
                Department depart = new Department();
                depart.setId(resultSet.getInt("Id"));
                depart.setName(resultSet.getString("Name"));
                listByDepartment.add(depart);
            }
            return listByDepartment;

        } catch (SQLException errDepartment) {
            throw new DataBaseExceptionDAO(errDepartment.getMessage());

        } finally {
            DataBaseDAO.closeStatement(prepStatment);
            DataBaseDAO.closeResultSet(resultSet);
        }

    }
}
