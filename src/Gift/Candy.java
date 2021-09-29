package Gift;

public class Candy extends SomeSweet {
    String wrapper = "Фантик";

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

    @Override
    public String toString() {
        return "Название: " + this.name + " вес: " + this.weight + " цена: " + this.price + " упаковка: " + this.wrapper;
    }
}
