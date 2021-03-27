package com.citb408.building;

public class Apartment extends Premise {
    private int numberOfTerraces;

    public Apartment(double area, Building building, int numberOfTerraces) {
        super(area, building);
        this.numberOfTerraces = numberOfTerraces;
    }

    public int getNumberOfTerraces() {
        return numberOfTerraces;
    }

    @Override
    public void capacity() {
        super.capacity();
        System.out.println("Number of terraces " + this.numberOfTerraces);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "numberOfTerraces=" + numberOfTerraces +
                '}';
    }
}
