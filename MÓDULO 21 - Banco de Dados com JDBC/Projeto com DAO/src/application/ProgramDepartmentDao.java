package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramDepartmentDao {

        public static void main(String[] args) throws ParseException {

            SellerDao sellerDao = DaoFactory.createSellerDao(); // chamo o método estático createSellerDao() da classe DaoFactory e não da classe SellerDaoJDBC

            Scanner scan = new Scanner(System.in);
            Locale.setDefault(Locale.US);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date formatDate = sdf.parse("16/06/2016");


            System.out.println("<<<<<<<<<<<<<<<<<<<< ####### Area de Testes - ProgramDAO.java ####### >>>>>>>>>>>>>>>>>>>>");
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



            //-----------------------------------   Busca por ID   ---------------------------------------------------------
            System.out.println("<<<<<<<<<< Teste Seller  / FindByID >>>>>>>>>>");

            System.out.println();
            System.out.println("*****************************************************************************************");


            //-----------------------------------   Busca por departamento com retorno de lista   --------------------------
            System.out.println("<<<<<<<<<< Teste Seller  / FindByDepartment >>>>>>>>>>");

            System.out.println();
            System.out.println("*****************************************************************************************");


            //-----------------------------------   Busca por nome com retorno de lista   ----------------------------------
            System.out.println("<<<<<<<<<< Teste Seller  / FindALL >>>>>>>>>>");

            System.out.println();
            System.out.println("*****************************************************************************************");


            //-----------------------------------   Teste de inserção de Dados   -------------------------------------------
            System.out.println("<<<<<<<<<< Teste Seller  / INSERT >>>>>>>>>>");



            System.out.println();
            System.out.println("*****************************************************************************************");

            //-----------------------------------   Teste de Atualização de Dados   ----------------------------------------

            System.out.println("<<<<<<<<<< Teste Seller  / UPDATE >>>>>>>>>>");


            System.out.println();
            System.out.println("*****************************************************************************************");

            //-----------------------------------   Teste de exclusão de Dados   -------------------------------------------
            System.out.println("<<<<<<<<<< Teste Seller  / DELETE >>>>>>>>>>");


            System.out.println();
            System.out.println("*****************************************************************************************");


            scan.close();
        }


    }

