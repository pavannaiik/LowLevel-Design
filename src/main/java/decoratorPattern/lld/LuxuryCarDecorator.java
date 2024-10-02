package decoratorPattern.lld;

public class LuxuryCarDecorator extends CarDecorator{
    public LuxuryCarDecorator(Car car) {
        super(car);
    }
    public void assemble(){
        super.assemble();
        System.out.println("Adding Luxury features");
    }
}
