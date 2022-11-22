package sample1;

import sample1.pkg2.Student;
import sample1.pkg2.Teacher;

import java.util.ArrayList;
import java.util.List;

import sample1.pkg1.Member;
import sample1.pkg1.Programmer;
import sample1.pkg2.*;

public class Main {
    public static void main(String[] args) {
        List<Member> lst = new ArrayList<Member>();
        lst.add(new Student("2234", "Jiro", 2));
        lst.add(new Student("2234", "Jiro2", 2));

        Member st = new Student("1234", "Taro", 1);
        System.out.printf(st.getProfile());
        Member tc = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(tc.getProfile());

        EnginneringStudent st2 = new EnginneringStudent("1234", "Taro", 4);
        System.out.printf(st2.getProfile());
        checkSkill(st2);
    
        EnginneringTeacher tc2 = new EnginneringTeacher("1000", "Inoue", "Professor");    
        System.out.printf(tc2.getProfile());
        checkSkill(tc2);
    }

    private static void checkSkill(Programmer p){
        if(p.canWritePython()){
            System.out.println("I can write Python");
        }
        if(p.canWriteC()){
            System.out.println("I can write C");
        }
        if(p.canWriteJava()){
            System.out.println("I can write Java");
        }
    }
}
