package africa.semicolon.blog.services;

import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.dtos.requests.CreatePostRequest;

import java.util.List;

public interface PostServices {
    void createPost(CreatePostRequest createPostRequest);
    void updatedPost(int id, String title, String body);
    void deletePost(int id);
    Post viewPost(int id);
    List<Post> viewAllPost();


}
