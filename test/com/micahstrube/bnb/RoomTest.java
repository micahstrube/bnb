package com.micahstrube.bnb;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void roomConstructorNoArgs() {
        Room room = new Room();
        assertEquals("", room.toString());
        assertEquals(BigDecimal.valueOf(150), room.getMinimumRate());
    }

    @Test
    void roomConstructorName() {
        Room room = new Room("0");
        assertEquals("0", room.toString());
        assertEquals(BigDecimal.valueOf(150), room.getMinimumRate());
    }

    @Test
    void roomConstructorNameAndMinimumRateBigDecimal() {
        Room room = new Room("0", BigDecimal.ONE);
        assertEquals("0", room.toString());
        assertEquals(BigDecimal.ONE, room.getMinimumRate());
    }

    @Test
    void roomConstructorNameAndMinimumRateDouble() {
        double rate = 1.0;
        Room room = new Room("0", rate);
        assertEquals("0", room.toString());
        assertEquals(BigDecimal.valueOf(1.0), room.getMinimumRate());
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
    void getMinimumRate() {
        Room room = new Room("0", 1.0);
        assertEquals(BigDecimal.valueOf(1.0), room.getMinimumRate());
    }

    @Test
    void setMinimumRate() {
        Room room = new Room ("0");
        room.setMinimumRate(BigDecimal.ONE);
        assertEquals(BigDecimal.ONE, room.getMinimumRate());

        room = new Room("0");
        double rate = 1.0;
        room.setMinimumRate(rate);
        assertEquals(BigDecimal.valueOf(1.0), room.getMinimumRate());
    }
}