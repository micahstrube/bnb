package com.micahstrube.bnb;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void roomConstructorNoArgs() {
        Room room = new Room();
        assertEquals("", room.toString());
    }

    @Test
    void roomConstructorName() {
        Room room = new Room("0");
        assertEquals("0", room.toString());
    }

    @Test
    void testToString() {
        Room room = new Room("0");
        assertEquals("0", room.toString());
    }

    @Test
    void setName() {
        Room room = new Room("0");
        room.setName("1");
        assertEquals("1", room.toString());
    }

    @Test
    void getWeekendRate() {
        Room room = new Room ("0");
        room.setWeekendRate(BigDecimal.ONE);
        assertEquals(BigDecimal.ONE, room.getWeekendRate());
    }

    @Test
    void setWeekendRate() {
        Room room = new Room ("0");
        room.setWeekendRate(BigDecimal.ONE);
        assertEquals(BigDecimal.ONE, room.getWeekendRate());
    }

    @Test
    void getWeekdayRate() {
        Room room = new Room ("0");
        room.setWeekdayRate(BigDecimal.ONE);
        assertEquals(BigDecimal.ONE, room.getWeekdayRate());
    }

    @Test
    void setWeekdayRate() {
        Room room = new Room ("0");
        room.setWeekdayRate(BigDecimal.ONE);
        assertEquals(BigDecimal.ONE, room.getWeekdayRate());
    }

}