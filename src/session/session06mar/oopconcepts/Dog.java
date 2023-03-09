package session.session06mar.oopconcepts;

public class Dog extends Animal {

    void makeNoise() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();

      Animal animal = new Animal();
      animal.makeNoise();
    }
}
