package session.session30mar;

import java.util.Optional;
import java.util.Random;

public class OptionalPractice {
    public static void main(String[] args) {
//        String name = getName();
//
//        System.out.println(name.equals("Other Value"));

        Optional<String> optionalName = Optional.ofNullable(getName());
        if(optionalName.isPresent()){
            System.out.println("we have a name");
        } else {
            System.out.println("value is null");
        }
    }

    static String getName() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber == 0){
        return "Some value";
    } else {
        return null;
        }
    }
}