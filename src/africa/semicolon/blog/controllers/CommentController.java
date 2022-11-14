package africa.semicolon.blog.controllers;

import africa.semicolon.blog.dtos.requests.CreateCommentRequest;
import africa.semicolon.blog.services.CommentServices;
import africa.semicolon.blog.services.CommentServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @Autowired
    private CommentServices commentServices;

    @PostMapping("/comment")   //creating something new
    public String addComment(@RequestBody CreateCommentRequest createCommentRequest){
        commentServices.createComment(createCommentRequest);
        return "Comment added";
    }

}
