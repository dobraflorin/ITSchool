package session.session20feb;

public class NestedLoops {
    public static void main(String[] args) {
        //                      simpleArray
        int[][] complexArray = {{3, 2, 1}, {3, 4, 6}, {8, 5, 2}};
        //                      0           1           2

        for(int[] simpleArray : complexArray) {
            for(int index = 0; index < simpleArray.length; index++) {
                System.out.println(simpleArray[index]);
            }

        }
    }

}
