package CafeApplication.presenters;

import java.util.Date;
import java.util.Collection;

import CafeApplication.models.Table;

public interface Model {
    
    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int idReservation, int tableNoOld, Date reservationDate, int tableNo, String name);
    void deleteReservation(int idReservation, int tableNo);
}
