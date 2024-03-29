package org.example.application;

import javax.persistence.EntityManager;
import org.example.domain.PersonMaven;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static java.lang.System.*;

public class MavenProgramJPA {
    public static void main(String[] args) {

        // instanciando as pessoas para serem inseridas no DB   ⬇️⬇️

        /*
        PersonMaven personOne = new PersonMaven(null, "Maycon Cain", "maycon_Cain@gmail.com");
        PersonMaven personTwo = new PersonMaven(null, "Trevis Colback", "trvis_Colback@hotmailcom");
        PersonMaven personThree = new PersonMaven(null, "Alan Maknaman", "alan-Mak@gmail.com");
        PersonMaven personFour = new PersonMaven(null, "Miguel Mandzuk", "miguelMandiz@yahoo.com");
        PersonMaven personFive = new PersonMaven(null, "Nina Dobrev", "dobrevNina@gmail.com");
*/
        // Instanciar o Banco de dados automaticamente através do JPA
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-maven-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /*
        entityManager.getTransaction().begin(); // Iniciar a transação com o DB

        // Fazer as persistencias no banco de dados ⬇️⬇️
        entityManager.persist(personOne);
        entityManager.persist(personTwo);
        entityManager.persist(personThree);
        entityManager.persist(personFour);
        entityManager.persist(personFive);

        entityManager.getTransaction().commit(); // para confirmar as alterações
*/

        // Fazer Busca no DB com JPA ⬇️⬇️
        PersonMaven search = entityManager.find(PersonMaven.class, 3);
        PersonMaven search2 = entityManager.find(PersonMaven.class, 5);
        PersonMaven search3 = entityManager.find(PersonMaven.class, 1);

        out.println(); // Quebras de Linha
        out.println(); // Quebras de Linha
        out.println(search3);
        out.println(search2);
        out.println(search);



        out.println("---------->>>✅   Inseridos no DB   ✅<<<----------");
        out.println(); // Quebras de Linha
        out.println(); // Quebras de linha

        // para fechar todas as instâncias com o DB ⬇️⬇️
        entityManager.close();
        entityManagerFactory.close();

    }
}