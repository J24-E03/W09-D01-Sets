import java.util.*;
public class Exercises1_2_3 {
    public static void main(String[] args) {

        part1();
        part2();
        part3();

    }

    private static void part1() {
        System.out.println("** Part1 **");
        HashSet<Integer> employeesIDs = new HashSet<>();

        employeesIDs.addAll(Arrays.asList(1230, 1231, 1232, 1233, 1234, 1235, 1236, 1237, 1238, 1239));
        System.out.println("Employee IDs:");
        System.out.println(employeesIDs);

        System.out.println("1240 exists? " + employeesIDs.contains(1240));
        System.out.println("1238 exists? " + employeesIDs.contains(1238));

        System.out.println("Removing 1230 ..");
        employeesIDs.remove(1230);

        System.out.println("Employee IDs:");
        System.out.println(employeesIDs);
    }

    private static void part2() {
        System.out.println("\n** Part2 **");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7, 8, 7, 8, 9, 10, 11, 11, 12));
        System.out.println("Non-unique numbers:");
        System.out.println(numbers);

        numbers = new ArrayList<>(new HashSet<>(numbers));
        System.out.println("Unique numbers:");
        System.out.println(numbers);
    }

    private static void part3() {
        System.out.println("\n** Part3 **");

        Set<String> skillsOfA = new HashSet<>(Arrays.asList("Skill1", "Skill2", "skill3", "Skill4", "Skill5", "Skill6"));
        Set<String> skillsOfB = new HashSet<>(Arrays.asList("Skill3", "Skill4", "skill6", "Skill7", "Skill8", "Skill9"));

        System.out.println("PersonA skills: " + skillsOfA);
        System.out.println("PersonB skills: " + skillsOfB);

        Set<String> unionSkills = new HashSet<>(skillsOfA);
        unionSkills.addAll(skillsOfB);
        System.out.println("Union (Skills of A and B together): " + unionSkills);

        Set<String> intersectionSkills = new HashSet<>(skillsOfA);
        intersectionSkills.addAll(skillsOfA);
        intersectionSkills.retainAll(skillsOfB);
        System.out.println("Intersection (Common skills):" + intersectionSkills);

        Set<String> differenceSkills = new HashSet<>(skillsOfA);
        differenceSkills.remove(skillsOfB);
        System.out.println("Difference (Skills unique to Developer A): " + differenceSkills);
    }

}