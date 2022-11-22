package assignment1;

import assignment1.base.Figure;
import assignment1.figures.Pyramid;
import assignment1.figures.Rectangle;
import assignment1.figures.Square;
import assignment1.figures.WritablePyramid;

public class Main {
    public static void main(String[] args) {
        Pyramid p = new Pyramid(4);
        Rectangle r = new Rectangle(4, 6);
        Square s = new Square(10);
        WritablePyramid aaa = new WritablePyramid(20);

        aaa.write("aaa.txt");
    }
}