package Gift;

public class Cookie extends SomeSweet {
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
}
