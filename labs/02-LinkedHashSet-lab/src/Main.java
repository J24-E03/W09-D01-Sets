import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        part1();
        part2();
        part3();
        part4();
    }

    private static void part1() {
        System.out.println("** Part1 **");
        int[] customerIDs = {101, 102, 103, 101, 104, 102};
        System.out.println("Customer IDs: " + Arrays.toString(customerIDs));
        Set<Integer> uniqueCustomerIDs = new LinkedHashSet<>();

        for (int id : customerIDs) {
            uniqueCustomerIDs.add(id);
        }
        System.out.println("Final LinkedHashSet: " + uniqueCustomerIDs);

    }

    private static void part2() {
        System.out.println("\n** Part2 **");

        Set<String> logEntries = new LinkedHashSet<>();
        logEntries.add("2024-11-17 10:00:00: User logged in");
        logEntries.add("2024-11-17 10:05:00: User updated profile");
        logEntries.add("2024-11-17 10:00:00: User logged in");
        logEntries.add("2024-11-17 10:10:00: User logged out");

        System.out.println("Final LinkedHashset:");
        for (String log : logEntries) {
            System.out.println(log);
        }
    }

    private static void part3() {
        System.out.println("\n** Part3 **");
        Set<String> cart = new LinkedHashSet<>();

        // Add products (including duplicates)
        cart.add("Product 1");
        cart.add("Product 2");
        cart.add("Product 3");
        cart.add("Product 1");
        cart.add("Product 4");
        cart.add("Product 2");


        System.out.println("Final Shopping Cart:");
        System.out.println(cart);
    }
    private static void part4() {
        System.out.println("\n** Part4 **");
        // ArrayLists with duplicates
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Apple"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Banana", "Date", "Cherry", "Elderberry"));

        // Merging lists
        list1.addAll(list2);

        // Convert to LinkedHashSet to remove duplicates and maintain order
        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>(list1);

        // Convert back to ArrayList
        ArrayList<String> finalList = new ArrayList<>(uniqueSet);

        // Final list after merging and removing duplicates
        System.out.println("Merged and Deduplicated List:" + finalList);

    }
}