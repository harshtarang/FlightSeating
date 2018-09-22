package com.flightseating;

/**
 * Created by Harsh on 22-Sep-18.
 */
public class SeatPanel {
    private int rows;
    private int columns;
    private Seat[][] seats;
    private SeatPanelType seatPanelType;

    public SeatPanel(int rows, int columns, SeatPanelType panelType) {
        this.rows = rows;
        this.columns = columns;
        Seat[][] seats = new Seat[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                SeatType seatType;
                switch (panelType) {
                    case LEFT:
                        if (j == 0)
                            seatType = SeatType.WINDOW;
                        else if (j == columns - 1)
                            seatType = SeatType.AISLE;
                        else
                            seatType = SeatType.MIDDLE;
                        break;

                    case MIDDLE:
                        if (j == 0 || j == columns - 1)
                            seatType = SeatType.AISLE;
                        else
                            seatType = SeatType.MIDDLE;
                        break;

                    case RIGHT:
                        if (j == 0)
                            seatType = SeatType.AISLE;
                        else if (j == columns - 1)
                            seatType = SeatType.WINDOW;
                        else
                            seatType = SeatType.MIDDLE;
                        break;

                    default:
                        seatType = SeatType.MIDDLE;
                        System.out.println("Something went wrong! Panel type has incorrect value");
                }

                seats[i][j] = new Seat(i + 1, j + 1, seatType);
            }
        }
        this.seats = seats;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Seat[][] getSeats() {
        return seats;
    }

    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }

    public SeatPanelType getSeatPanelType() {
        return seatPanelType;
    }

    public void setSeatPanelType(SeatPanelType seatPanelType) {
        this.seatPanelType = seatPanelType;
    }
}
