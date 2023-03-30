package session.session30mar;

import java.util.HashSet;

public class StreamsPractice {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Alina");
        myHashSet.add("Maria");
        myHashSet.add("Irina");
        String[] stringArray = myHashSet.toArray(new String[myHashSet.size()]);
        for (String value : stringArray);
//        System.out.println(value);

    }
}
