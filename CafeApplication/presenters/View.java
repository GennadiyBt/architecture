package CafeApplication.presenters;

import java.util.Collection;

import CafeApplication.models.Table;

public interface View {
    
    void showTables(Collection<Table> tables);
    void setObserver(ViewObserver observer);

    void printReservationTableResult(int reservationNo);
}
