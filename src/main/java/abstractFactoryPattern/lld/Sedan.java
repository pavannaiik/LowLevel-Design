package abstractFactoryPattern.lld;

public class Sedan extends Car{

    public Sedan(String engine, String transmission){
        this.engine = engine;
        this.transmission = transmission;
    }
    @Override
    public void startEngine() {
        System.out.println("Starting V6 Engine");
    }

    @Override
    public void shiftGear() {
        System.out.println("Shifting gears in Automatic Transmission");
    }
}
