package seminar_1_dz.ex_dz;

public class main {
    public static void main(String[] args) {

       Product product1 = new Product("Перчатки", 2599.99, 4.8);
       Product product2 = new Product("Кроссовки", 3125.99, 3.2);
       Product product3 = new Product("Копилка", 431.49, 1.6);

       Category category1 = new Category("Спорт-товары", new Product[]{product1, product2});
       Category category2 = new Category("Аксессуары", new Product[]{product3});

       Basket basket1 = new Basket(new Product[]{product1});
       Basket basket2 = new Basket(new Product[]{product2, product3});

       User user1 = new User("Роман", "password_1", basket1);
       User user2 = new User("Александр", "password_2", basket2);

       System.out.println("\n---------------\nКаталог товаров:\n");

       for (Product product : category1.products) {
            System.out.println(product.name + ":\n цена - " + product.price + "\n рейтинг - " + product.rating);
        }

       for (Product product : category2.products) {
            System.out.println(product.name + ":\n цена - " + product.price + "\n рейтинг - " + product.rating);
        }

        System.out.println("\n---------------------\nПокупки пользователей:\n");

       if (user1.basket != null && user1.basket.purchasedProducts != null) {
           for (Product product : user1.basket.purchasedProducts) {
               System.out.println(user1.login + " - " + product.name);
            }
        }

       if (user2.basket != null && user2.basket.purchasedProducts != null) {
           for (Product product : user2.basket.purchasedProducts) {
               System.out.println(user2.login + " - " + product.name);
            }
        }
   }
}






