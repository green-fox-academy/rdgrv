package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
  String name;
  Balance balance;
  String animalType;

  public BankAccount() {
  }

  public BankAccount(String name, Balance balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public int getBalanceValue() {
    return balance.getValue();
  }

  public String getBalanceCurrency() {
    return balance.getCurrency();
  }

  public String getAnimalType() {
    return animalType;
  }
}