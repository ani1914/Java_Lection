//Task3
Създайте клас Продавач с име и заплата. Реализирайте конструктор, get и set методи и toString() метод.
В клас Магазин за цветя (задача 2.) добавете продавач. Създайте метод за увеличаване на заплатата на продавача, ако оборота е по-голям от определена сума, която се задава като свойство на класа Магазин за цветя.

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

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
       

            /* Week 2 Task 3*/
            Seller ivan = new Seller("Ivan", BigDecimal.valueOf(1000));

            flowersShop1.setSeller(ivan);
            flowersShop1.setIncreaseSalaryAmount(BigDecimal.valueOf(200));
            flowersShop1.increaseSalary();
            System.out.println("Ivan salary: " + ivan.getSalary());
}