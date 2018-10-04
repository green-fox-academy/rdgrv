package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Comment;
import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface CommentService {

  List<Comment> getCommentsById(long id);
  Comment getCommentById(long id);
  void upvoteById(long id);
  void downvoteById(long id);
}
