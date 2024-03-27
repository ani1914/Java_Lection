//Task1
Направете UML диаграма на модела (класове, абстрактни класове и интерфейси), който е описани по-долу:
Стока (Goods) е обект, който има надценка и за него може да се изчисли цената за производство и продажната цена.
Артикул за продаване (CanBeSold) е обект, за който може да се изчисли цената за производство и продажната цена.
Регистриран доставчик (RegisteredProvider) e физическо или юридическо лице, което има регистрационен номер и приходите му могат да се изчислят.
Доставчик (Provider) e обект, чиито приходи могат да се изчислят.
Направете UML диаграма на модела (класове, абстрактни класове и интерфейси), който е описани по-долу:
Превозно средство (Vehicle) се определя от разходи за материали и разходи за заплати. За всяко превозно средство могат да се изчислят цената за създаването му и продажната му цена.
Инженер (Engineer) е човек, който произвежда стоки, определя се от заплата на час и изработени часове. За всеки инженер може да се изчисли колко са приходите му.
Таксиметров шофьор(TaxiDriver) е човек, който е регистриран, че може да превозва пътници срещу заплащане и приходите му се определят от броя на изминатите километри и цената на километър

public interface CanBeSold {
    double productionPrice();
    double sellingPrice();
}

public class Engineer implements Provider {

    private double workedHours;
    private double pricePerHour;

    public Engineer(double workedHours, double pricePerHour) {
        this.workedHours = workedHours;
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double income() {
        return this.pricePerHour * this.workedHours;
    }
}

public abstract class Goods implements CanBeSold {
    private double overcharge;

    public Goods(double overcharge) {
        this.overcharge = overcharge;
    }

    @Override
    public double sellingPrice() {
        return productionPrice() + this.overcharge;
    }
}

public interface Provider {
    double income();
}

public abstract class RegisteredProvider implements Provider {

    private String regNumber;

    public RegisteredProvider(String regNumber) {
        this.regNumber = regNumber;
    }
}

public class TaxiDriver extends RegisteredProvider {
    private double numberOfKm;
    private double pricePerKm;

    public TaxiDriver(String regNumber, double numberOfKm, double pricePerKm) {
        super(regNumber);
        this.numberOfKm = numberOfKm;
        this.pricePerKm = pricePerKm;
    }

    @Override
    public double income() {
        return this.numberOfKm * this.pricePerKm;
    }
}

public class Vehicle extends Goods {

    private double materialsCosts;
    private double salariesCosts;

    public Vehicle(double overcharge, double materialsCosts, double salariesCosts) {
        super(overcharge);
        this.materialsCosts = materialsCosts;
        this.salariesCosts = salariesCosts;
    }

    @Override
    public double productionPrice() {
        return this.materialsCosts + this.salariesCosts;
    }
}


public class Main {

    public static void main(String[] args) {
	    Vehicle vehicle1 = new Vehicle(1000, 2000, 3000);
        System.out.println(vehicle1.productionPrice());
        System.out.println(vehicle1.sellingPrice());

        CanBeSold canBeSold;
        canBeSold = vehicle1;
        System.out.println(canBeSold.productionPrice());
        System.out.println(canBeSold.sellingPrice());

        TaxiDriver taxiDriver1 = new TaxiDriver("A1234", 120, 2);
        System.out.println(taxiDriver1.income());

        Engineer engineer1 = new Engineer(35, 350);
        System.out.println(engineer1.income());

        Provider provider = taxiDriver1;
        System.out.println(provider.income());

        provider = engineer1;
        System.out.println(provider.income());

    }
}