package com.citb408.repo;

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
