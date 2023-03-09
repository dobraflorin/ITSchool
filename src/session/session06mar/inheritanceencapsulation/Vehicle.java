package session.session06mar.inheritanceencapsulation;

public class Vehicle {
    String colour = "red";

    {
        System.out.println("block of code");
    }

    public Vehicle() {
        colour = "green";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.colour);
    }
}
