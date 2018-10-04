package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

  List<Comment> findAll();
  List<Comment> findAllByPostId(long id);
}
