public class Button {
    public final String label;
    private boolean pressed;
    private static int numPressed = 0;

    public Button(String label){
        this.label = label;
        this.pressed = false;
    }

    public Button(){
        this.label = "Untitled";
        this.pressed = false;
    }

    public void press(){
        this.pressed = true;
        numPressed++;
    }

    public void release(){
        this.pressed = false;
        numPressed--;
    }
    
    public static int getNumPressed(){
        return numPressed;
    }

    public boolean isPressed(){
        return this.pressed;
    }
}
