package ro.itschool.practice.session9.kata;

public class Solution {

    public static void main(String[] args) {
        int[] array = {3, 17, 17, 17, 17, 17, 17};
        System.out.println(Solution.stray(array));
    }

    static int stray(int[] numbers) {
        int numberToReturn = 0;
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) {
                numberToReturn = numbers[index - 1];
                break;
            }
            if (numbers[index - 1] != numbers[index]) {
                numberToReturn = numbers[index];
                break;
            }
        }
        return numberToReturn;
    }
}
//https://www.codewars.com/kata/57f609022f4d534f05000024/java