package purchase.model;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    
    private final String name;
    
    private final List<Product> products;

    public Catalogue(String name) {
        products = new ArrayList<>();
        this.name = name;
    }
    
    public void takeOff(int pos){
        products.remove(pos);
    }
    
    public void add(Product product){
        products.add(product);
    }
    
}
