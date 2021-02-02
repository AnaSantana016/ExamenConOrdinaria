package purchase.model;

public class User {
 
    private final String name;
    private final int telephone;
    private final String email;
    private final ShoppingCart shoppingCart;
    private CreditCar creditCar;    

    public User(String name, int telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.shoppingCart = new ShoppingCart();
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setCreditCar(CreditCar creditCar) {
        this.creditCar = creditCar;
    }
    
}
