package assignment1.figures;

import assignment1.base.Figure;

public class Pyramid extends Figure {
    public Pyramid(int height){
        super(height);
    }

    @Override
    public String draw(){
        StringBuffer sb = new StringBuffer();

        int space = super.height - 1;
        int ast = 1;
        for(int i = 0; i < super.height; i++){
            //oneLine(space)
            for(int i2 = 0; i2 < space; i2++){
                sb.append(" ");
            }
            space--;
            //oneLine(ast)
            for(int i2 = 0; i2 < ast; i2++){
                sb.append("*");
            }
            ast += 2;
            sb.append("\n");
        }
        
        return sb.toString();
    }
}
