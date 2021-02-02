package purchase.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
 
    private final List<Product> products;
    private double totalPrice;

    public ShoppingCart() {
        products = new ArrayList<>();
        this.totalPrice = 0;
    }
    
    public void takeOff(int pos){
        products.remove(pos);
    }
    
    public void add(Product product){
        products.add(product);
        totalPrice += product.getPrice();
    }
}
