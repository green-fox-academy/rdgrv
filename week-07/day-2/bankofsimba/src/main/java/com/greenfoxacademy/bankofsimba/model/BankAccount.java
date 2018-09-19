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

  public String getStatus() {
    if (isKing() && !isEnemy())
      return "Obviously loyal to himself";
    else if (isKing() && isEnemy())
      return "The greatest enemy of the kingdom";
    else if (!isKing() && !isEnemy())
      return "Good servant";
    else return "Evil minion";
  }
}