package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Comment;
import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.CommentRepository;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

  @Autowired
  CommentRepository commentRepository;

  @Override
  public List<Comment> getCommentsById(long id) {
    return commentRepository.findAllByPostId(id);
  }

  @Override
  public Comment getCommentById(long id) {
    return commentRepository.findById(id).get();
  }

  @Override
  public void upvoteById(long id) {
    Comment comment = commentRepository.findById(id).get();
    comment.setLikes(comment.getLikes() + 1);
    commentRepository.save(comment);
  }

  @Override
  public void downvoteById(long id) {
    Comment comment = commentRepository.findById(id).get();
    comment.setLikes(comment.getLikes() - 1);
    commentRepository.save(comment);
  }
}
