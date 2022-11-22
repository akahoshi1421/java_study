package sample1.pkg1;

import sample1.pkg2.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Taro", 4);

        Student student2 = new Student("Jiro");

        if(student.belongsToCourse()){
            System.out.println("Belogs to a couse");
        }

        if(student2.belongsToCourse(30)){
            System.out.println("Belogs to a couse");
        }

    }
}
