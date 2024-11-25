package org.dcistudent.service.university;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import org.dcistudent.models.university.Student;

@Getter
public class Registration {
    private Set<Student> students = new HashSet<>();

    public boolean registerStudent(Student student) {
        if (studentIsRegistered(student.getId())) {
            System.out.println("Student with id " + student.getId() + " is already registered.");

            return false;
        }

        students.add(student);

        return true;
    }

    public boolean studentIsRegistered(Integer id) {
        return students.stream().anyMatch(student -> student.getId().equals(id));
    }
}
