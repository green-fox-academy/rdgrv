package com.greenfoxacademy.rest.models;

public class What {
  String what;
  Integer[] numbers;

  public What() {
  }

  public What(String what, Integer[] array) {
    this.what = what;
    this.numbers = array;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }
}
