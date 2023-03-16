package session.session09mar.parkingapp;

import java.time.LocalDateTime;

public class LargeCar implements Fee {
    public void basePayment(){
        System.out.println("Large car pay maximum fee.");
    }

    @Override
    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut) {

    }

    @Override
    public boolean hasSubscription() {
        return false;
    }
}
