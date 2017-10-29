package com.micahstrube.bnb.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReservationTest {
    @Test
    void calculateCharges() {
        Reservation res = new Reservation();
        Room room = new Room();
        room.setWeekendRate(BigDecimal.valueOf(2));
        room.setWeekdayRate(BigDecimal.valueOf(1));
        res.setRoom(room);
        // 2 weekend night (Friday, Saturday) and 5 weekdays nights
        res.setStartDate(LocalDate.of(2017, 01, 1)); // A sunday
        res.setEndDate(LocalDate.of(2017, 01, 8)); // A sunday

        List<BigDecimal> calculatedCharges = res.calculateCharges();
        Collections.sort(calculatedCharges);

        List<BigDecimal> actualCharges = new ArrayList<>();
        actualCharges.add(BigDecimal.valueOf(1));
        actualCharges.add(BigDecimal.valueOf(1));
        actualCharges.add(BigDecimal.valueOf(1));
        actualCharges.add(BigDecimal.valueOf(1));
        actualCharges.add(BigDecimal.valueOf(1));
        actualCharges.add(BigDecimal.valueOf(2));
        actualCharges.add(BigDecimal.valueOf(2));
        Collections.sort(actualCharges);

        for(int i=0; i<=6; i++) {
            assertEquals(actualCharges.get(i), calculatedCharges.get(i));
        }
    }

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
        LocalDate date = LocalDate.now();
        res.setStartDate(date);
        assertEquals(date, res.getStartDate());
    }

    @Test
    void setStartDate() {
        Reservation res = new Reservation();
        LocalDate date = LocalDate.now();
        res.setStartDate(date);
        assertEquals(date, res.getStartDate());
    }

    @Test
    void getEndDate() {
        Reservation res = new Reservation();
        LocalDate date = LocalDate.now();
        res.setEndDate(date);
        assertEquals(date, res.getEndDate());
    }

    @Test
    void setEndDate() {
        Reservation res = new Reservation();
        LocalDate date = LocalDate.now();
        res.setEndDate(date);
        assertEquals(date, res.getEndDate());
    }

    @Test
    void getBookedDate() {
        Reservation res = new Reservation();
        LocalDate date = LocalDate.now();
        res.setBookedDate(date);
        assertEquals(date, res.getBookedDate());
    }

    @Test
    void setBookedDate() {
        Reservation res = new Reservation();
        LocalDate date = LocalDate.now();
        res.setBookedDate(date);
        assertEquals(date, res.getBookedDate());
    }

    @Test
    void getBalanceDueDate() {
        Reservation res = new Reservation();
        LocalDate date = LocalDate.now();
        res.setBalanceDueDate(date);
        assertEquals(date, res.getBalanceDueDate());
    }

    @Test
    void setBalanceDueDate() {
        Reservation res = new Reservation();
        LocalDate date = LocalDate.now();
        res.setBalanceDueDate(date);
        assertEquals(date, res.getBalanceDueDate());
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