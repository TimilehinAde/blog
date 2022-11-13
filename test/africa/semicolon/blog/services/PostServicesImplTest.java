package africa.semicolon.blog.services;

import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.dtos.requests.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostServicesImplTest {
    private PostServices postServices;
    private CreatePostRequest createPostRequest;

    @BeforeEach
    void setUp() {
        postServices = new PostServicesImpl();
        createPostRequest = new CreatePostRequest();
    }
    @Test
   public void createPostTest(){
        createPostRequest.setBody("Egusi is my best soup");
        createPostRequest.setTitle("New Post");
        postServices.createPost(createPostRequest);
        assertEquals(1, postServices.viewAllPost().size());

    }
    public void viewPostTest(){
        createPostRequest.setBody("Egusi is my best soup");
        createPostRequest.setTitle("New post");
        postServices.createPost(createPostRequest);
        assertEquals(1, postServices.viewAllPost().size());

        Post post = postServices.viewPost(1);
        assertEquals("New Post", post.getTitle());
        assertEquals("Egusi is my best soup", post.getBody());
        assertNotNull(post.getCreationTime());
    }
}