public class QuestionOne {
    public static void main(String[] args) {
        if(args.length != 0){
            String result = "";
            for(String one: args){
                result += one.substring(0, 1);
            }

            System.out.println(result);
        }
    }
}
