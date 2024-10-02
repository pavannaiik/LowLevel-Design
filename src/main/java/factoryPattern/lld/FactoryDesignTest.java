package factoryPattern.lld;

public class FactoryDesignTest {
    public static void main(String[] args) {
        FactoryShape factoryShape = new FactoryShape();
        Shape shape = factoryShape.getShape("Square");
        shape.draw();
    }
}
