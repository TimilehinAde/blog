package africa.semicolon.blog.services;

import africa.semicolon.blog.data.models.Comment;
import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.dtos.requests.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    @Test public void addComment(){
        //given i have a saevd post
        //given i have a comment
        //when i save the comment to post
        //confirm that post's comment is 1
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Post Body");
        createPostRequest.setTitle("Post Title");
        postServices.createPost(createPostRequest);
        Comment comment = new Comment();
        comment.setComment("I love your post");
        postServices.addComment(1, comment);

        Post savedpost = postServices.viewPost(1);
        assertEquals(1,savedpost.getComments().size());
        List<Comment> comments = savedpost.getComments();
        Comment firstComment = comments.get(0);
        assertEquals("I love your post", savedpost.getComments().get(0).getComment());
    }
}