package africa.semicolon.blog.services;

import africa.semicolon.blog.dtos.requests.CreateCommentRequest;
import africa.semicolon.blog.dtos.requests.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommentServicesTest {

    private CommentServices commentServices;
    private PostServices postServices;

    @BeforeEach
    public void setUp() {
        commentServices = new CommentServicesImpl();
        postServices = new PostServicesImpl();
    }
    @Test
    public void createCommentTest(){
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setTitle("title");
        createPostRequest.setBody("Body");
        postServices.createPost(createPostRequest);

        CreateCommentRequest createCommentRequest = new CreateCommentRequest();
        createCommentRequest.setCommenterName("John Doe");
        createCommentRequest.setPostId(1);
        createCommentRequest.setComment("I love your useless post!!!");

        commentServices.createComment(createCommentRequest);
        assertEquals(1,commentServices.veiwAll().size());
        PostServices postServices1 = new PostServicesImpl();
        System.out.println(postServices1.viewPost(1));
    }
}