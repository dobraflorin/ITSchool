package practice.challenge.challengeadrian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameLauncher {

    public static final String QUESTION_1 = "which is the capital of England?";
    public static final String QUESTION_2 = "when was the last bigger earthquake in Romania?";
    public static final String QUESTION_3 = "who is the president of France?";
    public static final String QUESTION_1_ANSWEARS = "a.Paris" + "\n" + "b.London" + "\n" + "c.Helsinki";

    public static void main(String[] args) {
        int score = 0;

        List<String> questions = new ArrayList<>();
        questions.add(QUESTION_1);
        questions.add(QUESTION_2);
        questions.add(QUESTION_3);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        System.out.println(QUESTION_1);
        System.out.println(QUESTION_1_ANSWEARS);

        String userAnswer = scan.nextLine();

        if (userAnswer.equalsIgnoreCase("b")) {
            System.out.println("Good job");
        } else {
            System.out.println("You fail");
        }
        System.out.println(name + "your score is: " + score);
    }
}
