package session.session20feb;

public class BreakStatementExample {
    // find indexes for searchValue on complexArray
    public static void main(String[] args) {
        int[][] complexArray = {{3, 2, 1}, {3, 4, 6}, {8, 5, 2,}};
        //                       0  1  2    0  1  2    0  1  2
        //                          0           1          2
        //
        int searchValue = 4;

        int positionX = 0;
        int positionY = 0;
        for (int i = 0; i < complexArray.length; i++) {
            for (int j = 0; j < complexArray[i].length; j++) {
                if (complexArray[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    System.out.println(positionX + " " + positionY);
                   // break OUTER_LOOP;
                }
            }
        }
        if(positionX == 0 || positionY == 0) {
            System.out.println("Value" + searchValue + "was not found");
        }
    }
}
