package ro.itschool.practice.session15;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

    public static void main(String[] args) {
        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(675465, "Iasi");
        mapValues.put(435465, "Cluj");

        int[] zipcodes = {675465, 435465};
        String[] cities = {"Iasi", "Cluj"};
        Map<Integer, String> zipcodeCityMap = new HashMap<>();
        for (int i = 0; i < zipcodes.length; i++) {
            if(i <= cities.length){
                zipcodeCityMap.put(zipcodes[i], cities[i]);
            }
        }
        System.out.println("Merged arrays: " + zipcodeCityMap);

        System.out.println(mapValues);
        for (Map.Entry<Integer, String> entry : mapValues.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (value.equalsIgnoreCase("iasi")) {
                System.out.println("Iasi city was found.");
            }
        }
    }
}