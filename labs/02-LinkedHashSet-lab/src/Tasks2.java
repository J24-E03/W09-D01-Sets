import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Tasks2 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private static void exercise1() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(101, 102, 103, 101, 104, 102));
        System.out.println(set);
    }

    private static void exercise2() {
        LocalDateTime localDateTime = LocalDateTime.now();

        ArrayList<String> list = new ArrayList<>();
        list.add(String.format("%s: User logged in", localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
        list.add(String.format("%s: User updated profile", localDateTime.plusMinutes(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
        list.add(String.format("%s: User logged in", localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
        list.add(String.format("%s: User logged out", localDateTime.plusMinutes(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));

        System.out.println("Log entries: ");
        LinkedHashSet<String> set = new LinkedHashSet<>(list);

        for (String s : set) {
            System.out.println(s);
        }
    }

    private static void exercise3() {
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList("Product 1", "Product 2", "Product 3", "Product 1", "Product 4", "Product 2"));
        System.out.println(set);
    }

    private static void exercise4() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("America", "Brazil", "Canada", "America"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Brazil", "Denmark", "Canada", "England"));

        list1.addAll(list2);

        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>(list1);

        ArrayList<String> finalList = new ArrayList<>(uniqueSet);

        System.out.println(finalList);
    }
}
