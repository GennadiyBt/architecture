package CafeApplication;

import java.util.Date;

import CafeApplication.models.TableModel;
import CafeApplication.presenters.BookingPresenter;
import CafeApplication.views.BookingView;

public class ClientMove {
    
    /**
     * ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        view.reservationTable(new Date(), 3, "Станислав");
        view.changeReservationTable(1, 3, new Date(), 3, "Станислав");

    }
}
