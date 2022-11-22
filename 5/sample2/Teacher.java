package sample2;

public class Teacher extends Member {
    String title;

    public Teacher(String id, String name, String title){
        super(id, name);
        this.title = title;
    }

    @Override
    String getProfile(){
        StringBuffer sb = new StringBuffer();
        sb.append("---- Teacher -----\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        sb.append("Title: ").append(this.title).append("\n");
        return sb.toString();
    }

    @Override
    String getEmail(){
        return super.name + DOMAIN;
    }
}
