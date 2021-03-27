package com.citb408.building;

public class Office extends Premise {

    private int numberOfWorkPlaces;

    public Office(double area, Building building, int numberOfWorkPlaces) {
        super(area, building);
        this.numberOfWorkPlaces = numberOfWorkPlaces;
    }

    public int getNumberOfWorkPlaces() {
        return numberOfWorkPlaces;
    }

    @Override
    public void capacity() {
        super.capacity();
        System.out.println("Number of work places " + this.numberOfWorkPlaces);
    }

    @Override
    public String toString() {
        return "Office{" +
                "numberOfWorkPlaces=" + numberOfWorkPlaces +
                '}';
    }
}
