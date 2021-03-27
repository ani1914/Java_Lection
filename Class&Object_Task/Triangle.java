package com.citb408;

/**
 * @author Kostadinova
 */
public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    /* Week 3 Task 1.1 */
    public Triangle() {
    }

    /* Week 3 Task 1.2 */
    public Triangle(double number) {
        this.side1 = number;
        this.side2 = number;
        this.side3 = number;
    }

    /* Week 3 Task 1.3 */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /* Week 3 Task 1.4 */
    public boolean isTriangle() {
        return (side1 + side2 > side3)
                && (side1 + side3 > side2)
                && (side2 + side3 > side1);
    }

    /* Week 3 Task 1.5 */
    public void increaseSideLength(double number) {
        if (number < 0) {
            System.out.println("Invalid");
        } else {
            this.side1 += number;
            this.side2 += number;
            this.side3 += number;
        }
    }

    /* Week 3 Task 1.6 */
    public double perimeter() {
        return side1 + side2 + side3;
    }

    /* Week 3 Task 1.7 */
    public double area() {
        return Math.sqrt(perimeter() / 2
                * (perimeter() / 2 - side1)
                * (perimeter() / 2 - side2)
                * (perimeter() / 2 - side3));
    }

    /* Week 3 Task 1.8 */
    public boolean isEquilateral() {
        return side1 == side2 && side1 == side3;
    }

    /* Week 3 Task 1.9 */
    public boolean isRectangular() {
        boolean isRectangular = (Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2))
                || (Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2))
                || (Math.pow(side3, 2) == Math.pow(side2, 1) + Math.pow(side2, 2));
        return isRectangular;
    }


    /* Week 3 Task 1.10 */
    private static double hugeNumber = 100;

    /* Week 3 Task 1.10 */
    public boolean isTriangleHuge() {
        return this.perimeter() >= hugeNumber;
    }

    /* Week 3 Task 1.10 */
    public static double getHugeNumber() {
        return hugeNumber;
    }

    /* Week 3 Task 1.10 */
    public static void setHugeNumber(double hugeNumber) {
        Triangle.hugeNumber = hugeNumber;
    }


    @Override
    public String toString() {
        return "Triangle{" + "side1=" + side1 +
                ", side2=" + side2 + ", side3=" + side3 + '}';
    }

}
