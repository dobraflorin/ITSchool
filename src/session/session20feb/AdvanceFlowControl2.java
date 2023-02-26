package session.session20feb;

public class AdvanceFlowControl2 {

    public static void main(String[] args) {
        String [] cars = {"Logan", "Bmw", "Mercedes"};
        //                  0         1         2
        for(int index = 0; index < cars.length; index++) {
            System.out.println(cars[index]);
        }
        //no index
        for(String car : cars){
            System.out.println(car);
        }
    }

}
