package decoratorPattern.lld;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assemble();

        Car sportsCar = new SportsCarDecorator(new BasicCar());
        sportsCar.assemble();

        Car luxuryCar = new LuxuryCarDecorator(new SportsCarDecorator(new BasicCar()));
        luxuryCar.assemble();
    }
}
