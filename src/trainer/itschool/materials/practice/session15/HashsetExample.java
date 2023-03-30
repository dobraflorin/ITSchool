package ro.itschool.practice.session15;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("red");
        set.add("blue");
        set.add("orange");
        set.add("red");

        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}