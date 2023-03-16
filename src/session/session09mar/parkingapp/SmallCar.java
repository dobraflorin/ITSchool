package session.session09mar.parkingapp;

import java.time.LocalDateTime;

public class SmallCar implements Fee {
    public void basePayment(){
        System.out.println("SmallCar car pay maximum fee.");
    }

    @Override
    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut) {

    }

    @Override
    public boolean hasSubscription() {
        return false;
    }
}