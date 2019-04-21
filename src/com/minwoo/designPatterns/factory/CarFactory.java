package com.minwoo.designPatterns.factory;

class CarFactory {
    public static Car getCar(CarBrand brand) {
        if (brand == CarBrand.BMW) {
            return new BMW();
        } else if (brand == CarBrand.MERCEDES) {
            return new Mercedes();
        } else {
            return new Audi();
        }
    }
}