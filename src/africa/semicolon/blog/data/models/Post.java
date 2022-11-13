package africa.semicolon.blog.data.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private int id;
    private LocalDateTime creationTime;
    private String body;
    private List<Comment> comments = new ArrayList<>();

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Post{");
        sb.append("title='").append(title).append('\'');
        sb.append(", id=").append(id);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", body='").append(body).append('\'');
        sb.append(", comments=").append(comments);
        sb.append('}');
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
