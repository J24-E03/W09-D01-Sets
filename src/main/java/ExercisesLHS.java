import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ExercisesLHS {
    public static void main(String[] args) {
        LinkedHashSet<Integer> customerID = new LinkedHashSet<>();
        customerID.add(1);
        customerID.add(2);
        customerID.add(3);
        customerID.add(4);
        customerID.add(5);
        customerID.add(6);
        customerID.add(1);
        ;//Duplicate

        System.out.println("Customer IDs (duplicates removed, order preserved): " + customerID);

        LinkedHashSet<String> logEntries = new LinkedHashSet<>();

        // Adding log entries (with some duplicates)
        logEntries.add("2024-11-17 10:00:00: User logged in");
        logEntries.add("2024-11-17 10:05:00: User updated profile");
        logEntries.add("2024-11-17 10:00:00: User logged in");// Duplicate
        logEntries.add("2024-11-17 10:10:00: User logged out");


        // Print the final log entries to verify that duplicates are removed and order is preserved
        System.out.println("Final Log Entries (duplicates removed, order preserved):");
        for (String log : logEntries) {
            System.out.println(log);
        }

        //3. Implementing a Unique Order of Products in an E-Commerce System
        LinkedHashSet<String> shoppingCart = new LinkedHashSet<>();
        shoppingCart.add("Apple");
        shoppingCart.add("Banana");
        shoppingCart.add("Orange");
        shoppingCart.add("Apple");  // Duplicate product
        shoppingCart.add("Grapes");
        shoppingCart.add("Banana"); // Duplicate product
        shoppingCart.add("Mango");

        System.out.println("Shopping Cart (duplicates removed, order preserved):");
        for (String product : shoppingCart) {
            System.out.println(product);
        }
        //4. Merging Two Lists and Removing Duplicates While Preserving Order
            ArrayList<String> list1 = new ArrayList<>();
            list1.add("Apple");
            list1.add("Banana");
            list1.add("Orange");

            ArrayList<String> list2 = new ArrayList<>();
            list2.add("Grapes");
            list2.add("Banana");
            list2.add("Mango");


            ArrayList<String> mergedList = new ArrayList<>();
            mergedList.addAll(list1);
            mergedList.addAll(list2);

            // Use LinkedHashSet to remove duplicates and preserve order
            LinkedHashSet<String> uniqueSet = new LinkedHashSet<>(mergedList);

            // Convert the LinkedHashSet back into an ArrayList
            ArrayList<String> finalList = new ArrayList<>(uniqueSet);

            // Print the final list
            System.out.println("Merged list with duplicates removed and order preserved:");
            for (String product : finalList) {
                System.out.println(product);
            }

        }
    }





