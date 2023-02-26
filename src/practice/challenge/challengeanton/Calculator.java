package practice.challenge.challengeanton;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double number1 = 0;
        double number2 = 0;
        double result = 0;
        char operation;

        Scanner scanner = new Scanner(System.in); // creem obiect de tip scanner
        System.out.println(" Enter the first number: ");
        number1 = scanner.nextDouble();

        System.out.println(" Enter the second number: ");
        number2 = scanner.nextDouble();

        System.out.println(" Enter the operation: ");
        operation = scanner.next().charAt(0);

        switch (operation) {

            case '+':
                result = number1 + number2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Result = " + result);
                break;

            case '/':
                while (number2 == 0) {
                    System.out.println("Number 2 shouldn't be 0");
                    break;
                }
                System.out.println("Enter number 2 again");
                number2 = scanner.nextDouble();
                System.out.println("Result : " + divide(number1, number2));
                break;

            default:
                System.out.println("Go again to school :D");
        }
        scanner.close();
        {
        }
    }

    public static double divide(double number1, double number2) {
        double result = number1 / number2;
        return result;

    }
}
