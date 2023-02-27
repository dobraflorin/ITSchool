package session.session27feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
//        List<String> arraylist = ArrayList<>();
//        List<String> linkedlist = LinkedList<>();
//
//        for (int index = 0; index < 1000000; index++){
//            arraylist.add("a");
//            linkedlist.add("a");
//        }
//        long timeNow = System.currentTimeMillis();
//        String getArrayValue = arraylist.get
    }

    private static void practiceWithArrayListOperation() {
        List<String> names = new ArrayList<>();
        names.add("Ioana");
        names.add("Maria");
//        System.out.println(names);

        String[] dogs = {"Fluffy", "Rex", "Azorel", "Snow"};
        for (String dog : dogs) {
            System.out.println(dog);
        }
        System.out.println(Arrays.binarySearch(dogs, "Rex"));
        System.out.println(Arrays.binarySearch(dogs, "Fluffy"));

    }

    private static void practiceWithAutoboxingAndUndboxing(){
        int age = 25;
        Integer integer = age;
        Integer integer1 = Integer.valueOf(age);

        int unboxedAge = integer.intValue();
    }
}