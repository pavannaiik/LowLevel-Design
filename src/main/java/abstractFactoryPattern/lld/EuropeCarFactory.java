package abstractFactoryPattern.lld;

public class EuropeCarFactory implements CarAbstractFactory{
    @Override
    public Car createCar() {
        return new Sedan("Diesel Engine", "Manual Transmission");
    }
}
