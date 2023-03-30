package ro.itschool.practice.session16.problem;

import java.util.ArrayList;
import java.util.List;

public class IkeaApplication {

    public static void main(String[] args) {
        Closet closet1 = new Closet();
        closet1.setName("Zeus");
        closet1.setColour("red");
        closet1.setPrice(344.54);
        closet1.setRawMaterial("pal");

        Closet closet2 = new Closet();
        closet2.setName("Athena");
        closet2.setColour("red");
        closet2.setPrice(543.54);
        closet2.setRawMaterial("mdf");

        Closet closet3 = new Closet();
        closet3.setName("Artemis");
        closet3.setColour("blue");
        closet3.setPrice(4553.54);
        closet3.setRawMaterial("wood");

        Table table1 = new Table();
        table1.setName("Genesis");
        table1.setColour("green");
        table1.setPrice(342.56);
        table1.setRawMaterial("wood");

        Table table2 = new Table();
        table2.setName("Margo");
        table2.setColour("blue");
        table2.setPrice(543.56);
        table2.setRawMaterial("pal");

        Table table3 = new Table();
        table3.setName("Asus");
        table3.setColour("red");
        table3.setPrice(87.56);
        table3.setRawMaterial("mdf");

        List<Product> closetList = new ArrayList<>();
        closetList.add(closet1);
        closetList.add(closet2);
        closetList.add(closet3);

        List<Product> tableList = new ArrayList<>();
        tableList.add(table1);
        tableList.add(table2);
        tableList.add(table3);

        User user = new User();
        user.setUsername("AdrianMarinescu");

        BuyService buyService = new BuyService();
        buyService.buy(closetList, 3, "Artemis", user);
    }
}