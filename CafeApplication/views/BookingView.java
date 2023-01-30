package CafeApplication.views;

import java.util.Date;
import java.util.Collection;

import CafeApplication.models.Table;
import CafeApplication.presenters.View;
import CafeApplication.presenters.ViewObserver;

public class BookingView implements View{

    private ViewObserver observer;

    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void reservationTable(Date date, int tableNo, String name){
        observer.onReservationTable(date, tableNo, name);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param reservationNo
     */
    public void printReservationTableResult(int reservationNo){
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку изменения бронирования),
     * старую бронь отменить
     * новую бронь добавить
     *
     * @param oldReservation
     * @param orderDate
     * @param tableNo
     * @param name
     */
    public void changeReservationTable(int idReservation, int tableNoOld, Date date, int tableNo, String name){
        observer.onChangeReservationTable(idReservation, tableNoOld, date, tableNo, name);
    }

    
}
