package Gift;

public class Waffle extends SomeSweet {
    String filling = "Клубника";

    public Waffle(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.id = "2";
    }

    public Waffle() {
        this.name = "Вафли";
        this.weight = 4;
        this.price = 80;
        this.id = "2";
    }

    @Override
    public String toString() {
        return "Название: " + this.name + " вес: " + this.weight + " цена: " + this.price + " начинка: " + this.filling;
    }
}
