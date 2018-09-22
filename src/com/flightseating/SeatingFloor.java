package com.flightseating;

/**
 * Created by Harsh on 22-Sep-18.
 */
public class SeatingFloor {
    private SeatPanel leftPanel;
    private SeatPanel rightPanel;
    private SeatPanel[] middlePanels;

    public SeatPanel getLeftPanel() {
        return leftPanel;
    }

    public void setLeftPanel(SeatPanel leftPanel) {
        this.leftPanel = leftPanel;
    }

    public SeatPanel getRightPanel() {
        return rightPanel;
    }

    public void setRightPanel(SeatPanel rightPanel) {
        this.rightPanel = rightPanel;
    }

    public SeatPanel[] getMiddlePanels() {
        return middlePanels;
    }

    public void setMiddlePanels(SeatPanel[] middlePanels) {
        this.middlePanels = middlePanels;
    }
}
