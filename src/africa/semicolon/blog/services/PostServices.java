package africa.semicolon.blog.services;

import africa.semicolon.blog.data.models.Comment;
import africa.semicolon.blog.data.models.Post;
import africa.semicolon.blog.dtos.requests.CreatePostRequest;

import java.util.List;

public interface PostServices {
    void createPost(CreatePostRequest createPostRequest);
    void updatedPost(String id, String title, String body);
    void deletePost(String id);
    Post viewPost(String id);
    List<Post> viewAllPost();
    void addComment(String postId, Comment comment);

}
