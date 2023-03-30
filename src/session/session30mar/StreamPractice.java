package session.session30mar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
//       filter();
//         map();
//        flatmap();
//        distinct();
//        sort();
//        forEach();
//        reduce();
//        count();
//        anyMatch();
        collect();


    }
    static void collect(){
        List<Integer> numbers = Arrays.asList(1,2,3,3,4,5,6,7);
        List<Integer> squareNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList()); //terminal operation
        System.out.println(squareNumbers);
    }

    static void anyMatch(){
        List<Integer> numbers = Arrays.asList(1,2,3,3,4,5,6,7);
        boolean hasEvenNumbers = numbers.stream()
                .anyMatch(number -> number % 2 == 0); // terminal operation
        System.out.println(hasEvenNumbers);
    }

    static void count(){
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        long count = numbers.stream().count(); // terminal operation
        System.out.println(count);
    }


    static void reduce(){
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int sum = numbers.stream()
                .reduce(0,(a, b) ->a + b); //terminal operation
        int multiply = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(sum + "" + multiply);
    }

    static void forEach(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 2, 5, 6, 7, 5);
        numbers.stream()
                .forEach(System.out::println);

    }

    //sort a stream based on a comparator
    static void sort(){
        List<String> words = Arrays.asList("hello", "world", "are", "you", "Alexandra");
        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(sortedWords);
    }


    // remove duplicates
    static void distinct(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 2, 5, 6, 7, 5);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }
    static void flatmap(){
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4), Arrays.asList(5,6));
        List<Integer> flattenedNumbers = numbers.stream()
                .flatMap(list -> list.stream())
                        .collect(Collectors.toList());
        System.out.println(flattenedNumbers);

        List<Integer> extractedNumbers = new ArrayList<>();
        for(List<Integer> numberList : numbers){
            for(Integer number: numberList){
                extractedNumbers.add(number);
            }
        }
//        numbers.forEach(numberList -> {numberList.forEach(number -> extractedNumbers.add(number)));
        System.out.println("Extracted numbers:" + extractedNumbers);
    }

    static void map(){
        List<String> words = Arrays.asList("hello", "world", "are", "you");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
//                .map(number -> number.length())
                .collect(Collectors.toList());
        System.out.println(wordLengths);
    }

    static void filter(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 ==0) // intermediate operation
                .collect(Collectors.toList()); //terminal operation
        System.out.println(evenNumbers);
    }
}
