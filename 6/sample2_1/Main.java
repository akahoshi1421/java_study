package sample2_1;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("This");
        lst.add("is");
        lst.add("INIAD");
        for(String s : lst) {
            System.out.println(s);
        }
    } 
}