package com.micahstrube.bnb;

import java.math.BigDecimal;

public class Room {
    private String name;
    private BigDecimal minimumRate;

    public Room() {
        this.name = "";
        this.minimumRate = BigDecimal.valueOf(150);
    }

    public Room(String name) {
        this.name = name;
        this.minimumRate = BigDecimal.valueOf(150);
    }

    public Room(String name, BigDecimal minimumRate) {
        this.name = name;
        this.minimumRate = minimumRate;
    }

    public Room(String name, double minimumRate) {
        this.name = name;
        this.minimumRate = BigDecimal.valueOf(minimumRate);
    }

    public String toString() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMinimumRate() {
        return minimumRate;
    }

    public void setMinimumRate(BigDecimal minimumRate) {
        this.minimumRate = minimumRate;
    }

    public void setMinimumRate(double minimumRate) {
        this.minimumRate = BigDecimal.valueOf(minimumRate);
    }
}
