package org.example.application;

import javax.persistence.EntityManager;
import org.example.domain.PersonMaven;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MavenProgramJPA {
    public static void main(String[] args) {

        // instanciando as pessoas para serem inseridas no DB   ⬇️⬇️
        PersonMaven personOne = new PersonMaven(null, "Maycon Cain", "maycon_Cain@gmail.com");
        PersonMaven personTwo = new PersonMaven(null, "Trevis Colback", "trvis_Colback@hotmailcom");
        PersonMaven personThree = new PersonMaven(null, "Alan Maknaman", "alan-Mak@gmail.com");
        PersonMaven personFour = new PersonMaven(null, "Miguel Mandzuk", "miguelMandiz@yahoo.com");
        PersonMaven personFive = new PersonMaven(null, "Nina Dobrev", "dobrevNina@gmail.com");

        // Instanciar o Banco de dados automaticamente atraves do JPA
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-maven-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin(); // Iniciar a transação com o DB

        // Fazer as persistencias no banco de dados ⬇️⬇️
        entityManager.persist(personOne);
        entityManager.persist(personTwo);
        entityManager.persist(personThree);
        entityManager.persist(personFour);
        entityManager.persist(personFive);

        entityManager.getTransaction().commit(); // para cofirmar as alteraçõe

        System.out.println("---------->>>✅   Inseridos no DB   ✅<<<----------");

        // para fechar todas as instâncias com o DB ⬇️⬇️
        entityManager.close();
        entityManagerFactory.close();

    }
}