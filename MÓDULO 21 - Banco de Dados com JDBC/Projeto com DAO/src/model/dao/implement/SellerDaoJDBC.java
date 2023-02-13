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
        depart.setId(resultSet.getInt("DepartmentId" ));
        depart.setName(resultSet.getString("DepName" ));
        return depart;
    }

    private Seller instantiateSeller(ResultSet resultSet, Department depart) throws SQLException {
        Seller sellerObj = new Seller();
        sellerObj.setId(resultSet.getInt("Id" ));
        sellerObj.setName(resultSet.getString("Name" ));
        sellerObj.setEmail(resultSet.getString("Email" ));
        sellerObj.setBaseSalary(resultSet.getDouble("BaseSalary" ));
        sellerObj.setBirthDate(resultSet.getDate("BirthDate" ));
        sellerObj.setDepartment(depart);
        return sellerObj;
    }

    @Override
    public void insert(Seller testSeller) {

    }

    @Override
    public void update(Seller testSeller) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {

        PreparedStatement prepStatment = null;
        ResultSet resultSet = null;

        try {
            try {
                prepStatment = connDao.prepareStatement(
                        "SELECT seller.*, department.Name as DepName "
                                + "FROM seller INNER JOIN department "
                                + "ON seller.DepartmentId = department.Id "
                                + "WHERE seller.Id = ?" );
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
            }
        } finally {
            DBDAO.closeStatement(prepStatment);
            DBDAO.closeResultSet(resultSet);
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement prepStatment = null;
        ResultSet resultSet = null;

        try {
            prepStatment = connDao.prepareStatement(
                    "SELECT seller.*, department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE seller.Id = ?"
                            + "ORDER BY Name" );
            prepStatment.setInt(1, department.getId());
            resultSet = prepStatment.executeQuery();

            List<Seller> listByDepartment = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (resultSet.next()) {
                Department depart = map.get(resultSet.getInt("DepartmentId" ));
                if (depart == null) {
                    depart = instantiateDepartment(resultSet);
                    map.put(resultSet.getInt("DepartmentId" ), depart);
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

    @Override
    public List<Seller> findAll() {


        return null;
    }


}
