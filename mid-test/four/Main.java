package four;

public class Main {
    public static void main(String[] args) {
        Food f1 = new Food("Water", 100, true);
        System.out.println(f1.getName());
        System.out.println(f1.getPrice());
        Food f2 = new Food("Beer", 200, false);
        System.out.println(f2.getName());
        System.out.println(f2.getPrice());
    }
}