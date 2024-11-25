import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text to find the unique characters in it:");
        String text = sc.nextLine();
        sc.close();
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> repeatedChars = new HashSet<>();
        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (c != ' ') {
                if (uniqueChars.contains(c)) {
                    uniqueChars.remove(c);
                    repeatedChars.add(c);
                } else if (!repeatedChars.contains(c)) {
                    uniqueChars.add(c);
                }
            }
        }

        System.out.println("Unique Characters: " + uniqueChars);
        System.out.println("Repeated Characters: " + repeatedChars);

        for (char c : text.toCharArray()) {
            if (!repeatedChars.contains(c)) {
                System.out.println("The first non-repeated char: " + c);
                return;
            }
        }
    }
}
