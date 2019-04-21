package com.minwoo.designPatterns.factory;

public class Mercedes implements Car {
  @Override
  public void getName() {
    System.out.println("I am Mercedes");
  }
}