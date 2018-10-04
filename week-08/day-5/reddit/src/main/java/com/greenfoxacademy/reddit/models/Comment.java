package com.greenfoxacademy.reddit.models;

import javax.persistence.*;

@Entity
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  int likes;
  String title;
  String content;
  @OneToOne
  Post post;

  public Comment() {
  }

  public Comment(String title, String content) {
    this.title = title;
    this.content = content;
    likes = 0;
  }

  public Comment(String title, String content, Post post) {
    this.title = title;
    this.content = content;
    this.post = post;
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

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Post getPost() {
    return post;
  }

  public void setPost(Post post) {
    this.post = post;
  }
}
