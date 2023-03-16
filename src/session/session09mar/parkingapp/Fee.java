package session.session09mar.parkingapp;

import java.time.LocalDateTime;

interface Fee {
    void basePayment(LocalDateTime timeIn, LocalDateTime timeOut);
    boolean hasSubscription();
}
