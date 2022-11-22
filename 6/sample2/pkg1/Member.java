package sample2.pkg1;

abstract public class Member implements Comparable<Member> {
    protected static final String DOMAIN = "@iniad.org";
    public String id;
    protected String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }


    abstract protected String getEmail();

    public String getProfile(){
        StringBuffer sb = new StringBuffer();
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        sb.append(canReserveRoom() ? "Room: OK" : "Room: NO").append("\n");
        return sb.toString();
    }

    public int compareTo(Member m){
        return id.compareTo(m.id);
    }

    abstract public boolean canReserveRoom();
}
