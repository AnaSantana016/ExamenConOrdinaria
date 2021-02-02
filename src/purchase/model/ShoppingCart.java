package purchase.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
 
    private final List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }
    
    public static void takeOff(Product product){
        
    }
    
    public void add(Product product){
        products.add(product);
    }
}
