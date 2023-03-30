package ro.itschool.practice.session11.inheritanceencapsulation.inheritancepractice;

public class Test extends Dog {

    void makeNoise() {
        super.makeNoise();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.makeNoise();
    }
}
