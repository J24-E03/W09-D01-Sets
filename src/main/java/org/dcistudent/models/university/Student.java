package org.dcistudent.models.university;

import lombok.*;

@Getter @Setter
public class Student {
    private Integer id = 0;
    private Boolean attended = false;

    public Student(Integer id) {
        this.setId(id);
    }

    @Override
    public String toString() {
        return "Student ID: " + this.getId();
    }
}
