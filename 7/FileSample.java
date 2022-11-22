import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSample {
  public static void main(String[] args) {
    try{
        write(args[0]);
    }
    catch(IOException a){
        System.out.println("aaa");
    }

  }
  public static void write(String str) throws IOException{
      File file = new File("test.txt");
      FileWriter writer = new FileWriter(file, true);
      writer.write(str);
      writer.close();
  }
}