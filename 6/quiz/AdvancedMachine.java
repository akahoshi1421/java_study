package quiz;

public class AdvancedMachine extends Machine {
    private static int cnt = 0;

    public AdvancedMachine(String model, int price){
        super(model, price);
        cnt += price;
    }

    public static int getTotalPrice(){
        return cnt;
    }

    @Override
    public int getPrice(){
        return (int)(super.price * (1 + 0.1));
    }
}
