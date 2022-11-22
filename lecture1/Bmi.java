public class Bmi {
    public static void printRisk(int age, double h, double w) {
        double hm = h / 100;
        double bmi = w / (hm * hm);
        String result;

        if(bmi < 22){
            if(age < 45){
                result = "LOW";
            }
            else{
                result = "Medium";
            }
        }
        else{
            if(age < 45){
                result = "Medium";
            }
            else{
                result = "High";
            }
        }

        System.out.printf("Your BMI: %f\nYour risk: %s\n", bmi, result);
    }

    public static void main(String[] args) {
        int age = 30;
        double h = 170.0;
        double w = 70.0;

        printRisk(age, h, w);
    }
}