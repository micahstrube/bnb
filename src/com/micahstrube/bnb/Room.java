package com.micahstrube.bnb;

import java.math.BigDecimal;

class Room {
    private String name;
    private BigDecimal minimumRate;

    Room() {
        this.name = "";
        this.minimumRate = BigDecimal.valueOf(150);
    }

    Room(String name) {
        this.name = name;
        this.minimumRate = BigDecimal.valueOf(150);
    }

    Room(String name, BigDecimal minimumRate) {
        this.name = name;
        this.minimumRate = minimumRate;
    }

    Room(String name, double minimumRate) {
        this.name = name;
        this.minimumRate = BigDecimal.valueOf(minimumRate);
    }

    public String toString() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    BigDecimal getMinimumRate() {
        return minimumRate;
    }

    void setMinimumRate(BigDecimal minimumRate) {
        this.minimumRate = minimumRate;
    }

    void setMinimumRate(double minimumRate) {
        this.minimumRate = BigDecimal.valueOf(minimumRate);
    }
}
