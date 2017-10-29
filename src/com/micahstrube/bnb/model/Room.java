package com.micahstrube.bnb.model;

import java.math.BigDecimal;

class Room {
    private String name;
    private BigDecimal weekendRate;
    private BigDecimal weekdayRate;

    Room() {
        this.name = "";
        this.weekendRate = BigDecimal.valueOf(150);
        this.weekdayRate = BigDecimal.valueOf(150);
    }

    Room(String name) {
        this.name = name;
        this.weekendRate = BigDecimal.valueOf(150);
        this.weekdayRate = BigDecimal.valueOf(150);
    }

    public String toString() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    BigDecimal getWeekendRate() {
        return weekendRate;
    }

    void setWeekendRate(BigDecimal weekendRate) {
        this.weekendRate = weekendRate;
    }

    BigDecimal getWeekdayRate() {
        return weekdayRate;
    }

    void setWeekdayRate(BigDecimal weekdayRate) {
        this.weekdayRate = weekdayRate;
    }
}
