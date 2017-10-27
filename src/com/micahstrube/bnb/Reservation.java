package com.micahstrube.bnb;

import java.math.BigDecimal;
import java.util.Date;

public class Reservation {
    private Room room;
    private Date startDate;
    private Date endDate;
    private Date bookedDate;
    private BigDecimal balance;
    private Date balanceDueDate;
    private boolean canceled;

    public Reservation() {
        canceled = false;
    }
}
