package ro.itschool.practice.session10;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private static String brand;
    public String colour;

    public static void main(String[] args) {
        List<String> brandList = new ArrayList<>();
        brandList.add("Ferrari");
        brandList.add("Mercedes");

        PracticeWithVariables practice = new PracticeWithVariables();
        practice.genericMethod();

        PracticeWithVariables.printElementsFromList(brandList);
        String convertedInt = String.valueOf(234);

        getBrand();

        int sum = Utils.sumOfNumbers(2, 4);
    }

    private static String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}