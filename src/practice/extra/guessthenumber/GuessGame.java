package practice.extra.guessthenumber;

import java.util.Random;

public class GuessGame {
    public void startGame() {

        Random rand = new Random();
        int computerGeneratedNumber = rand.nextInt(1, 3);
        System.out.println("ComputerGeneratedNumber: " + computerGeneratedNumber);

        public void startGame() {
            Random rand = new Random();
            int computerGeneratedNumber = rand.nextInt(1, 3);
            System.out.println("Computer generated number: " + computerGeneratedNumber);

            Player player1 = new Player();
            Player player2 = new Player();
            Player player3 = new Player();

            player1.setName("Tilica");
            player2.setName("Bambilica");
            player3.setName("Marcela");

            int player1Guess = player1.getPlayerGuessNumber();
            int player2Guess = player2.getPlayerGuessNumber();
            int player3Guess = player3.getPlayerGuessNumber();

            boolean isGameOn = true;

            while (isGameOn) {
                if (player1Guess == computerGeneratedNumber) {
                    isGameOn = false;
                    System.out.println(player1.getName() + " is the winner");
                } else if (player2Guess == computerGeneratedNumber) {
                    isGameOn = false;
                    System.out.println(player2.getName() + " is the winner");
                } else if (player3Guess == computerGeneratedNumber) {
                    isGameOn = false;
                    System.out.println(player3.getName() + " is a winner");
                }
            }
        }
    }