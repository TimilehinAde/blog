package africa.semicolon.blog.controllers;

import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.dtos.requests.CreatePostRequest;
import africa.semicolon.blog.services.PostServices;
import africa.semicolon.blog.services.PostServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @Autowired
    private PostServices postServices ;
    @PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postServices.createPost(createPostRequest);
        return "Successful";
    }
    @GetMapping("/post/{postId}")
    public Post viewPost(@PathVariable String postId){
        return postServices.viewPost(postId);
    }
}
