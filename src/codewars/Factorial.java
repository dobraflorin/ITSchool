package codewars;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(writeFactorial(20));
    }
    private static long writeFactorial(int i){
        long factorial = 1;
        while (i > 0){
            factorial = factorial*i;
            i--;
        }
        return factorial;
    }
}
