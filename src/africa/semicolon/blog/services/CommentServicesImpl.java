package africa.semicolon.blog.services;

import africa.semicolon.blog.data.models.Comment;
import africa.semicolon.blog.data.repositories.CommentRepository;
import africa.semicolon.blog.dtos.requests.CreateCommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServicesImpl implements CommentServices{
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private PostServices postServices;


    @Override
    public void createComment(CreateCommentRequest createCommentRequest) {
        Comment comment = new Comment();
        comment.setComment(createCommentRequest.getComment());
        comment.setCommenterName(createCommentRequest.getCommenterName());
        Comment savedComment = commentRepository.save(comment);
        postServices.addComment(createCommentRequest.getPostId(), savedComment);
    }

    @Override
    public List<Comment> viewAll() {
        return commentRepository.findAll();
    }
}
