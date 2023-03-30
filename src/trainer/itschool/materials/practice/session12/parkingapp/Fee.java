package ro.itschool.practice.session12.parkingapp;

import java.time.LocalDateTime;

interface Fee {
    void basePayment(LocalDateTime timeIn, LocalDateTime timeOut);
    boolean hasSubscription();
}