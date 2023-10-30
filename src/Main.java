public class Main {

    public static void main(String[] args) {

        Basket firstBasket = new Basket();
        firstBasket.add("Молоко", 40);
        firstBasket.add("Хлеб", 30);

        firstBasket.print("Первая корзина:");
        System.out.println("Общаяя стоимость: " + firstBasket.getTotalPrice() + " руб." + "\n" +
                "Общий вес: " + firstBasket.getTotalWeight() + " гр." + "\n");

        System.out.println("Количество корзин: " + Basket.getCount());
        System.out.println("Средняя стоимость корзин: " + Basket.getAverageBasketPrice() + " руб.");
        System.out.println("Средняя цена товара: " + Basket.getAverageProductPrice() + " руб." + "\n");

        Basket secondBasket = new Basket(400);
        secondBasket.add("Черноголовка", 120, 2);
        secondBasket.add("Чипсы", 50, 3);

        secondBasket.print("Вторая корзина:");
        System.out.println("Общаяя стоимость: " + secondBasket.getTotalPrice() + " руб." + "\n" +
                "Общий вес: " + secondBasket.getTotalWeight() + " гр." + "\n");

        System.out.println("Количество корзин: " + Basket.getCount());
        System.out.println("Средняя стоимость корзин: " + Basket.getAverageBasketPrice() + " руб.");
        System.out.println("Средняя цена товара: " + Basket.getAverageProductPrice() + " руб." + "\n");

        Basket thirdBasket = new Basket(400);
        thirdBasket.add("Картофель", 10, 10, 120);
        thirdBasket.add("Морковь", 15, 3, 150);
        thirdBasket.add("Морковь", 50, 3);

        thirdBasket.print("Третья корзина:");
        System.out.println("Общаяя стоимость: " + thirdBasket.getTotalPrice() + " руб." + "\n" +
                "Общий вес: " + thirdBasket.getTotalWeight() + " гр."  + "\n");

        System.out.println("Количество корзин: " + Basket.getCount());
        System.out.println("Средняя стоимость корзин: " + Basket.getAverageBasketPrice() + " руб.");
        System.out.println("Средняя цена товара: " + Basket.getAverageProductPrice() + " руб." + "\n");

    }
}
