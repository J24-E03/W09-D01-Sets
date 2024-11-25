import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Tasks1 {
    public static void main(String[] args) {
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
    }

    private static void exercise3() {
        HashSet<String> developerA = new HashSet<>(Arrays.asList("HTML", "CSS", "Javascript", "REACT", "Swift", "C#"));
        HashSet<String> developerB = new HashSet<>(Arrays.asList("HTML", "JAVA", "SQL", "REACT", "Kotlin"));

        developerA.addAll(developerB);
        System.out.println(developerA);

        developerA.retainAll(developerB);
        System.out.println(developerA);

        developerA.removeAll(developerB);
        System.out.println(developerA);
    }

    private static void exercise4() {
        HashSet<Student> hashSet = new HashSet<>(Arrays.asList(new Student("Tobias"),
                new Student("Mark"), new Student("Florian"),
                new Student("Klaus"), new Student("Helmuth")));
        System.out.println(hashSet);
    }

    private static void exercise5() {
        HashSet<Student> hashSet = new HashSet<>();
        Student student1 = new Student("Robert");
        Student student2 = new Student("Liam");
        Student student3 = new Student("Wolfgang");
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        System.out.println(hashSet);

        HashSet<Student> students = new HashSet<>();

        if (hashSet.contains(student2)) {
            students.add(student2);
        }
        if (hashSet.contains(student3)) {
            students.add(student3);
        }
        System.out.println(students);
    }

    private static void exercise6() {
        String string = "aaabbccdeefgh";
        for (Character c : string.toCharArray()) {
            if (string.indexOf(c) == string.lastIndexOf(c)) {
                System.out.println("The first character that appears only once is: " + c);
                break;
            }
        }

        ArrayList<Character> arrayList = new ArrayList<>();
        for (Character c : string.toCharArray()) {
            arrayList.add(c);
        }

        HashSet<Character> hashSet = new HashSet<>(arrayList);
        HashSet<Character> repeatedCharacters = new HashSet<>();
        for (Character c : string.toCharArray()) {
            if (string.indexOf(c) != string.lastIndexOf(c)) {
                repeatedCharacters.add(c);
            }
        }

        System.out.println(repeatedCharacters);

        hashSet.removeAll(repeatedCharacters);
        System.out.println(hashSet.iterator().next());

    }

    private static void exercise7() {
        HashSet<Product> hashSet1 = new HashSet<>(Arrays.asList(new Product("Bread"), new Product("Milk"), new Product("Butter")));
        HashSet<Product> hashSet2 = new HashSet<>(Arrays.asList(new Product("Potatoes"), new Product("Milk"), new Product("Apples")));

        HashSet<Product> products = new HashSet<>();
        products.addAll(hashSet1);
        products.addAll(hashSet2);
        System.out.println(products);

        hashSet1.retainAll(hashSet2);
        System.out.println(hashSet1);

        hashSet1.removeAll(hashSet2);
        System.out.println(hashSet1);
    }

    private static void exercise8() {
        Voter.vote("Tom");
        Voter.vote("Ben");
        Voter.vote("Richard");
        Voter.vote("Andrew");
        Voter.vote("Ben");
        Voter.getTotalVotes();
    }
}
