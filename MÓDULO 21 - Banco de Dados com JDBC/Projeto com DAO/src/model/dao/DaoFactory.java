package model.dao;

import model.dao.implement.SellerDaoJDBC;

import java.sql.Connection;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        Connection connDao;
        return new SellerDaoJDBC(connDao);
    }
}
