package CafeApplication.presenters;

import java.util.Date;

public interface ViewObserver {
    
    void onReservationTable(Date orderDate, int tableNo, String name);
    void onChangeReservationTable(int idReservation, int tableNoOld, Date reservationDate, int tableNo, String name);
}
