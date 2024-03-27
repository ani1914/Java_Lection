//Task1
Реализирайте следната йерархия от класове:
Хранилище за дигитални документи: максимален обем на данните, които може да сe съхраняват, брой на съхранените документи и текущият обем на запазените данни.
Документ: размер на файла, формат (PDF, JPG, TXT, …) и заглавие
Автор: име
Книга: автор и ISBN код
Роман: резюме
Стихосбирка: брой стихотворения
Вестник: периодичност на издаване и брой статии
За всеки от класовете създайте конструктори и предефинирайте метод toString(), който да връща низа със стойностите на член-данни от базовите класове и специфичните за класа член-данни.
Да се реализира възможност в хранилището да се добавят документи, ако все още има място за съхранението им. Когато се добави документ в хранилището, трябва да се покаже на конзолата съобщение за това кой документ е добавен.

public class Author {
    private  String name;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Book extends Document {

    private Author author;
    private String isbnCode;

    public Book() {
    }

    public Book(double fileSize, String format, String title, Author author, String isbnCode) {
        super(fileSize, format, title);
        this.author = author;
        this.isbnCode = isbnCode;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString()
                +
                "Book{author=" + author +
                ", isbnCode='" + isbnCode + '\'' +
                '}';
    }
}

public class Document {
    private double fileSize;
    private String format;
    private String title;

    public Document() {
    }

    public Document(double fileSize, String format, String title) {
        this.fileSize = fileSize;
        this.format = format;
        this.title = title;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFormat() {
        return format;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "fileSize=" + fileSize +
                ", format='" + format + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

public class Newspaper extends Document {
    private int numberOfArticles;

    public Newspaper(double fileSize, String format, String title, int numberOfArticles) {
        super(fileSize, format, title);
        this.numberOfArticles = numberOfArticles;
    }

    public int getNumberOfArticles() {
        return numberOfArticles;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Newspaper{" +
                "numberOfArticles=" + numberOfArticles +
                '}';
    }
}



public class Novel extends Book {
    private String novelAbstract;

    public Novel(double fileSize, String format, String title, Author author, String isbnCode, String novelAbstract) {
        super(fileSize, format, title, author, isbnCode);
        this.novelAbstract = novelAbstract;
    }

    public String getNovelAbstract() {
        return novelAbstract;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Novel{" +
                "novelAbstract='" + novelAbstract + '\'' +
                '}';
    }
}


public class Repo {
    private double maxData;
    private int numberOfDocuments;
    private double currentUsedSpace;

    public Repo(double maxData, int numberOfDocuments, double currentUsedSpace) {
        this.maxData = maxData;
        this.numberOfDocuments = numberOfDocuments;
        this.currentUsedSpace = currentUsedSpace;
    }

    public double getMaxData() {
        return maxData;
    }

    public int getNumberOfDocuments() {
        return numberOfDocuments;
    }

    public double getCurrentUsedSpace() {
        return currentUsedSpace;
    }

    public void storeDocument(Document document) {
        if (maxData - currentUsedSpace >= document.getFileSize() ) {
            this.numberOfDocuments++;
            this.currentUsedSpace += document.getFileSize();
            System.out.println(document + " is stored in the repository!");
        }
        else {
            System.out.println("Not enough space!");
        }
    }

    @Override
    public String toString() {
        return "Repo{" +
                "maxData=" + maxData +
                ", numberOfDocuments=" + numberOfDocuments +
                ", currentUsedSpace=" + currentUsedSpace +
                '}';
    }
}


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

        
    }
}

