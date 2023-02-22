package model.dao;

import dataBase.DBDAO;
import model.dao.implement.DepartmentDaoJDBC;
import model.dao.implement.SellerDaoJDBC;

import java.sql.Connection;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DBDAO.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DBDAO.getConnection());
    }
}
