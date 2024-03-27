package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String title;
    private Date moment;
    private String content;
    private Integer likes;
    private final List <Comment> comments = new ArrayList <>();

    //! --------------------------------           Constructors      ---------------------------------------------------
    public Post() {}

    public Post(String title, Date moment, String content, Integer likes) { // ---> Construtor com parâmetros
        this.title   = title;
        this.moment  = moment;
        this.content = content;
        this.likes   = likes;
    }

    //! ------------------------------------         Getters and Setters        ----------------------------------------
    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public Date getMoment() {return moment;}

    public void setMoment(Date moment) {this.moment = moment;}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List <Comment> getComments() {
        return comments;
    }

    //! -------------------------------------------   METHODS   --------------------------------------------------------
    //%% Adicionar Comentário
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    //%% Remover Comentário
    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    //! -------------------------------------------   toString   -------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(title)
                .append("\n");
        sb
                .append(likes)
                .append(" Likes - ");
        sb
                .append(sdf.format(moment))
                .append("\n");
        sb
                .append(content)
                .append("\n");
        sb.append("Comments: \n");
        for(Comment c : comments) { // para cada comentario ser acrecentado ao StringBuilder
            sb
                    .append(c.getText())
                    .append("\n");
        }
        return sb.toString();
    }
}
