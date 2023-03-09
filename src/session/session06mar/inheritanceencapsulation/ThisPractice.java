package session.session06mar.inheritanceencapsulation;

public class ThisPractice {

    int age;
    int height;

    public ThisPractice(int age) {
        this.age = age;
    }

    public ThisPractice(int age, int height) {
        this(age);
        this.age = age;
        this.height = height;
    }

    void getName() {
    }

    void getAge() {
        this.getName();
    }
}
