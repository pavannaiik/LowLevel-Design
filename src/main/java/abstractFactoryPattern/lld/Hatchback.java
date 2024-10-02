package abstractFactoryPattern.lld;

public class Hatchback extends Car{

    public Hatchback(String engine, String transmission){
        this.engine = engine;
        this.transmission = transmission;
    }
    @Override
    public void startEngine() {
        System.out.println("Starting Diesel Engine");
    }

    @Override
    public void shiftGear() {
        System.out.println("Shifting gears in Manual Transmission");
    }
}
