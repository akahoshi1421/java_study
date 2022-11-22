public class Circle{
    double radius;
    String color;
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }

    public double a(){
        return Math.PI * radius * radius;
    }
}