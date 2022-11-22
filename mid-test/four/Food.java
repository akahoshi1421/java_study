package four;

public final class Food extends Product {
    public static final double REDUCED_TAX_RATE = 0.08;
    private final boolean is_reduced;

    public Food(String name, int price, boolean is_reduced){
        super(name, price);
        this.is_reduced = is_reduced;
    }

    @Override
    public int getPrice() {
        if(is_reduced){
            return (int)((double)price * (1 + REDUCED_TAX_RATE));
        }
        else{
            return (int)((double)price * (1 + TAX_RATE));
        }
    }
}
