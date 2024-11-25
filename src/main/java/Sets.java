import java.util.HashSet;

public class Sets {

    //4. Set Membership in a Student Registration System
    HashSet<Integer> registeredStudents = new HashSet<>();

    // Method to register a student
    public boolean registerStudent(int studentID) {
        if (registeredStudents.contains(studentID)) {
            System.out.println("Student with ID " + studentID + " is already registered.");
            return false;
        } else {
            registeredStudents.add(studentID);
            System.out.println("Student with ID " + studentID + " has been successfully registered.");
            return true;
        }

    }

    // Method to check if a student is already registered
    public boolean isStudentRegistered(int studentID) {
        if (registeredStudents.contains(studentID)) {
            System.out.println("Student with ID " + studentID + " is already registered.");
            return true;
        } else {
            System.out.println("Student with ID " + studentID + " is not registered.");
            return false;
        }
    }

    // Method to display all registered students
    public void displayRegisteredStudents() {
        System.out.println("Registered Students:");

        for (int studentID : registeredStudents) {
            System.out.println("Student ID: " + studentID);
        }
    }


    //5. Tracking Attendance in a Class
    HashSet<Integer> attendedStudents = new HashSet<>();

    //Mark a student as attended (add their ID to the HashSet).
    public void markAsAttended(int studentID) {
        if (attendedStudents.add(studentID)) {
            System.out.println("Student with ID " + studentID + " has attended the class.");
        } else {
            System.out.println("Student with ID " + studentID + " is already marked as attended.");
        }
    }

    // Method to check if a student has attended the class
    public boolean hasStudentAttended(int studentID) {
        if (attendedStudents.contains(studentID)) {
            System.out.println("Student with ID " + studentID + " has attended the class.");
            return true;
        } else {
            System.out.println("Student with ID " + studentID + " has not attended the class.");
            return false;
        }
    }

    // Method to display all students who attended the class
    public void displayAttendedStudents() {
        System.out.println("Students who have attended the class:");
        for (int studentID : attendedStudents) {
            System.out.println("Student ID: " + studentID);
        }
    }


    public static void main(String[] args) {
        HashSet<String> developerSkillsA = new HashSet<>();
        developerSkillsA.add("Java");
        developerSkillsA.add("Python");
        developerSkillsA.add("PHP");
        developerSkillsA.add("HTML");

        HashSet<String> developerSkillsB = new HashSet<>();
        developerSkillsB.add("Java");
        developerSkillsB.add("JavaScript");
        developerSkillsB.add("C");
        developerSkillsB.add("C++");
        developerSkillsB.add("PHP");

        //Union: Find the combined skills of both developers.
        HashSet<String> union = new HashSet<>(developerSkillsA);
        union.addAll(developerSkillsB);
        System.out.println("Union (combined skills of both developers) " + union);

        // Intersection: Find the common skills between both developers
        HashSet<String> intersection = new HashSet<>(developerSkillsA);
        intersection.retainAll(developerSkillsB);
        System.out.println("Intersection (Common Skills) :  " + intersection);

        //Difference: Find the skills that are unique to "Developer A" (i.e., not in "Developer B").
        HashSet<String> difference = new HashSet<>(developerSkillsA);
        difference.removeAll(developerSkillsB);
        System.out.println("Difference (Skills unique to Developer A): " + difference);

        //4
        Sets system = new Sets();

        // Register students
        system.registerStudent(101);
        system.registerStudent(102);
        system.registerStudent(101);

        // Check if specific students are registered
        system.isStudentRegistered(101);
        system.isStudentRegistered(103);

        // Display all registered students
        system.displayRegisteredStudents();

        //5 Display the list of all students who attended the class.
        // Mark students as attended
        system.markAsAttended(101);
        system.markAsAttended(102);
        system.markAsAttended(103);
        system.markAsAttended(101); //Duplicate

        // Check if specific students have attended
        system.hasStudentAttended(101);
        system.hasStudentAttended(104);

        // Display the list of students who attended the class
        system.displayAttendedStudents();
    }
}








