package com.minwoo.designPatterns.factory;

public class Audi implements Car {
  @Override
  public void getName() {
    System.out.println("I am Audi");
  }
}