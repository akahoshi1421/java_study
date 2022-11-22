package five;

abstract public class Figure {
    protected double size;
    
    public Figure(double size){
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    abstract public void explain();
}
