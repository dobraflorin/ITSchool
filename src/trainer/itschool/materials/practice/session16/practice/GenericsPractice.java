package ro.itschool.practice.session16.practice;

import java.util.ArrayList;
import java.util.List;

public class GenericsPractice {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        String[] stringArray = {"Maria", "Ion"};
        Integer[] intArray = {1, 2};
        someMethod(stringArray);
        someMethod(intArray);
    }

    public static <T> void someMethod(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}