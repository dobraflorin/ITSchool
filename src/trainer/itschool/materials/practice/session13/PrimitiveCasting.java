package ro.itschool.practice.session13;

public class PrimitiveCasting {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = (int) doubleValue;
        System.out.println(intValue);

        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Max double value: " + maxDoubleValue);
        int maxDoubleConverted = (int) maxDoubleValue;
        System.out.println(maxDoubleConverted);
    }
}