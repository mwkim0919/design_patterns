package com.minwoo.designPatterns.abstractFactory;

public class EmberToolkit extends AbstractFactory {
  @Override
  public CPU createCPU() {
    return new EmberCPU();
  }

  @Override
  public MMU createMMU() {
    return new EnginolaMMU();
  }
}
