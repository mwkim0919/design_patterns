import com.minwoo.designPatterns.factory.*;

class CarFactory {

    public static void main(String[] args) {
        Car bmw = CarFactory.getCar(CarBrand.BMW);
        bmw.getName();

        Car audi = CarFactory.getCar(CarBrand.AUDI);
        audi.getName();

        Car mercedes = CarFactory.getCar(CarBrand.MERCEDES);
        mercedes.getName();
    }

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