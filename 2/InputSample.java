import java.util.Scanner;

public class InputSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer result = new StringBuffer();
        
        for(;;){
            String a = scanner.nextLine();
            if(a.equals("")){
                System.out.println(result.toString());
                break;
            }
            else{
                result.append(a + "\n");
            }
        }
    }
}
