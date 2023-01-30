package ru.geekbrains.lesson8.models;

import ru.geekbrains.lesson8.presenters.Model;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class TableModel implements Model {

    private Collection<Table> tables;

    public Collection<Table> loadTables(){

        if (tables == null)
            tables = new ArrayList<>();

        Table t = new Table();
        tables.add(t);
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());
        tables.add(new Table());

        return tables;

    }

    public TableModel(){
        this.tables = loadTables();
    }

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        Optional<Table> table = tables.stream().filter(t -> t.getNo() == tableNo).findFirst();
        if (table.isPresent()){
            //TODO: Проверка резерва
            Reservation reservation = new Reservation(reservationDate, name);
            table.get().getReservations().add(reservation);
            return reservation.getId();
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    public void deleteReservation(int idReservation, int tableNo) {
        Optional<Table> table = tables.stream().filter(t -> t.getNo() == tableNo).findFirst();
        if (table.isPresent()){
            table.get().getReservations().removeIf(r -> r.getId() == idReservation);
        }
        System.out.println("Старый заказ № " + idReservation + " удален");
        
    }


    //TODO: changeReservationTable
    public int changeReservationTable(int idReservation, int tableNoOld, Date reservationDate, int tableNo, String name) {
        deleteReservation(idReservation, tableNoOld);
        return reservationTable(reservationDate, tableNo, name);
    }

}
