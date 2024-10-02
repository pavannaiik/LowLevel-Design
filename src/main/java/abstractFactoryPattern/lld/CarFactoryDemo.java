package abstractFactoryPattern.lld;

public class CarFactoryDemo {
    public static void main(String[] args) {
        CarAbstractFactory factory = new NorthAmericanCarFactory();
        Car car = factory.createCar();
        car.startEngine();
        car.shiftGear();

        factory = new EuropeCarFactory();
        car = factory.createCar();
        car.startEngine();
        car.shiftGear();
    }
}