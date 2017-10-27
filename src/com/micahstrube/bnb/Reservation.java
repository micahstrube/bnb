package com.micahstrube.bnb;

import java.math.BigDecimal;
import java.util.Date;

class Reservation {
    private Room room;
    private Date startDate;
    private Date endDate;
    private Date bookedDate;
    private BigDecimal balance;
    private Date balanceDueDate;
    private boolean canceled;

    Reservation() {
        canceled = false;
    }

    Room getRoom() {
        return room;
    }

    void setRoom(Room room) {
        this.room = room;
    }

    Date getStartDate() {
        return startDate;
    }

    void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    Date getEndDate() {
        return endDate;
    }

    void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    Date getBookedDate() {
        return bookedDate;
    }

    void setBookedDate(Date bookedDate) {
        this.bookedDate = bookedDate;
    }

    BigDecimal getBalance() {
        return balance;
    }

    void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    Date getBalanceDueDate() {
        return balanceDueDate;
    }

    void setBalanceDueDate(Date balanceDueDate) {
        this.balanceDueDate = balanceDueDate;
    }

    boolean isCanceled() {
        return canceled;
    }

    void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
