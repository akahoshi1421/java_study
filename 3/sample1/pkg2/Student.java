package sample1.pkg2;

public class Student {
    final String name;
    int grade;
    static int cnt = 0;
    final static int MIN_COURSE_GRADE = 2;
    final static int MIN_COURSE_CREDIT = 22;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        cnt++;
    }

    public Student(String name){
        this.name = name;
        this.grade = 1;

        cnt++;
    }

    public boolean belongsToCourse(){
        return this.grade >= 2;
    }

    public boolean belongsToCourse(int credits){
        return (this.grade >= 2) && (credits >= 22);
    }
}
