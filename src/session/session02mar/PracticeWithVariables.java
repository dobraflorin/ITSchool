package session.session02mar;

import java.util.List;

import java.util.List;

public class PracticeWithVariables {

    public static String colour = "red"; //static variable
    String name = "Marius"; //instance variable

    public void genericMethod() {
        int age = 10; //local variable
    }

    public static void printElementsFromList(List<String> stringElements) {
        for (String element : stringElements) {
            System.out.println(element);
        }
    }
}