package edu.cpp.khai.cs5800.hw1.q2.models;

public class CargoShip extends Ship {
    private int capacity;

    public CargoShip(String name, String yearBuilt, int capacity) {
        super(name, yearBuilt);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void print() {
        System.out.printf("%s| Capacity in Tons: %-10s%n", this.getShipInfo(), this.getCapacity());
    }
}
