package ro.itschool.practice.session13;

import jdk.jshell.execution.Util;

public class PracticePolymorphism {

    public static void main(String[] args) {
        String name = "Alex";
        PracticePolymorphism practiceObj = new PracticePolymorphism();
        String countryNameFromMethod = Utils.getCountryName();
        String countryNameFromProperty = Utils.RO_COUNTRY;
    }
}

abstract class Animal {
    abstract void eat();

    void colour() {
        System.out.println("color of the animal");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog eat");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("cat eat");
    }
}

interface Human {
    default void someMethod() {
        System.out.println("this is a default method");
    }
}