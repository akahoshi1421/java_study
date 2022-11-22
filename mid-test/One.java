public class One {
    public static void main(String[] args) {
        int l = args.length - 1;
        if(l + 1 != 0){
            for(int i = l; i >= 0; i--){
                System.out.println(args[i]);
            }
        }
        else{
            System.out.println("No input.");
        }
    }
}
