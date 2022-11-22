package q3;

public class Label {
    public static String HEADER = "--- INIAD ---\n";
    private int id;
    private String name;
    private static int cnt = 0;

    public Label(String name){
        cnt++;
        this.id = cnt;
        this.name = name;
    }

    public String getDisplay(){
        return HEADER + "[" + String.valueOf(this.id) + "] " + this.name; 
    }

}
