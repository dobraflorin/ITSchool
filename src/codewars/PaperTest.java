package codewars;

public class PaperTest {
    public static void main(String[] args) {
        System.out.println(paperWork(5, 5));
    }

    public static int paperWork(int n, int m) {
        if (n < 0 || m < 0) {
            return 0;
        } else
            return n * m;
    }
}
