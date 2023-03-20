package codewars;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {

        int[] myInArray = {-14, 2, 3, 4, 50, 6 ,9, -5, -34};
        min(myInArray);
        max(myInArray);
        System.out.println(min(myInArray));
        System.out.println(max(myInArray));
    }
    public static int max(int[] list) {
        int maxValue = 0;

        for (int index = 0; index < list.length; index++){
            if (list[index]>maxValue){
                maxValue = list[index];
            }
        }
        return maxValue;
    }

    public static int min(int[] list) {
        int minValue = 0;

        for (int index = 0; index < list.length; index++){
            if (list[index]<minValue){
                minValue = list[index];

            }
        }
        return minValue;
    }

}


