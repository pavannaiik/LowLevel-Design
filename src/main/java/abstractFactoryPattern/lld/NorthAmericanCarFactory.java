package abstractFactoryPattern.lld;

public class NorthAmericanCarFactory implements CarAbstractFactory{
    @Override
    public Car createCar() {
        return new Sedan("V6 Engine", "Automatic Transmission");
    }
}
