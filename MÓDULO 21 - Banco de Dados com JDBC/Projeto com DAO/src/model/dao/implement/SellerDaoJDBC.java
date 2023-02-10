package model.dao.implement;

import model.dao.SellerDao;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {

    private Connection connDao;

    //-----------------------------------------------   Constructor   --------------------------------------------------
    public SellerDaoJDBC(Connection connDao) {
        this.connDao = connDao;
    }

    //-----------------------------------------------   Methods   ------------------------------------------------------
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




        return null;
    }

    @Override
    public List<Seller> findAll() {
        return null;
    }
}
