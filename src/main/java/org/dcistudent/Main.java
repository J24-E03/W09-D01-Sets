package org.dcistudent;

import org.dcistudent.models.election.Ballot;
import org.dcistudent.models.university.Student;
import org.dcistudent.service.election.Voting;
import org.dcistudent.service.university.Attendance;
import org.dcistudent.service.university.Registration;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this
                .exercise1()
                .exercise2()
                .exercise3()
                .exercise4()
                .exercise5()
                .exercise6()
                .exercise7()
                .exercise8()
        ;
    }

    public Main exercise1() {
        System.out.println("Exercise 1:");

        Set<Integer> set = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        set.addAll(Set.of(6, 7, 8, 9));

        if (set.contains(3)) {
            System.out.println("Id 3 exists.");
        }

        set.remove(1);
        System.out.println(set);
        System.out.println("----------");

        return this;
    }

    public Main exercise2() {
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));
        list = new ArrayList<>(new HashSet<>(list));

        System.out.println("Exercise 2:");
        System.out.println(list);
        System.out.println("----------");

        return this;
    }

    public Main exercise3() {
        Set<String> devA = new HashSet<>(Set.of("Skill1", "Skill2", "Skill6", "Skill10"));
        Set<String> devB = new HashSet<>(Set.of("Skill2", "Skill3", "Skill4", "Skill10"));

        System.out.println("Exercise 3:");

        Set<String> union = new HashSet<>(devA);
        union.addAll(devB);
        System.out.println("Union skills: " + union);

        Set<String> intersection = new HashSet<>(devA);
        intersection.retainAll(devB);
        System.out.println("Intersection skills: " + intersection);

        Set<String> difference = new HashSet<>(devA);
        difference.removeAll(devB);
        System.out.println("Difference skills: " + difference);

        System.out.println("----------");

        return this;
    }

    public Main exercise4() {
        System.out.println("Exercise 4:");

        Registration registration = new Registration();
        registration.registerStudent(new Student(1));
        registration.registerStudent(new Student(2));

        System.out.println("Add student not registered: " + registration.registerStudent(new Student(3)));
        System.out.println("Add student not registered: " + registration.registerStudent(new Student(3)));
        System.out.println("Check if already registered: " + registration.studentIsRegistered(3));
        System.out.println("Registered students: " + registration.getStudents());

        System.out.println("----------");

        return this;
    }

    public Main exercise5() {
        System.out.println("Exercise 5:");

        Student student1 = new Student(1);
        Student studentTest = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        Attendance attendance = new Attendance();
        attendance.register(student1);
        attendance.register(studentTest);
        attendance.register(student2);
        attendance.register(student3);

        attendance.setAttended(student1, true);
        attendance.setAttended(student3, true);

        System.out.println("Student 1 attended: " + attendance.findStudent(student1).getAttended());
        System.out.println("Student 2 attended: " + attendance.findStudent(student2).getAttended());
        System.out.println("Attended students: " + attendance.findAttendedStudents());

        System.out.println("----------");

        return this;
    }

    public Main exercise6() {
        System.out.println("Exercise 6:");

        String string = "aaaaabbbcdddddefffff";
        Set<Character> once = new HashSet<>();
        Set<Character> repeated = new HashSet<>();

        for (char c : string.toCharArray()) {
            if (repeated.contains(c)) {
                continue;
            }

            if (once.contains(c)) {
                once.remove(c);
                repeated.add(c);
                continue;
            }

            once.add(c);
        }

        System.out.println("Once: " + once);

        System.out.println("----------");

        return this;
    }

    public Main exercise7() {
        List<String> cartA = new ArrayList<>(List.of("Product1", "Product2", "Product3", "Product4"));
        List<String> cartB = new ArrayList<>(List.of("Product3", "Product4", "Product5", "Product6"));

        System.out.println("Exercise 7:");

        Set<String> union = new HashSet<>(cartA);
        union.addAll(cartB);
        System.out.println("Union products: " + union);

        Set<String> intersection = new HashSet<>(cartA);
        intersection.retainAll(cartB);
        System.out.println("Intersection products: " + intersection);

        Set<String> difference = new HashSet<>(cartA);
        difference.removeAll(cartB);
        System.out.println("Difference products: " + difference);

        System.out.println("----------");

        return this;
    }

    public Main exercise8() {
        Voting voting = new Voting();

        System.out.println("Exercise 8:");

        Ballot voter1 = voting.registerVoter("Voter 1");
        Ballot voter2 = voting.registerVoter("Voter 2");
        Ballot voter3 = voting.registerVoter("Voter 3");

        voting.vote(voter1, "X");
        voting.vote(voter2, "   ");
        voting.vote(voter3, "XX");

        System.out.println("Voter 1 voted: " + voting.hasVoted(voter1));
        System.out.println("Voter 2 voted: " + voting.hasVoted(voter2));
        System.out.println("Voter 3 voted: " + voting.hasVoted(voter3));
        System.out.println("Total votes: " + voting.totalVotes());

        System.out.println("----------");

        return this;
    }
}