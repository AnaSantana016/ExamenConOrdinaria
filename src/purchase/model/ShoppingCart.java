package purchase.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
 
    private final List<Product> products;
    private double totalPrice;

    public ShoppingCart(double totalPrice) {
        products = new ArrayList<>();
        this.totalPrice = totalPrice;
    }
    
    public void takeOff(int pos){
        products.remove(pos);
    }
    
    public void add(Product product){
        products.add(product);
        totalPrice += product.getPrice();
    }
}
