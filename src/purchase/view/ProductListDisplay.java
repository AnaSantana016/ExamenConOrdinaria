package purchase.view;

import java.util.List;
import purchase.model.Product;

public interface ProductListDisplay {
    void display(List<Product> products);
    void on(ProductSelected product);
    
    public interface ProductSelected{
        void product(Product product);
    } 
    
}
