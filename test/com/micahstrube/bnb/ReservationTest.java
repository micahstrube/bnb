package com.micahstrube.bnb;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    @Test
    void getRoom() {
        Reservation res = new Reservation();
        Room room = new Room();
        res.setRoom(room);
        assertEquals(room, res.getRoom());
    }

    @Test
    void setRoom() {
        Reservation res = new Reservation();
        Room room = new Room();
        res.setRoom(room);
        assertEquals(room, res.getRoom());
    }

    @Test
    void getStartDate() {
        Reservation res = new Reservation();
        Date date = new Date(System.currentTimeMillis());
        res.setStartDate(date);
        assertEquals(date, res.getStartDate());
    }

    @Test
    void setStartDate() {
        Reservation res = new Reservation();
        Date date = new Date(System.currentTimeMillis());
        res.setStartDate(date);
        assertEquals(date, res.getStartDate());
    }

    @Test
    void getEndDate() {
        Reservation res = new Reservation();
        Date date = new Date(System.currentTimeMillis());
        res.setEndDate(date);
        assertEquals(date, res.getEndDate());
    }

    @Test
    void setEndDate() {
        Reservation res = new Reservation();
        Date date = new Date(System.currentTimeMillis());
        res.setEndDate(date);
        assertEquals(date, res.getEndDate());
    }

    @Test
    void getBookedDate() {
        Reservation res = new Reservation();
        Date date = new Date(System.currentTimeMillis());
        res.setBookedDate(date);
        assertEquals(date, res.getBookedDate());
    }

    @Test
    void setBookedDate() {
        Reservation res = new Reservation();
        Date date = new Date(System.currentTimeMillis());
        res.setBookedDate(date);
        assertEquals(date, res.getBookedDate());
    }

    @Test
    void getBalance() {
        Reservation res = new Reservation();
        double balance = 150.00;
        res.setBalance(BigDecimal.valueOf(balance));
        assertEquals(BigDecimal.valueOf(balance), res.getBalance());
    }

    @Test
    void setBalance() {
        Reservation res = new Reservation();
        double balance = 150.00;
        res.setBalance(BigDecimal.valueOf(balance));
        assertEquals(BigDecimal.valueOf(balance), res.getBalance());
    }

    @Test
    void getBalanceDueDate() {
        Reservation res = new Reservation();
        Date date = new Date(System.currentTimeMillis());
        res.setBalanceDueDate(date);
        assertEquals(date, res.getBalanceDueDate());
    }

    @Test
    void setBalanceDueDate() {
        Reservation res = new Reservation();
        Date date = new Date(System.currentTimeMillis());
        res.setBalanceDueDate(date);
        assertEquals(date, res.getBalanceDueDate());
    }

    @Test
    void isCanceled() {
        Reservation res = new Reservation();
        assertEquals(false, res.isCanceled());
    }

    @Test
    void setCanceled() {
        Reservation res = new Reservation();
        res.setCanceled(true);
        assertEquals(true, res.isCanceled());
    }
}