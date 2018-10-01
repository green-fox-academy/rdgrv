package com.greenfoxacademy.rest.models;

public class WhatDouble {
  Integer[] result;

  public WhatDouble() {
  }

  public WhatDouble(What what) {
    result = doubling(what.getNumbers());
  }

  public Integer[] doubling(Integer[] integers) {
    for (Integer number : integers) {
      number = number * 2;
    }

    return integers;
  }

  public Integer[] getResult() {
    return result;
  }

  public void setResult(Integer[] result) {
    this.result = result;
  }
}
