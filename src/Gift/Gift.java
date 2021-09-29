package Gift;

import java.util.ArrayList;

public class Gift {
    private ArrayList<SomeSweet> GIFT = new ArrayList<>();

    public void addSweet(SomeSweet sweet) {
        GIFT.add(sweet);
    }

    public int getWeight() {
        int weight = 0;
        for (SomeSweet sweet : GIFT) {
            weight += sweet.weight;
        }
        return weight;
    }

    public int getPrice() {
        int price = 0;
        for (SomeSweet sweet : GIFT) {
            price += sweet.price;
        }
        return price;
    }

    @Override
    public String toString() {
        String description = "В подарке:\n";
        for (int i = 0; i < GIFT.size(); i++) {
            description += i+1 + ") " + GIFT.get(i) + "\n";
        }
        return description;
    }
}
