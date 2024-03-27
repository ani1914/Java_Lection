//Task2
Създайте следната йерархия от класове:
Клас Сграда: площ
     	Методи: 
Конструктор с един параметър
Отпечатване на капацитета на сградата (площта на сградата)
Клас Помещение в сграда: площ и сградата, в която се намира
	Методи:
Конструктор с два параметър
Отпечатване на капацитета на помещението (площта му)
Клас Стая: брой легла
	 Методи: 
Конструктор с три параметъра
Отпечатване на капацитета на стаята (площта + брой хора, които могат да бъдат настанени в стаята)
Отпечатване на данните за стаята
Клас Апартамент: брой тераси
	 Методи: 
Конструктор с три параметъра
Отпечатване на капацитета на апартамента (площта му + брой тераси)
Отпечатване на данните за апартамента
Клас Офис: брой работни места
 	Методи: 
Конструктор с три параметъра
Отпечатване на капацитета на офиса (площта му + брой хора, които могат да работят в офиса)
Отпечатване на данните за офиса

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


public class Building {
    private double area;

    public Building(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void capacity() {
        System.out.println("Building area " + this.area);
    }

    @Override
    public String toString() {
        return "Building{" +
                "area=" + area +
                '}';
    }
}


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


public class Premise {
    private double area;
    private Building building;

    public Premise(double area, Building building) {
        this.area = area;
        this.building = building;
    }

    public double getArea() {
        return area;
    }

    public void capacity() {
        System.out.println("Area " + area);
    }

    @Override
    public String toString() {
        return "Premise{" +
                "area=" + area +
                ", building=" + building +
                '}';
    }
}

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

import com.citb408.repo.*;
import com.citb408.building.*;

public class Main {

    public static void main(String[] args) {

      
        // Task 2 Buildings
        {

            Building building = new Building(400);
            System.out.println(building);
            building.capacity();

            Premise premise1 = new Premise(30, building);
            System.out.println(premise1);

            Room room1 = new Room(25, building, 2);
            Room room2 = new Room(40, building, 3);

            System.out.println(room1);
            System.out.println(room2);

            Apartment apartment1 = new Apartment(80, building, 2);
            Apartment apartment2 = new Apartment(100, building, 3);

            System.out.println(apartment1);
            System.out.println(apartment2);

            Office office1 = new Office(50, building, 5);
            Office office2 = new Office(60, building, 6);

            System.out.println(office1);
            System.out.println(office2);

            Premise premiseRef = premise1;
            premiseRef.capacity();

            premiseRef = room1;
            premiseRef.capacity();

            premiseRef = apartment1;
            premiseRef.capacity();

            premiseRef = office1;
            premiseRef.capacity();


        }
    }
}


