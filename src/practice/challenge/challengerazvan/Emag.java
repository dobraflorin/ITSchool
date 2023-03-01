package practice.challenge.challengerazvan;

public class Emag {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        storeService.setStock();
        storeService.setPrice();
        int appleStock = storeService.getAppleInitialStock();

        System.out.println(appleStock);

        Client client = new Client();
        client.setBudgetClient(350);

        storeService.getApplePurchasePrice(15);
    }
}