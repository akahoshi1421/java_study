package sample2;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("1234", "Taro", 1);
        Teacher tc = new Teacher("1000", "Inoue", "Professor");

        printMember(st);
        
        System.out.println(st.getEmail());
        System.out.println(st.getStudentProfile());

        printMember(tc);
        
        System.out.println(tc.getEmail());
        System.out.println(tc.getTeacherProfile());
    }

    private static void printMember(Member m){
        if(m instanceof Student){
            Student st = (Student)m;
            System.out.printf("%s %s %d\n", st.id, st.name, st.grade);
        }
    }
}
