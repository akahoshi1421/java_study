package sample2.pkg2;

import sample2.pkg1.Programmer;

public class EnginneringTeacher extends Teacher implements Programmer {
    public EnginneringTeacher(String id, String name, String title){
        super(id, name, title);
    }

    @Override
    public boolean canWritePython(){
        return true;
    }

    @Override
    public boolean canWriteC(){
        return true;
    }

    @Override
    public boolean canWriteJava(){
        return true;
    }
}
