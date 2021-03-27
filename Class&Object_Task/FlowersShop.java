package com.citb408;

import java.math.BigDecimal;

/*
 * Week 3 Task 2
 */
public class FlowersShop {

    private int numberOfFlowers;
    private BigDecimal pricePerFlower;

    public FlowersShop() {
    }

    public FlowersShop(int numberOfFlowers) {
        this.numberOfFlowers = numberOfFlowers;
    }

    public FlowersShop(BigDecimal pricePerFlower) {
        this.pricePerFlower = pricePerFlower;
    }

    public FlowersShop(int numberOfFlowers, BigDecimal pricePerFlower) {
        this.numberOfFlowers = numberOfFlowers;
        this.pricePerFlower = pricePerFlower;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    public void setNumberOfFlowers(int numberOfFlowers) {
        this.numberOfFlowers = numberOfFlowers;
    }

    /* Week 3 Task 2.5 */
    @Override
    public String toString() {
        return "FlowersShop{" +
                "numberOfFlowers=" + numberOfFlowers +
                ", pricePerFlower=" + pricePerFlower +
                '}';
    }

    /* Week 2 Task 2.6 */
    public void increaseNumberOfFlowers(int numberOfFlowers) {
        if (numberOfFlowers < 0) {
            System.out.println("You cannot increase number of flowers with negative number!");
        } else {
            this.numberOfFlowers += numberOfFlowers;
        }
    }

    /* Week 2 Task 2.7 */
    public void decreaseNumberOfFlowers(int numberOfFlowers) {
        if (numberOfFlowers < 0) {
            System.out.println("You cannot decrease number of flowers with negative number!");
        } else if (this.numberOfFlowers <= numberOfFlowers) {
            this.numberOfFlowers = 0;
        } else {
            this.numberOfFlowers -= numberOfFlowers;
        }
    }

    /* Week 2 Task 2.8 */
    public void increasePrice(BigDecimal pricePerFlower) {
        if (pricePerFlower.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("You cannot increase price of flowers with negative number!");
        } else {
            this.pricePerFlower = this.pricePerFlower.add(pricePerFlower);
        }
    }

    /* Week 2 Task 2.9 */
    public void decreasePrice(BigDecimal pricePerFlower) {
        if (pricePerFlower.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("You cannot decrease price of flowers with negative number!");
        } else if (!(this.pricePerFlower.compareTo(pricePerFlower) > 0)) {
            this.pricePerFlower = BigDecimal.ZERO;
        } else {
            this.pricePerFlower = this.pricePerFlower.subtract(pricePerFlower);
        }
    }

    /* Week 2 Task 3.10 */
    public BigDecimal profit() {
        return pricePerFlower.multiply(BigDecimal.valueOf(numberOfFlowers));
    }

    /* Week 2 Task 3.11 */
    public boolean isFirstShopMoreProfitable(FlowersShop flowersShop) {
        return
                this.profit().compareTo(flowersShop.profit()) > 0;
    }

    /* Week 2 Task 3.12 */
    public FlowersShop shopWithMoreFlowers(FlowersShop flowersShop) {
        if (this.numberOfFlowers > flowersShop.numberOfFlowers) {
            return new FlowersShop(this.numberOfFlowers, this.pricePerFlower);
        }
        return new FlowersShop(flowersShop.numberOfFlowers, flowersShop.pricePerFlower);
    }

    /* Week 3 Task 3 */
    private Seller seller;
    private BigDecimal increaseSalaryAmount;

    /* Week 3 Task 3 */
    public Seller getSeller() {
        return seller;
    }

    /* Week 3 Task 3 */
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public BigDecimal getIncreaseSalaryAmount() {
        return increaseSalaryAmount;
    }

    public void setIncreaseSalaryAmount(BigDecimal increaseSalaryAmount) {
        this.increaseSalaryAmount = increaseSalaryAmount;
    }

    /* Week 3 Task 3 */
    public void increaseSalary() {
        if (increaseSalaryAmount.compareTo(BigDecimal.ZERO) > 0) {
            seller.setSalary(seller.getSalary().add(increaseSalaryAmount));
        }
    }

}
