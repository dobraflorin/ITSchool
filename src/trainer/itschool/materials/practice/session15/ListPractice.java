package ro.itschool.practice.session15;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        String[] city = {"Iasi", "Bucuresti", "Timisoara"};
        // index values    0         1             2
        System.out.println("This is " + city[2] + ".");
        for (int index = 0; index < city.length; index++) {
            if (city[index].equalsIgnoreCase("bucuresti")) {
                System.out.println("Bucuresti is on index: " + index);
                break;
            }
        }
        //{... ... ... ... Maria ... ... ...}
        List<String> names = new ArrayList<>();
        names.add("Ma ria   ");
        names.add(1, "Andrei");
        names.add(2, "Mircea");
        System.out.println(names);

//        names.remove(0);
//        System.out.println(names);

        validateNamesList(names, "maria");
        //"[Maria, Andrei, Mircea]"
        validateNamesList(names);
    }

    private static void validateNamesList(List<String> names, String nameInput) {
        for (String name : names) {
            if (name.replaceAll(" ","").equalsIgnoreCase(nameInput)) {
                System.out.println("Maria is already in the list.");
            }
        }
    }
    private static void validateNamesList(List<String> names) {
        if (names.contains("Maria")) {
            System.out.println("Maria value founded with contains.");
        }
    }
}