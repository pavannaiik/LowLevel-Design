package decoratorPattern.lld;

public class SportsCarDecorator extends CarDecorator{
    public SportsCarDecorator(Car car) {
        super(car);
    }
    public void assemble(){
        super.assemble();
        System.out.println("Adding sports features");
    }
}
