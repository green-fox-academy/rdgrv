package com.greenfoxacademy.bankofsimba.model;

import com.greenfoxacademy.bankofsimba.controller.BankAccountController;

import java.util.ArrayList;
import java.util.List;

public class BankAccountList {
  List<BankAccount> bankAccountList;

  public BankAccountList() {
    bankAccountList = new ArrayList<>();
  }

  public void add(BankAccount bankAccount) {
    bankAccountList.add(bankAccount);
  }

  public List<BankAccount> getBankAccountList() {
    return bankAccountList;
  }
}
