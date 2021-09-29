package Gift;

public class Cookie extends SomeSweet {
    int countInPackage = 10;

    public Cookie(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.id = "1";
    }

    public Cookie() {
        this.name = "Печенье";
        this.weight = 5;
        this.price = 100;
        this.id = "1";
    }

    @Override
    public String toString() {
        return "Название: " + this.name + " вес: " + this.weight + " цена: " + this.price + " в упаковке: " + this.countInPackage + " шт.";
    }
}
