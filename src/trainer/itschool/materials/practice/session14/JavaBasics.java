package ro.itschool.practice.session14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ro.itschool.practice.session14.UtilClass.getName;

public class JavaBasics {

    static int age;
    static double amount;
    static char someCharacter;
    static boolean isAvailable;

    //default constructor - implicit constructor
    //no args constructor - without arguments
    //param constructor
    public JavaBasics() {
        System.out.println("this is from the constructor");
    }

    public static void main(String[] args) {
        createObject();
        createList();
//        System.out.println(amount);
//        System.out.println(isAvailable);

        String name = getName("Florin");
//        System.out.println(name);
//        System.out.println(COUNTRY_NAME);
    }

    public static void createObject() {
        JavaBasics javaBasicsObj = null;
        int anotherValue = 0; //please pay attention to the variable scope
        boolean isComparisonTrue = 5 < 3;
        if (isComparisonTrue || 2 < 3) {
            anotherValue = 10;
            javaBasicsObj = new JavaBasics();
            javaBasicsObj.setAge(35);
            //some more logic
        }
        System.out.println(anotherValue);
        System.out.println(javaBasicsObj.getAge());
    }

    public static void createList() {
        for (int index = -1; index <= 1; index++) {
            System.out.println(index);
        }

        List<String> myStringList = new ArrayList<>();
        for (int index = -56; index < 10; index++) {
            Random random = new Random();
            String value = myStringList.get(5);
            myStringList.add(String.valueOf(random.nextInt()));
        }

        String[] array = {"some", "value", "here"};
        int[] intArray = {1, 2, 3};
        for (int listValue : intArray) {
            System.out.println(listValue);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        JavaBasics.age = age;
    }
}