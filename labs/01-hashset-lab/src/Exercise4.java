import java.util.HashSet;

public class Exercise4 {
    private static HashSet<Student> students;

    public static void main(String[] args) {

        students = new HashSet<>();
        students.add(new Student(2401));
        students.add(new Student(2402));
        students.add(new Student(2403));
        students.add(new Student(2404));
        students.add(new Student(2405));
        students.add(new Student(2406));

        System.out.println("All Registered Students: " + students);

        registerStudent(new Student(2407));
        registerStudent(new Student(2405));

        checkStudent(new Student(2408));
        checkStudent(new Student(2407));

        System.out.println("Final List of Registered Students: " + students);
    }

    private static void registerStudent(Student student) {
        if (students.contains(student)) {
            System.out.println("Student with ID = " + student.getId() + " already exists!");
            return;
        }
        students.add(student);
        System.out.println("New student with ID = " + student.getId() + " registered successfully.");
    }

    private static void checkStudent(Student student) {
        if (!students.contains(student)) {
            System.out.println("Student with ID = " + student.getId() + " is not registered.");
            return;
        }
        System.out.println("Student with ID = " + student.getId() + " is already registered.");
    }
}
