package Gift;

public class Candy extends SomeSweet {
    public Candy(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.id = "3";
    }

    public Candy() {
        this.name = "Конфеты";
        this.weight = 6;
        this.price = 250;
        this.id = "3";
    }
}
