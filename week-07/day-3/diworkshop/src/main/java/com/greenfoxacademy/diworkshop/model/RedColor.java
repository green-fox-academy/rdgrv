package com.greenfoxacademy.diworkshop.model;

import com.greenfoxacademy.diworkshop.service.MyColor;

public class RedColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
