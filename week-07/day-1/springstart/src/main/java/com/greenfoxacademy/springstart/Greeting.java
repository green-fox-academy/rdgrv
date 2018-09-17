package com.greenfoxacademy.springstart;

public class Greeting {
  long id;
  String content;

  public Greeting() {
    id = 1;
    content = "Hello, World!";
  }

  public Greeting (String name) {
    id = 1;
    content = "Hello, " + name;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
