package ro.itschool.practice.session10;

import java.util.List;

public class Utils {

    public static int sumOfNumbers(int a, int b) {
        return a + b;
    }

    public static void printElementsFromList(List<String> stringElements) {
        for (String element : stringElements) {
            System.out.println(element);
        }
    }
}