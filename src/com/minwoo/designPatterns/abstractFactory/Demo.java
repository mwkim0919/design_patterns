package com.minwoo.designPatterns.abstractFactory;

public class Demo {
  public static void main(String[] args) {
    AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
    CPU cpu = factory.createCPU();
    // The following will print out "I am ember CPU."
    cpu.getName();

    factory = AbstractFactory.getFactory(Architecture.ENGINOLA);
    // The following will print out "I am Enginola MMU."
    factory.createMMU().getName();
  }
}
