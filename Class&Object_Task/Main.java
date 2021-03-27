package com.citb408;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        {
            /* Video Example from the Lecture */
            Video video1 = new Video("Video 1", BigDecimal.valueOf(5.6), 5);
            System.out.println(video1);
            Video video2 = new Video("Video 2", BigDecimal.valueOf(4.6), 9);
            System.out.println(video2);
            System.out.println(video1.isWithMoreLikes(video2));
            Video video3 = video1.videoWithMoreLikes(video2);
            System.out.println(video3);

            System.out.println(Video.getMaxDuration());
            Video.setMaxDuration(BigDecimal.valueOf(20.8));
            System.out.println(Video.getMaxDuration());
            Video.increaseMaxDuration(BigDecimal.valueOf(3.0));
            System.out.println(Video.getMaxDuration());

            Author ivan = new Author(5, "Ivan", LocalDate.of(2000, 3, 8));

            Video video4 = new Video("Video 4", BigDecimal.valueOf(7), 3, ivan);
            System.out.println(video4);
        }

        {
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
            System.out.println("Is Huge: " + triangle2.isTriangleHuge());

        }

        {
            /* Week 2 Task 2.1 */
            FlowersShop flowersShop1 = new FlowersShop();

            /* Week 2 Task 2.2 */
            FlowersShop flowersShop12 = new FlowersShop(100);

            /* Week 2 Task 2.3 */
            FlowersShop flowersShop11 = new FlowersShop(BigDecimal.valueOf(5.5));

            /* Week 2 Task 2.4 */
            FlowersShop flowersShop2 = new FlowersShop(100, BigDecimal.valueOf(8));

            /* Week 2 Task 2.5 */
            System.out.println(flowersShop2);

            int numberOfFlowers = 30;

            /* Week 2 Task 2.6 */
            flowersShop2.increaseNumberOfFlowers(124);
            System.out.println(flowersShop2);

            /* Week 2 Task 2.7 */
            flowersShop2.decreaseNumberOfFlowers(numberOfFlowers);
            System.out.println(flowersShop2);

            /* Week 2 Task 2.8 */
            flowersShop2.increasePrice(BigDecimal.valueOf(3));
            System.out.println(flowersShop2);

            /* Week 2 Task 2.9 */
            flowersShop2.decreasePrice(BigDecimal.valueOf(2));
            System.out.println(flowersShop2);

            /* Week 2 Task 2.10 */
            System.out.println("Profit: " + flowersShop2.profit());

            /* Week 2 Task 2.11 */
            FlowersShop flowersShop3 = new FlowersShop(200, BigDecimal.valueOf(5));
            System.out.println("Is first shop more profitable than the second: " +
                    flowersShop2.isFirstShopMoreProfitable(flowersShop3));

            /* Week 2 Task 2.12 */
            flowersShop1 = flowersShop2.shopWithMoreFlowers(flowersShop3);
            System.out.println("The shop with more flowers: " + flowersShop1);

            /* Week 2 Task 3*/
            Seller ivan = new Seller("Ivan", BigDecimal.valueOf(1000));

            flowersShop1.setSeller(ivan);
            flowersShop1.setIncreaseSalaryAmount(BigDecimal.valueOf(200));
            flowersShop1.increaseSalary();
            System.out.println("Ivan salary: " + ivan.getSalary());
        }
    }
}