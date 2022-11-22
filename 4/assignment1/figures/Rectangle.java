package assignment1.figures;

import assignment1.base.Figure;

public class Rectangle extends Figure {
    protected final int width;

    public Rectangle(int height, int width){
        super(height);
        this.width = width;
    }

    @Override
    public String draw(){
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < super.height; i++){
            for(int i2 = 0; i2 < this.width; i2++){
                sb.append("*");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
