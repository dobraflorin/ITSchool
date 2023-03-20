package session.session20mar;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add(1, "Maria");

        System.out.println(names.get(1));
    }
}
