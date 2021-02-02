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
    
    public static void takeOff(int pos){
        
    }
    
    public void add(Product product){
        products.add(product);
        totalPrice += product.getPrice();
    }
}
