package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
  String name;
  Balance balance;
  String animalType;
  boolean isKing;
  boolean isEnemy;

  public BankAccount() {
  }

  public BankAccount(String name, Balance balance, String animalType, boolean isKing, boolean isEnemy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isEnemy = isEnemy;
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

  public boolean isKing() {
    return isKing;
  }

  public boolean isEnemy() {
    return isEnemy;
  }
}