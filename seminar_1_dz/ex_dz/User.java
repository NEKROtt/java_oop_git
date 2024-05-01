package seminar_1_dz.ex_dz;

class User {

    String login;
    String password;
    Basket basket;
 
    User(String login, String password, Basket basket) {
 
        this.login = login;
        this.password = password;
        this.basket = basket;
    }
 }
