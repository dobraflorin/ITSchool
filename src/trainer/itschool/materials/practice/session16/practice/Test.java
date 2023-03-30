package ro.itschool.practice.session16.practice;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        User user1 = new User("Ion", 23);
        User user2 = new User("Ion", 25);

        System.out.println(user1.equals(user2));

        Set<User> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        System.out.println(set.size());

        System.out.println(user1);
    }
}