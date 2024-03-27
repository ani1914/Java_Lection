package com.citb408;
public class Town {

    private int population;
    private double area;

    public Town() {
        this.population = 0;
        this.area = 0;
    }

    public void showData() {
        System.out.println("Population is: " + population);
        System.out.println("Area is: " + area);
    }

    public void decrerasePopulation(int numberOfPeople) {
        if (numberOfPeople < 0) {
            System.out.println("You cannot decrease population with negative number of people!");
        } else if (population <= numberOfPeople) {
            this.population = 0;
        } else {
            this.population -= numberOfPeople;
        }
    }

    public void increasePopulation(int numberOfPeople) {
        if (numberOfPeople < 0) {
            System.out.println("You cannot increase population with negative number of people!");
        } else {
            this.population += numberOfPeople;
        }
    }

    public void increaseArea(double area) {
        if (area < 0) {
            System.out.println("You cannot increase area with negative number!");
        } else {
            this.area += area;
        }
    }
}

