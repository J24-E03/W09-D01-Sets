import java.util.HashSet;

public class Voter {
    private static final HashSet<String> hashSet = new HashSet<>();

    private static int TOTAL_VOTES = 0;

    private final String name;

    public Voter(String name) {
        this.name = name;
    }

    public static void vote(String name) {
        if (hashSet.contains(name)) {
            System.out.println(name + " has already voted!");
        } else {
            TOTAL_VOTES++;
            hashSet.add(name);
            System.out.println(name + " successfully voted!");
        }
    }

    public static void hasVoted(String name) {
        if (hashSet.contains(name)) {
            System.out.println(name + " has already voted!");
        } else {
            System.out.println(name + " has not voted yet.");
        }
    }

    public static void getTotalVotes() {
        System.out.println("Total votes: " + TOTAL_VOTES);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
