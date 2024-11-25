import java.lang.reflect.Array;
import java.util.*;

public class SetClass {
    public static void main(String[] args) {

//        hashSets();
//        exercise();
//        linkedHashSets();
//        treeSets();
        linkedLists();
    }

    public static void hashSets(){

//        unique unordered data set
        HashSet<String> myStudents = new HashSet<>();

        myStudents.add("Marcel");
        myStudents.add("Marcel");
        myStudents.add("Kathrin");
        myStudents.add("Kai");

        System.out.println(myStudents);

        myStudents.remove("Marcel");

        System.out.println(myStudents);

//        returns true if the object is in the set
        System.out.println(myStudents.contains("Marcel"));

//        size(): returns the size of set

        System.out.println(myStudents.size());

        myStudents.clear();

        System.out.println(myStudents);



        System.out.println(myStudents);


        ArrayList<String> myStudentsAL = new ArrayList<>(Arrays.asList("Mihai","Paul","Mihai","Sumayya"));

        System.out.println(myStudentsAL);

        myStudentsAL.clear();

        HashSet<String> myUniqueStudents = new HashSet<>(myStudentsAL);

        System.out.println(myUniqueStudents);
        myStudentsAL.add("Paul");


        System.out.println(myUniqueStudents.isEmpty());

        myUniqueStudents.addAll(myStudentsAL);

        System.out.println(myUniqueStudents);


        HashSet<Integer> nums1 = new HashSet<>(Arrays.asList(1,2,100,3,4));
        HashSet<Integer> nums2 = new HashSet<>(Arrays.asList(4,5,6,7,100));


//        addAll(): adds all elements from nums2 into nums1
//        nums1.addAll(nums2);
//        System.out.println(nums1);

//        retainAll(): only retains the elements that are contained in BOTH arrays
//        nums1.retainAll(nums2);
//        System.out.println(nums1);

//        removeAll():
          nums1.removeAll(nums2);
        System.out.println(nums1);



    }


    public static void exercise(){
        HashSet<Integer> employeeIds = new HashSet<>();

        employeeIds.add(1);
        System.out.println(employeeIds.contains(1));
        employeeIds.remove(1);
        System.out.println(employeeIds);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,2,4,5,1,2,3,7,8,9));

        numbers = new ArrayList<>(new LinkedHashSet<>(numbers));

        System.out.println(numbers);
    }

    public static void linkedHashSets(){

        LinkedHashSet<String> myStudents = new LinkedHashSet<>(Arrays.asList("Sumayya","Martine","Maryam"));

        myStudents.add("Paul");
        myStudents.add("Aron");
        System.out.println(myStudents);
    }


    public static void treeSets(){

        TreeSet<Integer> myIntTree = new TreeSet<>(Collections.reverseOrder());

        myIntTree.add(1);
        myIntTree.add(200);
        myIntTree.add(300);
        myIntTree.add(4);
        myIntTree.add(2);

        System.out.println(myIntTree);

        TreeSet<Student> studentTree = new TreeSet<>();
//        TreeSet<Student> studentTree = new TreeSet<>(Comparator.comparing(Student::getName));


        Student student1 = new Student(1,"Mihai");
        Student student2 = new Student(2,"Kathrin");
        Student student3 = new Student(3,"Aron");
        Student student4 = new Student(4,"Maryam");


        studentTree.addAll(Arrays.asList(student1,student2,student3,student4));
        System.out.println(studentTree);


    }


    public static void linkedLists(){

        LinkedList<Integer> myInts = new LinkedList<>();

        myInts.add(10);
        myInts.add(11);
        myInts.add(12);

        System.out.println(myInts);

    }
}
