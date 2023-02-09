package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ProgramDAO {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date formatDate = sdf.parse("16/06/2016");

        System.out.println("<<<<<<<<<< Area de Testes - ProgramDAO.java >>>>>>>>>>");
        System.out.println();

        System.out.println("<<<<<<<<<< Teste Department >>>>>>>>>>");
        Department testDepartment = new Department(1, "Libraries");
        System.out.println(testDepartment);
        System.out.println();

        System.out.println("<<<<<<<<<< Teste Seller >>>>>>>>>>");
        Seller testSeller = new Seller(101, "Margoth", "margoth@gmail.com", 3589.00,
                formatDate,testDepartment);

        SellerDao sellerDao = DaoFactory.createSellerDao(); // chamo o método estático createSellerDao() da classe DaoFactory e não da classe SellerDaoJDBC
        System.out.println(testSeller);
    }


}
