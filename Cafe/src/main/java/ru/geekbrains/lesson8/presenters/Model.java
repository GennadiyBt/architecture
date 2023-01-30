package ru.geekbrains.lesson8.presenters;

import ru.geekbrains.lesson8.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int idReservation, int tableNoOld, Date reservationDate, int tableNo, String name);
    void deleteReservation(int idReservation, int tableNo);

}
