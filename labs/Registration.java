package labs;

import java.util.HashSet;

public class Registration {

    private HashSet<Student> students = new HashSet<>();

    public boolean registerStudent(Student student){
        if(studentIsRegistered(student.getId())){
            System.out.println();
        }
    }
}
