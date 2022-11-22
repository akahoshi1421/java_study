package assignment1.figures;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import assignment1.base.Writable;

public class WritablePyramid extends Pyramid  implements Writable{
    public WritablePyramid(int height){
        super(height);
    }

    @Override
    public void write(String filename){
        try{
            File f = new File(filename);
            FileWriter writer = new FileWriter(f, true);
            writer.write(super.draw());
            writer.close();
        }
        catch(IOException e){
            System.out.println("ERROR");
        }
    }
}
