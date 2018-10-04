package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Comment;
import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.CommentRepository;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  PostRepository postRepository;

  @Autowired
  CommentRepository commentRepository;

  @Override
  public List<Post> getPosts() {
    return postRepository.findAll();
  }

  @Override
  public Post getPostById(long id) {
    return postRepository.findById(id).get();
  }

  @Override
  public void save(String title, String url) {
    postRepository.save(new Post(title, url));
  }

  @Override
  public void upvoteById(long id) {
    Post post = postRepository.findById(id).get();
    post.setLikes(post.getLikes() + 1);
    postRepository.save(post);
  }

  @Override
  public void downvoteById(long id) {
    Post post = postRepository.findById(id).get();
    post.setLikes(post.getLikes() - 1);
    postRepository.save(post);
  }

  @Override
  public void addCommentById(long id, String commentTitle, String commentContent) {
    Post post = postRepository.findById(id).get();
    Comment comment = new Comment(commentTitle, commentContent, post);

    commentRepository.save(comment);
    postRepository.findById(id).get().getComments().add(comment);
  }
}