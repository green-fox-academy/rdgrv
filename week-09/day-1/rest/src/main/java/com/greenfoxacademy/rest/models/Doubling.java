package com.greenfoxacademy.rest.models;

public class Doubling {
  int received;
  int result;

  public Doubling() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int doubling(int received) {
    return received * 2;
  }
}
