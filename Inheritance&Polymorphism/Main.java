package com.citb408;

import com.citb408.repo.*;
import com.citb408.building.*;

public class Main {

    public static void main(String[] args) {

        // Task 1 Digital Repository
        {
            Author authorPetrov = new Author("Petrov");
            Book book1 = new Book();
            Book book2 = new Book(1.2, "pdf", "Book2",
                    authorPetrov, "1234");
            System.out.println(authorPetrov);
            System.out.println(book1);
            System.out.println(book2);

            Document doc1 = new Document(2.4, "txt", "Doc 1");
            Document doc2 = new Document(3.1, "txt", "Doc 2");

            Novel novel1 = new Novel(2, "pdf", "Novel 1", authorPetrov, "6789", "Abstract Novel 1");
            System.out.println(novel1);

            Repo repo = new Repo(100, 0, 0);
            repo.storeDocument(book1);
            System.out.println(repo);
            repo.storeDocument(book2);
            repo.storeDocument(doc2);
            repo.storeDocument(novel1);
            System.out.println(repo);

            Document docRef;
            docRef = book2;
            System.out.println(docRef.toString());
            docRef = novel1;
            System.out.println(docRef.toString());
            docRef = doc1;
            System.out.println(docRef.toString());
            docRef = new Newspaper(4, "pdf", "Newspaper 1", 30);
            System.out.println(docRef.toString());
            docRef = doc2;
            System.out.println(docRef.toString());
        }

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
