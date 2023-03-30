package ro.itschool.practice.session16.problem;

import java.util.List;


public class BuyService {

    public void buy(List<Product> productList, int quantity, String productName, User user) {
        int availableItems = checkAvailabilityAndTransport(productList, productName);
        if (availableItems < quantity) {
            System.out.println("Not enough stock.");
        } else {
            removeBoughItem(productList, productName, quantity);
        }
        System.out.println(user.getUsername() + " thank you for your purchase!");
    }

    private void removeBoughItem(List<Product> productList, String productName, int quantity) {
        int counter = quantity;
        for (int index = 0; index < productList.size(); index++) {
            if (productList.get(index).getName().equalsIgnoreCase(productName)
                    && counter > 0) {
                System.out.println("Product " + productList.get(index).getName() + " was removed from the stock.");
                productList.remove(index);
                counter--;
            }
        }
    }

    private int checkAvailabilityAndTransport(List<Product> productList, String productName) {
        int availableItem = 0;
        double priceAmount = 0;
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(productName)) {
                availableItem++;
                priceAmount += product.getPrice();
            }
        }
        if (priceAmount >= 2000) {
            System.out.println("You get free transport.");
        } else {
            System.out.println("Transport free will bee 325.34 euro.");
        }
        System.out.println("Products available in stock: " + availableItem);
        return availableItem;
    }
}