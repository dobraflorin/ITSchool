package ro.itschool.practice.session12.interfacepractice;

public class Dog implements Animal, Food {

    public void makeNoise() {
        System.out.println("Dog make noises.");
    }
    public void eat() {
        System.out.println("Dog wants to eat.");
    }

    @Override
    public void getName() {

    }
}