package com.micahstrube.bnb.model;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Reservation {
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate bookedDate;
    private LocalDate balanceDueDate;
    private BigDecimal balance;
    private boolean canceled;

    Reservation() {
        canceled = false;
    }

    List<BigDecimal> calculateCharges() {
        List<BigDecimal> charges = new ArrayList<>();

        startDate.datesUntil(endDate).forEach((LocalDate d) -> {
            if (d.getDayOfWeek() == DayOfWeek.FRIDAY || d.getDayOfWeek() == DayOfWeek.SATURDAY) {
                charges.add(room.getWeekendRate());
            } else {
                charges.add(room.getWeekdayRate());
            }
        });

        return charges;
    }

    Room getRoom() {
        return room;
    }

    void setRoom(Room room) {
        this.room = room;
    }

    LocalDate getStartDate() {
        return startDate;
    }

    void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    LocalDate getEndDate() {
        return endDate;
    }

    void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    LocalDate getBookedDate() {
        return bookedDate;
    }

    void setBookedDate(LocalDate bookedDate) {
        this.bookedDate = bookedDate;
    }

    LocalDate getBalanceDueDate() {
        return balanceDueDate;
    }

    void setBalanceDueDate(LocalDate balanceDueDate) {
        this.balanceDueDate = balanceDueDate;
    }

    BigDecimal getBalance() {
        return balance;
    }

    void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    boolean isCanceled() {
        return canceled;
    }

    void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
