import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        int wordCnt = 0;
        Scanner scan = new Scanner(System.in);

        for(;;){
            String str = scan.nextLine();
            if(str.length() != 0){
                wordCnt += str.length();
            }
            else{
                System.out.println(wordCnt);
                break;
            }
        }

        scan.close();
    }
}
