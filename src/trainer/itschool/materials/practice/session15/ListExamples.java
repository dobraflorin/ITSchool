package ro.itschool.practice.session15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExamples {

    public static void main(String[] args) {
        User userIon = new User();
        userIon.setFirstName("Ion");
        userIon.setLastName("Popescu");
        userIon.setAge(25);

        User userMaria = new User();
        userMaria.setFirstName("Maria");
        userMaria.setLastName("Diaconescu");
        userMaria.setAge(23);

        List<User> userList = new ArrayList<>();
//        userList.add(userIon);
//        userList.add(userMaria);

        Map<Integer, List<User>> usersMap = new HashMap<>();
        usersMap.put(1, userList);

        Map<Integer, User> usersMap2 = new HashMap<>();
        usersMap2.put(1, userIon);

//        System.out.println("First user of the list is: " + userList.get(0).getFirstName());

        if(!userList.isEmpty()) {
            for (User user : userList) {
                if (user.getFirstName().equals("Ion")) {
                    System.out.println("User Ion was found.");
                }
            }
        } else {
            System.out.println("User list is empty.");
        }
    }
}