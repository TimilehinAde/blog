package africa.semicolon.blog.services;

import africa.semicolon.blog.data.models.Comment;
import africa.semicolon.blog.dtos.requests.CreateCommentRequest;

import java.util.List;

public interface CommentServices {
    void createComment(CreateCommentRequest createCommentRequest);

    List<Comment> viewAll();

}
