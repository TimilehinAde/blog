package africa.semicolon.blog.data.repositories;

import africa.semicolon.blog.data.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);
    Comment findById(int id);
    List<Comment> findAll();
    Long count();
    void delete(Comment comment);
    void delete(int id);
}
