package com.flightseating;

/**
 * Created by Harsh on 22-Sep-18.
 */
public class Seat {
    private int rowNumber;
    private int columnNumber;
    private int passengerId;
    private SeatType seatType;

    public Seat(int rowNumber, int columnNumber, SeatType seatType) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.seatType = seatType;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public boolean isOccupied() {
        return this.passengerId != 0;
    }

    public boolean isWindowSeat() {
        return this.seatType == SeatType.WINDOW;
    }

    public boolean isMiddleSeat() {
        return this.seatType == SeatType.MIDDLE;
    }

    public boolean isAisleSeat() {
        return this.seatType == SeatType.AISLE;
    }
}

