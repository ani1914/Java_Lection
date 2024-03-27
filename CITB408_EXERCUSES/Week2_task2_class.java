//Task2
Създайте клас FlowersShop (магазин за цветя, в магазина се продават само един вид цветя) с член-данни: брой на наличните цветя и цена за едно цвете. Създайте следните методи на класа:
Конструктор без параметри, който създава магазин за цветя с 0 на брой цветя и 0 лв. единична цена на цвете.
Конструктор с един параметър (брой цветя), единичната цена да бъде 0лв.
Конструктор с един параметър (единична цена), броят на цветята да бъде 0.
Конструктор с два параметъра (брой цветя и единична цена).
Метод toString(), който връща низа с описанието на състоянието на обекта.
Метод за увеличаване на броя на цветята.
Метод за намаляване на броя на цветята.
Метод за увеличаване на единичната цена.
Метод за намаляване на единичната цена.
Метод за изчисляване на общия оборот от наличните в магазина цветя, като се има предвид единичната цена.
Метод, който проверява дали един магазин за цветя е с по-голям оборот от друг
Метод, който връща магазина с по-голям брой цветя (сравняват се два магазина)
Създайте два обекта от клас Магазин за цветя и тествайте резултатите от изпълнението на методите

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

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
       
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
    }
}