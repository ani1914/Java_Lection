package com.citb408;

import java.math.BigDecimal;

/**
 * Week 3 Task 3
 */
public class Seller {

    private String name;
    private BigDecimal salary;

    public Seller() {
    }

    public Seller(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Seller{" + "name=" + name + ", salary=" + salary + '}';
    }

}
