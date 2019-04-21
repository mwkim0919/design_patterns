package com.minwoo.designPatterns.factory;

public class Demo {
  public static void main(String[] args) {
    Car bmw = CarFactory.getCar(CarBrand.BMW);
    bmw.getName();

    Car audi = CarFactory.getCar(CarBrand.AUDI);
    audi.getName();

    Car mercedes = CarFactory.getCar(CarBrand.MERCEDES);
    mercedes.getName();
  }
}
