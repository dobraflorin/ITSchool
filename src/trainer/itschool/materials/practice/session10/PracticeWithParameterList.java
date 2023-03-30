package ro.itschool.practice.session10;

import java.util.ArrayList;
import java.util.List;

public class PracticeWithParameterList {

    public static void main(String[] args) {
        List<String> humanNameList = new ArrayList<>();
        humanNameList.add("Maria");
        humanNameList.add("Razvan");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(23);
        integerList.add(20);

        printListOfString(humanNameList);
        genericMethod1(10, 23, 54);
    }

    public static void genericMethod1(int a, int b, int c) {
        System.out.println(a + b);
    }

    public void genericMethod2(String name1, String name2) {
    }

    public static void printListOfString(List<String> nameValue) {
        for (String name : nameValue) {
            System.out.println(name);
        }
    }
}