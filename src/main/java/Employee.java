import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Employee {



        public static void main(String[] args) {
            HashSet<Integer> employee = new HashSet<>();
            employee.add(101);
            employee.add(102);
            employee.add(103);
            employee.add(104);
            employee.add(102);

            int idCheck = 103;
            if(employee.contains(idCheck)){
                System.out.println("Employee ID " + idCheck + " exists");
            } else {
                System.out.println("Employee ID " + idCheck + " doesn't exists");
            }
            int idToRemove = 103;
            if (employee.remove(idToRemove)) {
                System.out.println("Employee ID " + idToRemove + " was removed from the set.");
            } else {
                System.out.println("Employee ID " + idToRemove + " does not exist in the set.");
            }
            System.out.println("Employee IDs in the set: " + employee);

            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(4);
            numbers.add(5);
            // Convert the ArrayList to a HashSet to remove duplicates
            HashSet<Integer> uniqueNumbersSet = new HashSet<>(numbers);

            // Convert the HashSet back into a List
            List<Integer> uniqueNumbersList = new ArrayList<>(uniqueNumbersSet);

            // Print the resulting list of unique integers
            System.out.println("List of unique integers: " + uniqueNumbersList);
        }
    }


