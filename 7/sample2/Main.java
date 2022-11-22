package sample2;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<String> naturalOrder = Comparator.naturalOrder();
        List<String> lst = new ArrayList<String>();
        lst.add("This");
        lst.add("is");
        lst.add("INIAD");
        Collections.sort(lst);
        lst.sort(naturalOrder);
        for(String s : lst) {
            System.out.println(s);
        }
    } 
}