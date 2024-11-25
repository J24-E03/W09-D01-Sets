import java.util.HashSet;
import java.util.Set;

public class Exercise5 {

    private static Set<Student> attendance;

    public static void main(String[] args) {
        attendance = new HashSet<>();
        attendance.add(new Student(2401));
        attendance.add(new Student(2402));
        attendance.add(new Student(2403));
        attendance.add(new Student(2404));
        attendance.add(new Student(2405));
        attendance.add(new Student(2406));

        markAttendance(new Student(2407));
        markAttendance(new Student(2405));

        checkAttendance(new Student(2407));
        checkAttendance(new Student(2408));

        System.out.println("All attended Students are: ");
        System.out.println(attendance);

    }

    private static void markAttendance(Student student) {
        if (attendance.contains(student)) {
            System.out.println("Student with ID = " + student.getId() + " is already marked as attended.");
            return;
        }
        attendance.add(student);
        System.out.println("Student with ID = " + student.getId() + " marked as attended.");
    }

    private static void checkAttendance(Student student) {
        if (attendance.contains(student)) {
            System.out.println("Student with ID = " + student.getId() + " has attended the class.");
        } else {
            System.out.println("Student with ID = " + student.getId() + " has not attended the class.");
        }
    }
}
