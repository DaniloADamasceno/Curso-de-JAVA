package model.dao;

import dataBase.DBDAO;
import model.dao.implement.SellerDaoJDBC;

import java.sql.Connection;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DBDAO.getConnection());
    }
}
