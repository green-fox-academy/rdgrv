package com.greenfoxacademy.reddit.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  int likes;
  String title;
  String url;
  @OneToMany
  List<Comment> comments;

  public Post() {
    comments = new ArrayList<>();
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    likes = 0;
    comments = new ArrayList<>();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }
}
