public class Quiz {
    public static void main(String[] args) {
        System.out.println(appendAll(args));
    }

    public static String appendAll(String[] args) {
        String result = "";
        for(String a: args){
            result += a;
            result += ";";
        }  

        return result;
    }
}