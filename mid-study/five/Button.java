package five;

public class Button extends Component implements Clickable {
    private int cnt = 0;

    public Button(String label){
        super(label);
    }
    
    @Override
    public void click(){
        this.cnt++;
    }

    @Override
    public void print(){
        System.out.println("Button: My button (" + String.valueOf(this.cnt) + " clicks)");
    }
}
