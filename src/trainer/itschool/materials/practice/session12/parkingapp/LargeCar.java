package ro.itschool.practice.session12.parkingapp;

import java.time.LocalDateTime;

public class LargeCar extends CarUtils implements Fee {

    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut) {
        System.out.println("Large car pay maximum fee.");
    }

    public boolean hasSubscription() {
        return false;
    }
}