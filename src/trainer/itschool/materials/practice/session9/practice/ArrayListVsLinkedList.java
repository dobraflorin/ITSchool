package ro.itschool.practice.session9.practice;

import java.util.*;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for(int index = 0; index < 10000000; index++){
            arrayList.add("a");
            linkedList.add("a");
        }

        long startTime = System.currentTimeMillis();
        String getArrayValue = arrayList.get(1000000);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList: " + (endTime - startTime));

        long startTime2 = System.currentTimeMillis();
        String getLinkedValue = linkedList.get(1000000);
        long endTime2 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (endTime2 - startTime2));
    }
}