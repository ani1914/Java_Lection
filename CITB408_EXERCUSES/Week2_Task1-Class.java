//Task1
Създайте клас Триъгълник (Triangle) с три член-данни - трите страни на триъгълника: side1, side2, side3 и следните методи:
Конструктор без параметри
Конструктор с 1 параметър, чрез който се създава равностранен триъгълник
Конструктор с три параметъра
Метод, който проверява дали съществува триъгълник по зададените три страни
Метод, който връща обиколката на триъгълника
Метод, който връща лицето на триъгълника
Метод, който увеличава дължините на трите страни с едно и също число, което се предава като параметър
Метод, който проверява дали триъгълника е равностранен
Метод, който проверява дали триъгълника е правоъгълен
Метод, който проверява, дали един триъгълник е „огромен“. Един триъгълник е „огромен“ , ако периметърът му е по-голям от число (hugeNumber), което е едно и също за всички триъгълници.

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
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
            /* Week 2 Task 1.1 */
            Triangle triangle3 = new Triangle();

            /* Week 2 Task 1.2 */
            Triangle triangle2 = new Triangle(50);

            /* Week 2 Task 1.3 */
            Triangle triangle1 = new Triangle(3, 4, 5);

            int number = 1;

            System.out.println(triangle1);

            /* Week 2 Task 1.4 */
            System.out.println(
                    "Is triangle: " + triangle1.isTriangle());

            /* Week 2 Task 1.5 */
            System.out.println("Perimeter: " + triangle1.perimeter());

            /* Week 2 Task 1.6 */
            System.out.println((double)
                    Math.round(triangle1.area() * 100) / 100);

            /* Week 2 Task 1.7 */
            triangle1.increaseSideLength(number);

            /* Week 2 Task 1.8 */
            System.out.println("Is equilateral: " + triangle1.isEquilateral());

            /* Week 2 Task 1.9 */
            System.out.println(triangle1.isRectangular());

            /* Week 2 Task 1.10 */
            System.out.println("Is Huge: " + triangle2.isTriangleHuge() 
        
    
}