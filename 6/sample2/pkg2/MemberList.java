package sample2.pkg2;
import java.util.HashMap;
import java.util.Map;

import sample2.pkg1.Member;

public class MemberList {
    Map<String, Member> lst;
    public MemberList(){
        this.lst = new HashMap<>();
    }

    public void add(Member member){
        this.lst.put(member.id, member);
    }

    public Member get(String id){
        return this.lst.get(id);
    }

    public void remove(String id){
        this.lst.remove(id);
    }

    public int count(){
        return this.lst.size();
    }
}
