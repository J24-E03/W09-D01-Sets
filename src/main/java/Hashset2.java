import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Hashset2 {
    public static char repeatedCharacter(String str){
        // HashSets to track characters
        HashSet<Character> appearSet = new HashSet<>();
        HashSet<Character> repeatedSet = new HashSet<>();

        //find the first character that appears only once.
        for(char c : str.toCharArray()){
            // If the character is already in seenSet, add it to repeatedSet
            if(appearSet.contains(c)){
                repeatedSet.add(c);
            } else {
                appearSet.add(c);
            }
        }
        //Return the first character that is not in the second set (indicating it hasn’t been repeated)

        for(char c : str.toCharArray()){
            if(!repeatedSet.contains(c)){
                return c; // Return the first non-repeated character
            }
        }
        return '-';
    }
    //7. Comparing Two Lists for Uniqueness
    public static void compareItems(List<String> list1,List<String>list2){
        // Convert the lists to HashSets to remove duplicates and perform set operations
        HashSet<String> set1 = new HashSet<>(list1);
        HashSet<String> set2 = new HashSet<>(list2);
        // Union: All unique products in either list
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);
        // Intersection: Common products in both lists
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);  // Keep only common elements
        // Difference: Products in the first list but not in the second list
        HashSet<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);  // Remove elements in set2 from set1
        // Display the results
        System.out.println("Union (Unique products in either list): " + union);
        System.out.println("Intersection (Common products in both lists): " + intersection);
        System.out.println("Difference (Products in the first list but not the second): " + difference);
    }
           //8. Set-Based Voting System
    HashSet<String>voters = new HashSet<>();
    //vote(String name): Adds a voter to the HashSet if they haven't voted already.

    public boolean vote(String name) {
        if (voters.contains(name)) {
            System.out.println(name + "has already voted");
            return false;
        } else {
            voters.add(name);
            System.out.println(name + "has voted.");
            return true;
        }
    }
    // Method to check if a person has already voted
    public boolean hasVoted(String name){
        return(voters.contains(name));

    }
    // Method to return the total number of votes cast
    public int totalVotes() {
        return voters.size();  // The number of unique voters
    }



    public static void main(String[] args) {
        String input1 = "Loss";
        String input2 = "afffa";
        System.out.println("First non-repeated character in 'loss': " + repeatedCharacter(input1));
        System.out.println("First non-repeated character in 'afffa': " + repeatedCharacter(input2));

        //7. Comparing Two Lists for Uniqueness
        List<String> list1 = Arrays.asList("Apple", "Banana", "Orange", "Apple", "Mango");
        List<String> list2 = Arrays.asList("Grapes", "Banana", "Apple", "Pineapple", "Mango");

        // Compare the two lists of products
        compareItems(list1, list2);

        //8. Set-Based Voting System
        Hashset2 votingSystem = new Hashset2();
        votingSystem.vote("Anna");
        votingSystem.vote("Clair");
        votingSystem.vote("Marita");
        votingSystem.vote("Anna");

        votingSystem.hasVoted( "Anna");
        votingSystem.hasVoted( "Clair");
        votingSystem.hasVoted( "Marita");

        System.out.println("Total votes : " + votingSystem.totalVotes());



    }
}
