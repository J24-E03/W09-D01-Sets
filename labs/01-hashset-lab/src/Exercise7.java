import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Apple");
        List<String> list2 = Arrays.asList("Banana", "Cherry", "Elderberry", "Fig", "Banana");

        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (unique to first list): " + difference);
    }
}
