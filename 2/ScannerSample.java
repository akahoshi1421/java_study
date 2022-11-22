import java.util.Scanner;
public class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            String str = scanner.nextLine();
            System.out.println(str);
        }
    }
}