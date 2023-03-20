package codewars;

public class DoubleChar {
    public static void main(String[] args) {

        String book = "abecedar";
        char[] array = book.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char letter : array){
            stringBuilder.append(letter);
            stringBuilder.append(letter);
            stringBuilder.append(letter);
            stringBuilder.append(letter);
        }
        System.out.println(stringBuilder);
    }
}
