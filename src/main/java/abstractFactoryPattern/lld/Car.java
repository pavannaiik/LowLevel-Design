package abstractFactoryPattern.lld;

public abstract class Car {
    protected String engine;
    protected String transmission;

    public abstract void startEngine();
    public abstract void shiftGear();
}
