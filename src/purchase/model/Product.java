package purchase.model;

import java.util.List;

public class Product {
    
    private final String product;
    private final String description;
    private final double price;
    private final List<Catalogue> catalogue;
    private final List<ShoppingCart> shoppingCart;

    public Product(String product, String description, double price, List<Catalogue> catalogue, List<ShoppingCart> shoppingCart) {
        this.product = product;
        this.description = description;
        this.price = price;
        this.catalogue = catalogue;
        this.shoppingCart = shoppingCart;
    }

    public String getProduct() {
        return product;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public List<Catalogue> getCatalogue() {
        return catalogue;
    }

    public List<ShoppingCart> getShoppingCart() {
        return shoppingCart;
    }    
    
}
