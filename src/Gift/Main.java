package Gift;


public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift();
        gift.addSweet(new Waffle());
        gift.addSweet(new Candy());
        gift.addSweet(new Cookie("Супер печенюхи",2,270));

        System.out.println("Цена подарка: " + gift.getPrice());
        System.out.println("Вес подарка: " + gift.getWeight());
        System.out.println(gift);
    }
}
