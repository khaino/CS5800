package edu.cpp.khai.cs5800.hw1.q2.models;

public class CruiseShip extends Ship {
    private int maximumPassengers;

    public CruiseShip(String name, String yearBuilt, int maximumPassengers) {
        super(name, yearBuilt);
        this.maximumPassengers = maximumPassengers;
    }

    public int getMaximumPassengers() {
        return maximumPassengers;
    }

    public void setMaximumPassengers(int maximumPassengers) {
        this.maximumPassengers = maximumPassengers;
    }

    public void print() {
        System.out.printf("%s| Max Passengers: %-10s%n",
                this.getShipInfo(),
                this.getMaximumPassengers());
    }
}
