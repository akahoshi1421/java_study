package sample2;

public class Main {
    public static void main(String[] args) {
        Member st = new Student("1234", "Taro", 1);
        System.out.printf(st.getProfile());
        Member tc = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(tc.getProfile());
    }
}
