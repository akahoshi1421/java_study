package four;

public class Product {
    public final static double TAX_RATE = 0.1;
    protected final String name;
    protected final int price;
    
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return (int)((double)price * (1 + TAX_RATE));
    }
}
