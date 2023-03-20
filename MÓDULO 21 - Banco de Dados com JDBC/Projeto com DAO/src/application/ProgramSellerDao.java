package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class ProgramSellerDao {
    public static void main(String[] args) throws ParseException {

        SellerDao sellerDao = DaoFactory.createSellerDao(); // chamo o método estático createSellerDao() da classe DaoFactory e não da classe SellerDaoJDBC

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date formatDate = sdf.parse("16/06/2016");


        System.out.println("<<<<<<<<<<<<<<<<<<<< ####### Area de Testes - Program Seller DAO.java ####### >>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println();
        System.out.println();

        //-----------------------------------   Teste DEPARTAMENTO   ---------------------------------------------------
        System.out.println("----------------------------- Teste Department/ DEPARTAMENTO ----------------------------");
        Department testDepartment = new Department(1, "Libraries");
        System.out.println(testDepartment);
        System.out.println();
        System.out.println();
        System.out.println("*****************************************************************************************");


        //-----------------------------------   Teste VENDEDOR   -------------------------------------------------------
        System.out.println("----------------------------- Teste Seller/VENDEDOR   ----------------------------- ");
        Seller testSeller = new Seller(101, "Margoth", "margoth@gmail.com", 3589.00,
                formatDate, testDepartment);

        System.out.println(testSeller);
        System.out.println();
        System.out.println("*****************************************************************************************");


        //-----------------------------------   Busca por ID   ---------------------------------------------------------
        System.out.println("<<<<<<<<<< Teste Seller  / FindByID >>>>>>>>>>");
        Seller seller = sellerDao.findById(48);   // “IDs” entre 40 e 60 são os que estão no banco de dados
        System.out.println(seller);
        System.out.println();
        System.out.println("*****************************************************************************************");


        //-----------------------------------   Busca por departamento com retorno de lista   --------------------------
        System.out.println("<<<<<<<<<< Teste Seller  / FindByDepartment >>>>>>>>>>");
        Department department = new Department(3, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller objDepartment : list) {
            System.out.println(objDepartment);
        }
        System.out.println();
        System.out.println("*****************************************************************************************");


        //-----------------------------------   Busca por nome com retorno de lista   ----------------------------------
        System.out.println("<<<<<<<<<< Teste Seller  /  FindALL >>>>>>>>>>");
        List<Seller> listAll = sellerDao.findAll();
        for (Seller objAll : listAll) {
            System.out.println(objAll);
        }
        System.out.println();
        System.out.println("*****************************************************************************************");


        //-----------------------------------   Teste de inserção de Dados   -------------------------------------------
        System.out.println("<<<<<<<<<< Teste Seller  /  INSERT >>>>>>>>>>");

        Date formatDateGreg = sdf.parse("15/01/1975");
        Department departmentGreg = new Department(4, null);

        Seller newSeller = new Seller(null, "George Paul",
                "georgeP@gmail.com", 4125.00, formatDateGreg, departmentGreg);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId() + " - " + newSeller.getName());

        Date formatDateKeyOne = sdf.parse("19/05/1997");
        Department departmentKeyOne = new Department(4, null);
        Seller newSeller2 = new Seller(null, "Key Alcantara",
                "Key@hotmail.com", 3789.78, formatDateKeyOne, departmentKeyOne);
        sellerDao.insert(newSeller2);
        System.out.println("Inserted! New id = " + newSeller2.getId() + " - " + newSeller2.getName());


        System.out.println();
        System.out.println("*****************************************************************************************");

        //-----------------------------------   Teste de Atualização de Dados   ----------------------------------------

        System.out.println("<<<<<<<<<< Teste Seller  /  UPDATE >>>>>>>>>>");

        Date formatDateKey = sdf.parse("15/08/1996");
        Department departmentKey = new Department(3, null);

        seller = sellerDao.findById(76);
        seller.setName("Key Atualizada");
        seller.setEmail("keyUpdate@hotmail.com");
        seller.setBirthDate(formatDateKey);
        seller.setBaseSalary(4789.78);
        seller.setDepartment(departmentKey);
        sellerDao.update(seller);

        System.out.println("⚠️✅Update completed! /  Atualização concluída!⚠️✅");
        System.out.println();
        System.out.println(seller.getId() + " -- " + seller.getName() + " \n " + seller.getEmail()
                + " -- " + seller.getBirthDate() + " \n " + seller.getBaseSalary() + " - "
                + seller.getDepartment().getName());
        System.out.println();
        System.out.println("*****************************************************************************************");

        //-----------------------------------   Teste de exclusão de Dados   -------------------------------------------
        System.out.println("<<<<<<<<<< Teste Seller  /  DELETE >>>>>>>>>>");

        System.out.println("Enter id for delete test: ");
        int id = scan.nextInt();
        sellerDao.deleteById(id);
        System.out.println("⚠️✅Delete completed! / Exclusão concluída!⚠️✅");
        System.out.println();
        System.out.println("*****************************************************************************************");


        scan.close();
    }


}
