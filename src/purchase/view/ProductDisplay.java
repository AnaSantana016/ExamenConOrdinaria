package purchase.view;

import purchase.model.Product;

public interface ProductDisplay {
    Product product();
    void display(Product product);
}
