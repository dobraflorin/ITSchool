package ro.itschool.practice.session14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.someMethod();
    }

    public void someMethod() {
        boolean isConditionTrue = true;

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alin");
        map.put(2, "Florin");
        map.put(3, "Maria");

        List<String> list = new ArrayList<>();
        list.add("Alina");
        list.add("Ion");
        list.add("George");

        if (isConditionTrue) {
            for(String name : list){
                System.out.println(name);
            }
        }
    }
}
