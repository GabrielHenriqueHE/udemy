package desafio2.domain.entities;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private int likes;

    public List<Comment> comments = new ArrayList<Comment>();

    public Post() {}

    public Post(Date moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.title + "\n");
        sb.append(this.likes);
        sb.append(" likes - ");
        sb.append(LocalDateTime.ofInstant(moment.toInstant(), ZoneOffset.UTC));
        sb.append(this.content + "\n");
        sb.append("Comments:\n");
        for (Comment comment : comments) {
            sb.append(comment.getText() + "\n");
        }
        return sb.toString();
    }
}
