package ro.itschool.practice.codewars;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        String firstName = names[0].substring(0, 1).toUpperCase();
        String lastName = names[1].substring(0, 1).toUpperCase();
        return firstName + "." + lastName;
    }
}
//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java