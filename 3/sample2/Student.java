package sample2;

public class Student extends Member {
    int grade;

    Student(String id, String name, int grade){
        super(id, name);
        this.grade = grade;
    }

    String getStudentProfile(){
        StringBuffer sb = new StringBuffer();
        sb.append("---- Student -----\n");
        sb.append("ID: ").append(super.id).append("\n");
        sb.append("Name: ").append(super.name).append("\n");
        sb.append("Grade: ").append(this.grade).append("\n");
        String email = super.getEmail();
        sb.append("Email: ").append(email).append("\n");
        return sb.toString();
    }
}
