package q3;

public class Item {
    private String label;
    private int price;
    private static int count = 0;

    public Item(String label, int price){
        this.label = label;
        this.price = price;
        count += price;
    }

    public String getDisplay(){
        return this.label + " (" + String.valueOf(this.price) + ")";
    }

    public static int getTotal(){
        return count;
    }
}
