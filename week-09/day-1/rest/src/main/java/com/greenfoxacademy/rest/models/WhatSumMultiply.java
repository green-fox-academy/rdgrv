package com.greenfoxacademy.rest.models;

public class WhatSumMultiply {
  int result;

  public WhatSumMultiply() {
  }

  public WhatSumMultiply(What what) {
    if (what.getWhat().equals("sum")) {
      result = sum(what.getNumbers());
    }

    if (what.getWhat().equals("multiply")) {
      result = multiply(what.getNumbers());
    }
  }

  public int sum(Integer[] integers) {
    int sum = 0;
    for (int i = 0; i < integers.length; i++) {
      sum = sum + integers[i];
    }
    return sum;
  }

  public int multiply(Integer[] integers) {
    int sum = 1;
    for (int i = 0; i < integers.length; i++) {
      sum = sum * integers[i];
    }
    return sum;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
