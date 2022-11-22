package sample1;

import sample1.pkg2.Student;
import sample1.pkg2.Teacher;

import sample1.pkg1.Member;

public class Main {
    public static void main(String[] args) {
        Member st = new Student("1234", "Taro", 1);
        System.out.printf(st.getProfile());
        Member tc = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(tc.getProfile());
    }
}
