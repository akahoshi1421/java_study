package five;

public class Circle extends Figure implements Measurable {
    public Circle(double size){
        super(size);
    }

    @Override
    public void explain() {
        System.out.println("Cirlce with a radius of " + String.valueOf(super.size));
    }

    @Override
    public double area() {
        return super.size * super.size * Math.PI;
    }
}
