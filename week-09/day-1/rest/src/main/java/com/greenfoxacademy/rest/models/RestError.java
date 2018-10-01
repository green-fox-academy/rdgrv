package com.greenfoxacademy.rest.models;

public class RestError {
  String error;

  public RestError() {
  }

  public RestError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
