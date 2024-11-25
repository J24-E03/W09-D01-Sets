package labs;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise1 {

    public static void main extends Student(String[] args) {

        exercise1();
        exercise2();
        exercise3();
        exercise4();


    }

    public static void exercise1(){

        HashSet<Integer> myEmployee = new HashSet<>();

        myEmployee.add(11);
        myEmployee.add(22);
        myEmployee.add(33);
        myEmployee.add(44);
        myEmployee.add(55);

        System.out.println(myEmployee);

        System.out.println(myEmployee.contains(33));

        myEmployee.remove(22);

        System.out.println(myEmployee);
    }

    private static void exercise2(){

        HashSet<Integer> myIntegerList = new HashSet<>(Arrays.asList(123, 345, 567, 789, 345, 122, 123));

        System.out.println(myIntegerList);

        myIntegerList.clear();

        HashSet<Integer> myUniqueIntegerList = new HashSet<>(myIntegerList);

        System.out.println(myUniqueIntegerList);
    }

    private static void exercise3(){

        HashSet<String> Developer_A = new HashSet<>(Arrays.asList("Java","Python","C++","Swift"));
        HashSet<String> Developer_B = new HashSet<>(Arrays.asList("SQL","CSS","HTML","Java"));

        System.out.println(Developer_A);
        System.out.println(Developer_B);

        HashSet<String> Union = new HashSet<>(Developer_A);
        Union.addAll(Developer_B);
        System.out.println("Union: " + Union);

        HashSet<String> Intersection = new HashSet<>(Developer_A);
        Intersection.retainAll(Developer_B);
        System.out.println("Intersection: " + Intersection);

        HashSet<String> Difference = new HashSet<>(Developer_A);
        Difference.removeAll(Developer_B);
        System.out.println("Difference: " + Difference);

        System.out.println(" ");
    }

    private static void exercise4(){

        HashSet<String> registration = new HashSet<>();

        registration.registerStudent(new Student(1));






    }















    }


