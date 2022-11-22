package sample2;

public class Teacher extends Member {
    String title;

    public Teacher(String id, String name, String title){
        super(id, name);
        this.title = title;
    }

    String getTeacherProfile(){
        StringBuffer sb = new StringBuffer();
        sb.append("---- Teacher -----\n");
        sb.append("ID: ").append(super.id).append("\n");
        sb.append("Name: ").append(super.name).append("\n");
        sb.append("Title: ").append(this.title).append("\n");
        String email = super.getEmail();
        sb.append("Email: ").append(email).append("\n");
        return sb.toString();
    }
}
