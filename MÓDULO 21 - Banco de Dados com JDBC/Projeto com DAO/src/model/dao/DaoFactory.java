package model.dao;

import dataBase.DataBaseDAO;
import model.dao.implement.DepartmentDaoJDBC;
import model.dao.implement.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DataBaseDAO.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DataBaseDAO.getConnection());
    }
}
