package com.greenfoxacademy.bankofsimba.model;

public class Balance {
  int value;
  String currency;

  public Balance() {
  }

  public Balance(int value, String currency) {
    this.value = value;
    this.currency = currency;
  }

  public int getValue() {
    return value;
  }

  public String getCurrency() {
    return currency;
  }
}
