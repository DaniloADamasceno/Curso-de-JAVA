package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramDepartmentDao {

    public static void main(String[] args) throws ParseException {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); // chamo o método estático createSellerDao() da classe DaoFactory e não da classe SellerDaoJDBC

        Scanner scan = new Scanner(System.in);

        Locale.setDefault(Locale.US);


        System.out.println("<<<<<<<<<<< ####### Area de Testes - Program DEPARTMENT Dao.java ####### >>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println();
        System.out.println();

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
        Department departmentNew1 = new Department();
        Department departmentNew2 = new Department();

        departmentNew1 = departmentDao.findById(6);
        departmentNew1.setName("Internet of Things");

        departmentNew2 = departmentDao.findById(7);
        departmentNew2.setName("Marketing");

        System.out.println("⚠️✅Update completed! / Atualização concluída!⚠️✅");
        System.out.println();
        System.out.println(departmentNew1.getId() + " -- " + departmentNew1.getName());
        System.out.println(departmentNew2.getId() + " -- " + departmentNew2.getName());

        System.out.println();
        System.out.println("*****************************************************************************************");


        //-----------------------------------   Busca por nome com retorno de lista   ----------------------------------
        System.out.println("<<<<<<<<<< Teste Department  / FindALL >>>>>>>>>>");
        List<Department> listAll = departmentDao.findAll();
        for (Department findAll : listAll) {
            System.out.println(findAll);
        }
        System.out.println();
        System.out.println();
        System.out.println("*****************************************************************************************");


        //-----------------------------------   Teste de exclusão de Dados   -------------------------------------------
        System.out.println("<<<<<<<<<< Teste Seller  / DELETE >>>>>>>>>>");

        System.out.println("Enter id for delete test: ");
        int id = scan.nextInt();
        departmentDao.deleteById(id);
        System.out.println("⚠️✅Delete completed! / Exclusão concluída!⚠️✅");
        System.out.println();

        System.out.println();
        System.out.println("*****************************************************************************************");

        scan.close();

    }

}

