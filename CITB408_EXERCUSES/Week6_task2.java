//Task2
Направете UML диаграма и имплементация на модела, който е описани по-долу:
Хранителен продукт (FoodStuff) има име и информация, дали е лют. Хранителните продукти са зеленчуци, плодове, подправки и месо.
Ястие (Dish) има име, цена и се приготвя от хранителни продукти.
Ресторант (Restaurant) има име и в него се приготвят ястия
Магазин (Shop) има име и в него се продават хранителни продукти.
Хранителните продукти и ястията могат да се ядат (eatable) и да се доставят (deliverable). Доставката на хранителните продукти и ястията трябва да бъде извършена в рамките на максимално допустимо време. Ако доставката не се осъществи в това време се счита за недоставена.

public interface Deliverable {
    boolean delivered(int deliveryTime);
}
public class DeliverableObject implements Deliverable{

    private int maxDeliveryTime;

    public DeliverableObject(int maxDeliveryTime) {
        this.maxDeliveryTime = maxDeliveryTime;
    }

    @Override
    public boolean delivered(int deliveryTime) {
        return deliveryTime <= this.maxDeliveryTime;
    }

    @Override
    public String toString() {
        return "DeliverableObject{" +
                "maxDeliveryTime=" + maxDeliveryTime +
                '}';
    }
}

public class Dish extends DeliverableObject implements Eatable {
    private String name;
    private double price;
    private List<FoodStuff> foodStuffList;

    public Dish(int maxDeliveryTime, String name, double price) {
        super(maxDeliveryTime);
        this.name = name;
        this.price = price;
        this.foodStuffList = new ArrayList<>();
    }

    public void addFoodProduct(FoodStuff foodStuff) {
        this.foodStuffList.add(foodStuff);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


public interface Eatable {
    default void eat() {
        System.out.println("Delicious!!!");
    }
}

public enum FoodProductType {
    VEGETABLE, FRUIT, MEAT, SPICE
}

public class FoodStuff extends DeliverableObject implements Eatable {
    private String name;
    private FoodProductType foodProductType;
    private boolean isSpicy;

    public FoodStuff(int maxDeliveryTime, String name, FoodProductType foodProductType, boolean isSpicy) {
        super(maxDeliveryTime);
        this.name = name;
        this.foodProductType = foodProductType;
        this.isSpicy = isSpicy;
    }

    @Override
    public void eat() {
        Eatable.super.eat();
        System.out.println((isSpicy ? "But is" : " And is not") + " Spicy!!!");
    }

    @Override
    public String toString() {
        return "FoodStuff{" +
                "name='" + name + '\'' +
                ", foodProductType=" + foodProductType +
                ", isSpicy=" + isSpicy +
                '}';
    }
}


public class Restaurant {
    private String name;
    private List<Dish> dishesList;

    public Restaurant(String name) {
        this.name = name;
        this.dishesList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Dish> getDishesList() {
        return dishesList;
    }

    public void addDish(Dish dish) {
        this.dishesList.add(dish);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", dishesList=" + dishesList +
                '}';
    }
}


public class Shop {
    private String name;
    private List<FoodStuff> foodStuffList;

    public Shop(String name) {
        this.name = name;
        this.foodStuffList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<FoodStuff> getFoodStuffList() {
        return foodStuffList;
    }

    public void addFoodStuff(FoodStuff foodStuff) {
        this.foodStuffList.add(foodStuff);
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", foodStuffList=" + foodStuffList +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {

       

        // Dishes Task
        System.out.println("-------------------------- Task 2 ------------------------");
        {
            FoodStuff tomato = new FoodStuff(100,"Tomato", FoodProductType.VEGETABLE, false);
            FoodStuff chickenMeat = new FoodStuff(50,"Chicken", FoodProductType.MEAT, false);
            FoodStuff garlic = new FoodStuff(150,"Garlic", FoodProductType.VEGETABLE, true);

            System.out.println(tomato);
            System.out.println(chickenMeat);
            System.out.println(garlic);
            garlic.eat();
            System.out.println("Is " + chickenMeat + " delivered " + chickenMeat.delivered(200));

            Dish pasta = new Dish(10,"Pasta", 15);
            pasta.addFoodProduct(tomato);
            pasta.addFoodProduct(chickenMeat);
            pasta.addFoodProduct(garlic);

            System.out.println(pasta);
            pasta.eat();
            System.out.println("Is " + pasta + " delivered " + pasta.delivered(9));


            Shop shop = new Shop("Billa");
            shop.addFoodStuff(tomato);
            shop.addFoodStuff(chickenMeat);

            Restaurant restaurant = new Restaurant("Happy");
            restaurant.addDish(pasta);


        }

    }
}