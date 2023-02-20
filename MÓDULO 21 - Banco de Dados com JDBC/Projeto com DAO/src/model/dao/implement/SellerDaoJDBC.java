package model.dao.implement;

import dataBase.DBDAO;
import dataBase.DbExceptionDAO;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SellerDaoJDBC implements SellerDao {

    private Connection connDao;

    //-----------------------------------------------   Constructor   --------------------------------------------------
    public SellerDaoJDBC(Connection connDao) {
        this.connDao = connDao;
    }

    //-----------------------------------------------   Methods   ------------------------------------------------------

    private Department instantiateDepartment(ResultSet resultSet) throws SQLException {
        Department depart = new Department();
        depart.setId(resultSet.getInt("DepartmentId"));
        depart.setName(resultSet.getString("DepName"));
        return depart;
    }

    private Seller instantiateSeller(ResultSet resultSet, Department depart) throws SQLException {
        Seller sellerObj = new Seller();
        sellerObj.setId(resultSet.getInt("Id"));
        sellerObj.setName(resultSet.getString("Name"));
        sellerObj.setEmail(resultSet.getString("Email"));
        sellerObj.setBaseSalary(resultSet.getDouble("BaseSalary"));
        sellerObj.setBirthDate(resultSet.getDate("BirthDate"));
        sellerObj.setDepartment(depart);
        return sellerObj;
    }

    @Override
    public void insert(Seller testSeller) { //------------------------  INSERT  ---------------------------------------

        PreparedStatement prepStatment = null;

        try {
            try {
                prepStatment = connDao.prepareStatement(
                        "INSERT INTO seller "
                                + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                                + "VALUES "
                                + "(?, ?, ?, ?, ?)",
                        PreparedStatement.RETURN_GENERATED_KEYS);

                prepStatment.setString(1, testSeller.getName());
                prepStatment.setString(2, testSeller.getEmail());
                prepStatment.setDate(3, new java.sql.Date(testSeller.getBirthDate().getTime()));
                prepStatment.setDouble(4, testSeller.getBaseSalary());
                prepStatment.setInt(5, testSeller.getDepartment().getId());

                int numberLines = prepStatment.executeUpdate();

                if (numberLines > 0) {
                    ResultSet resultSet = prepStatment.getGeneratedKeys();

                    if (resultSet.next()) {
                        int id = resultSet.getInt(1);
                        testSeller.setId(id);
                    }
                    DBDAO.closeResultSet(resultSet);  // fechando o resultSet
                } else {
                    throw new DbExceptionDAO("Unexpected error! No rows affected! / NENHUMA LINHA FOI AFETADA!");
                }

            } catch (SQLException errInsert) {
                throw new DbExceptionDAO(errInsert.getMessage());
            }
        } finally {
            DBDAO.closeStatement(prepStatment);
        }
    }

    @Override
    public void update(Seller testSeller) {  //------------------------  UPDATE  ---------------------------------------
        PreparedStatement prepStatment = null;
        ResultSet resultSet = null;

        try {

            prepStatment = connDao.prepareStatement(
                    "UPDATE seller "
                            + "SET Name = ?," +
                            "Email = ?," +
                            "BirthDate = ?," +
                            "BaseSalary = ?," +
                            "DepartmentId = ? "
                            + "WHERE Id = ? ");
            prepStatment.setString(1, testSeller.getName());
            prepStatment.setString(2, testSeller.getEmail());
            prepStatment.setDate(3, new java.sql.Date(testSeller.getBirthDate().getTime()));
            prepStatment.setDouble(4, testSeller.getBaseSalary());
            prepStatment.setInt(5, testSeller.getDepartment().getId());
            prepStatment.setInt(6, testSeller.getId());

            prepStatment.executeUpdate();

        } catch (SQLException errUpdate) {
            throw new RuntimeException(errUpdate);
        } finally {
            DBDAO.closeStatement(prepStatment);
        }

    }

    @Override
    public void deleteById(Integer id) { //------------------------  DELETE  -------------------------------------------

    }

    @Override
    public Seller findById(Integer id) { //------------------------  FIND BY ID  ---------------------------------------

        PreparedStatement prepStatment = null;
        ResultSet resultSet = null;

        try {

            prepStatment = connDao.prepareStatement(
                    "SELECT seller.*, department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE seller.Id = ?");
            prepStatment.setInt(1, id);
            resultSet = prepStatment.executeQuery();
            if (resultSet.next()) {
                Department depart = instantiateDepartment(resultSet);
                Seller sellerObj = instantiateSeller(resultSet, depart);
                return sellerObj;
            }
            return null;
        } catch (SQLException errDAO) {
            throw new DbExceptionDAO(errDAO.getMessage());

        } finally {
            DBDAO.closeStatement(prepStatment);
            DBDAO.closeResultSet(resultSet);
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) { //------------------------  FIND BY DEPARTMENT  ------
        PreparedStatement prepStatment = null;
        ResultSet resultSet = null;

        try {
            prepStatment = connDao.prepareStatement(
                    "SELECT seller.*, department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE DepartmentId = ? "
                            + "ORDER BY Name");

            prepStatment.setInt(1, department.getId());
            resultSet = prepStatment.executeQuery();

            List<Seller> listByDepartment = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (resultSet.next()) {
                Department departFindAll = map.get(resultSet.getInt("DepartmentId"));

                if (departFindAll == null) {
                    departFindAll = instantiateDepartment(resultSet);
                    map.put(resultSet.getInt("DepartmentId"), departFindAll);
                }
                Seller sellerObj = instantiateSeller(resultSet, departFindAll);
                listByDepartment.add(sellerObj);
            }
            return listByDepartment;

        } catch (SQLException errDepartment) {
            throw new DbExceptionDAO(errDepartment.getMessage());

        } finally {
            DBDAO.closeStatement(prepStatment);
            DBDAO.closeResultSet(resultSet);
        }
    }

    @Override
    public List<Seller> findAll() { //-------------------------  FIND ALL  ---------------------------------------------
        PreparedStatement prepStatment = null;
        ResultSet resultSet = null;
        try {
            prepStatment = connDao.prepareStatement(
                    "SELECT seller.*,department.Name as DepName  "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "ORDER BY Name");


            resultSet = prepStatment.executeQuery();

            List<Seller> listByDepartment = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (resultSet.next()) {
                Department depart = map.get(resultSet.getInt("DepartmentId"));
                if (depart == null) {
                    depart = instantiateDepartment(resultSet);
                    map.put(resultSet.getInt("DepartmentId"), depart);
                }
                Seller sellerObj = instantiateSeller(resultSet, depart);
                listByDepartment.add(sellerObj);
            }
            return listByDepartment;
        } catch (SQLException errDepartment) {
            throw new DbExceptionDAO(errDepartment.getMessage());

        } finally {
            DBDAO.closeStatement(prepStatment);
            DBDAO.closeResultSet(resultSet);
        }

    }
}
