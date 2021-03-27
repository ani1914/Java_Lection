package com.citb408.building;

public class Room extends Premise {
    private int numberOfBeds;

    public Room(double area, Building building, int numberOfBeds) {
        super(area, building);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    @Override
    public void capacity() {
        super.capacity();
        System.out.println("Number of beds " + this.numberOfBeds);
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                '}';
    }
}
