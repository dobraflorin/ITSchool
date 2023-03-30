package ro.itschool.practice.session13;

public class PracticeWithOverloading {
    public static void main(String[] args) {
        int age;
        age = 10;
        age = 14;

        System.out.println("First sum: " + sum(2, 10));
        System.out.println("Second sum: " + sum(2, 10, 54));

        char someChar = 'a';
        long someLong = 34234;
        System.out.println(String.valueOf(someChar));
        System.out.println(String.valueOf(someLong));

        PracticePolymorphism practiceObj = new PracticePolymorphism();
        System.out.println(practiceObj);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}