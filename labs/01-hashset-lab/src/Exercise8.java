import java.util.HashSet;
import java.util.Set;

public class Exercise8 {

    private static Set<String> voters;

    public static void main(String[] args) {
        voters = new HashSet<>();
        vote("Person1");
        vote("Person2");
        vote("Person3");
        vote("Person4");
        vote("Person5");

        if(!hasVoted("Person6")) {
            vote("Person6");
        }

        System.out.println("Total number of votes: " + totalVotes());

    }

    private static void vote(String name) {
        if(voters.contains(name)){
            System.out.println(name + " has already voted!");
            return;
        }
        System.out.println(name + " votes now.");
        voters.add(name);
    }

    private static boolean hasVoted(String name) {
        if(voters.contains(name)) {
            System.out.println(name + " hast already voted.");
            return true;
        }
        System.out.println(name + " has not voted yet.");
        return false;
    }

    private static int totalVotes() {
        return voters.size();
    }

}
