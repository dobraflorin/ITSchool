package ro.itschool.practice.session11.inheritanceencapsulation.inheritancepractice;

public class Dog extends Animal {

    String dogColour;

    void getDogWeight() {
    }

    void makeNoise() {
        super.makeNoise();
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.makeNoise();

//        Animal animal = new Animal();
//        animal.makeNoise();
    }
}