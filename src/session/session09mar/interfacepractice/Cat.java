package session.session09mar.interfacepractice;

public class Cat implements Animal, Food{
    @Override
    public void makeNoise() {
        System.out.println("Cat make noises.");
    }

    @Override
    public void eat() {
        System.out.println("Cat wants to eat.");
    }
}
