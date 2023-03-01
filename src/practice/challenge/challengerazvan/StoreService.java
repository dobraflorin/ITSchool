package practice.challenge.challengerazvan;

public class StoreService {

    Fruits fruits = new Fruits();
    Client client = new Client();

    public void setStock() {
        fruits.setApples(2000);
        fruits.setBananas(1000);
    }

    public void setPrice() {

        fruits.setPriceApple(4);
        fruits.setPriceBananas(10);
    }

    private boolean hasEnoughMoney(double purchasePrice, double clientBudget) {
        if (purchasePrice <= clientBudget) {
            return true;
        }
        System.out.println("You don't have enough money");
        return false;
    }

    public double getApplePurchasePrice(int appleQuantity) {
        if (fruits.getApples() >= appleQuantity) {
            fruits.setApples(fruits.getApples() - appleQuantity);
            System.out.println("you bought " + appleQuantity + " apples");
            return appleQuantity * fruits.getPriceApple();
        }
        return 0;
    }

    public int getAppleInitialStock() {
        return fruits.getApples();
    }
}