package com.greenfoxacademy.rest.models;

public class Greeter {
  String welcome_message;

  public Greeter() {
  }

  public Greeter(String welcomeMessage) {
    this.welcome_message = welcomeMessage;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
