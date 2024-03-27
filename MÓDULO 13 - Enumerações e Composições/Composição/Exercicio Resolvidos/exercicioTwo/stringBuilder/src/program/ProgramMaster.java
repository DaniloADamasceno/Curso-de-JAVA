package program;

import entities.Comment;
import entities.Post;

import java.text.SimpleDateFormat;

public class ProgramMaster {

    public static void main(String[] args) throws Exception {
    /*
       Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os na tela do terminal, conforme exemplo.
       */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //--------------------------------------
        //      Instanciando Comentario ONE
        //--------------------------------------
        Comment c1 = new Comment("Tenha uma boa Viagem !!!");
        Comment c2 = new Comment("Uhuuuu  Isso e Ótimo !!!");

        Post p1 = new Post("Tenha uma boa Viagem !!",
                           sdf.parse("05/04/2020 10:20:44"),
                           "Ainda irei visitar este " +
                           "pais" + " Maravilhoso", 15
        );

        //--------------------------------------
        //      Instanciando Comentario TWO
        //--------------------------------------
        Comment c3 = new Comment("Boa Noite  !!!");
        Comment c4 = new Comment("Que a Força esteja com você  !!!");

        Post p2 = new Post(
                "Boa Noite !!",
                sdf.parse("06/04/2020 11:20:44"),
                "Nos vemos em breve  !!",
                18
        );

        // -------------------------------------
        //       Adicione os comentarios ao post
        // -------------------------------------

        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);

        p2.addComment(c3);
        p2.addComment(c4);
        System.out.println(p2);

        p2.removeComment(c3);
        System.out.println(p2);
    }
}
