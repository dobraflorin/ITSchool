package ro.itschool.practice.session12.parkingapp;

import java.time.LocalDateTime;

public class MediumCar extends CarUtils implements Fee {

    @Override
    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut) {
        System.out.println("Medium car pay medium fee.");
    }

    @Override
    public boolean hasSubscription() {
        return false;
    }
}