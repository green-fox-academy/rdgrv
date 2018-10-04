package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Comment;
import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostService {

  List<Post> getPosts();

  Post getPostById(long id);

  void save(String title, String url);

  void upvoteById(long id);

  void downvoteById(long id);

  void addCommentById(long id, String commentTitle, String commentContent);
}