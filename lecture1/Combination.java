public class Combination {
    public static int combination(int n, int r) {
        int result = 1;
        int result2 = 1;

        for(int cnt2 = r; cnt2 > 0; cnt2--){
            result *= cnt2;
            result2 *= n;
            n--;
        }

        return (int)(result2 / result);
    }

    public static void main(String[] args) {
        int n = 10;
        int r = 3;
        int c = combination(n, r);
        System.out.printf("C(%d, %d) = %d\n", n, r, c);
    }
}