package org.dcistudent.service.university;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.*;
import org.dcistudent.models.university.Student;

@Getter @Setter
public class Attendance {
    private Set<Student> students = new HashSet<>();

    public boolean register(Student student) {
        try {
            this.findStudent(student);

            return false;
        } catch (RuntimeException e) {
            this.getStudents().add(student);

            return true;
        }
    }

    public boolean setAttended(Student student, Boolean attended) {
        try {
            this.findStudent(student).setAttended(attended);

            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

    public Student findStudent(Student student) {
        return this
                .getStudents()
                .stream()
                .filter(s -> s.getId().equals(student.getId()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not found."))
        ;
    }

    public Set<Student> findAttendedStudents() {
        return this
                .getStudents()
                .stream()
                .filter(Student::getAttended)
                .collect(Collectors.toSet())
        ;
    }
}
