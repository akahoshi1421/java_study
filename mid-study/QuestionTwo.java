import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        int result = 0;
        Scanner scan = new Scanner(System.in);

        for(;;){
            String str = scan.nextLine();
            try{
                int one = Integer.parseInt(str);
                result += one;
            }
            catch(NumberFormatException e){
                System.out.println(result);
                break;
            }
        }
        scan.close();
    }
}
