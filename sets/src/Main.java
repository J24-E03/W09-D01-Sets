import java.util.*;

public class Main {
    public static void main(String[] args) {



    }

    public static void review(){
        int[] myArray = {1,2,3,4,5};

        ArrayList<Integer> myArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        HashMap<Integer,String> myHashmap = new HashMap<>();

        myHashmap.put(1,"Kathrin");
        myHashmap.put(30,"Mihai");
        myHashmap.put(2,"Paul");


        System.out.println(myHashmap);

        LinkedHashMap<Integer,String> myLinkedHashMap = new LinkedHashMap<>();


        myLinkedHashMap.put(1,"Kathrin");
        myLinkedHashMap.put(30,"Mihai");
        myLinkedHashMap.put(2,"Paul");

        System.out.println(myLinkedHashMap);

        TreeMap<Integer,String> myTreeMap = new TreeMap<>();


    }
}