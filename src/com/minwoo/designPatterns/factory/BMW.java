package com.minwoo.designPatterns.factory;

public class BMW implements Car {
  @Override
  public void getName() {
    System.out.println("I am BMW");
  }
}