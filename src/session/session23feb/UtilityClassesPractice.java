package session.session23feb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class UtilityClassesPractice {
    public static void main(String[] args) {
        Object object = new Object();

        LocalDate localDatenow = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2023, 02, 20);

//        System.out.println(localDatenow.isAfter(yesterday));
//        System.out.println(localDatenow.isBefore(yesterday));

//        System.out.println(localDatenow.plusYears(20));
//        System.out.println(localDatenow.minusYears(10));

        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDatenow);


        Date utilDate = new Date();
//        System.out.println("Util Date: " + utilDate);

        long timestampNow = 1677177435;
//        Date sqlDate = new java.sql.Date(timestamp);
//        System.out.println("SQL Date: " + sqlDate);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number.");
        int userInput = scanner.nextInt();
        System.out.println("User input: " + userInput);

        Random random = new Random();
        int randomNumber = random.nextInt(userInput);
        System.out.println("Random number is: " + randomNumber);
        random.nextInt(0, 10);
    }
}
