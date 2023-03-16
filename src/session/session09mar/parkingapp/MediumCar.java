package session.session09mar.parkingapp;

import java.time.LocalDateTime;

public class MediumCar implements Fee {
    public void basePayment(){
        System.out.println("MediumCar car pay maximum fee.");
    }

    @Override
    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut) {

    }

    @Override
    public boolean hasSubscription() {
        return false;
    }
}
