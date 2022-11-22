package q3;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("Water", 100);
        Item i2 = new Item("Milk", 200);
        System.out.println(i1.getDisplay());
        System.out.println(i2.getDisplay());
        System.out.println(Item.getTotal());
    }
}
