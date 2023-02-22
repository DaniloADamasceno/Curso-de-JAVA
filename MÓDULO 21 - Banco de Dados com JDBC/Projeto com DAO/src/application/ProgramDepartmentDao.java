package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramDepartmentDao {

    public static void main(String[] args) throws ParseException {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); // chamo o método estático createSellerDao() da classe DaoFactory e não da classe SellerDaoJDBC

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Date formatDate = sdf.parse("16/06/2016");


        System.out.println("<<<<<<<<<<< ####### Area de Testes - Program DEPARTMENT Dao.java ####### >>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println();
        System.out.println();
/*
        //-----------------------------------   Teste de inserção de Dados   -------------------------------------------
        System.out.println("<<<<<<<<<< Teste Department  / INSERT >>>>>>>>>>");
        Department testDepartment = new Department(null, "Chinese Spices");
        departmentDao.insert(testDepartment);
        System.out.println(testDepartment);

        System.out.println();
        System.out.println("*****************************************************************************************");

        //-----------------------------------   Busca por ID   ---------------------------------------------------------
        System.out.println("<<<<<<<<<< Teste Seller  / FindByID >>>>>>>>>>");
        Department departmentFindByID = departmentDao.findById(8);   // “IDs” entre 01 e 11 são os que estão no banco de dados
        System.out.println(departmentFindByID);
        System.out.println();
        System.out.println("*****************************************************************************************");

        //-----------------------------------   Teste de Atualização de Dados   ----------------------------------------

        System.out.println("<<<<<<<<<< Teste Department  / UPDATE >>>>>>>>>>");
        Department departmentNew = new Department(10, null);

        departmentNew = departmentDao.findById(9);
        departmentNew.setName("Peripherals");

        System.out.println("⚠️✅Update completed! / Atualização concluída!⚠️✅");
        System.out.println();
        System.out.println(departmentNew.getId() + " -- " + departmentNew.getName());

        System.out.println();
        System.out.println("*****************************************************************************************");

 */

        //-----------------------------------   Busca por departamento com retorno de lista   --------------------------
        System.out.println("<<<<<<<<<< Teste Seller  / FindByDepartment >>>>>>>>>>");

        System.out.println();
        System.out.println("*****************************************************************************************");


        //-----------------------------------   Busca por nome com retorno de lista   ----------------------------------
        System.out.println("<<<<<<<<<< Teste Seller  / FindALL >>>>>>>>>>");

        System.out.println();
        System.out.println("*****************************************************************************************");




        //-----------------------------------   Teste de exclusão de Dados   -------------------------------------------
        System.out.println("<<<<<<<<<< Teste Seller  / DELETE >>>>>>>>>>");


        System.out.println();
        System.out.println("*****************************************************************************************");


        scan.close();
    }


}

