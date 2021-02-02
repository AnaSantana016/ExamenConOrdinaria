package purchase.model;

public class Product {
    
    private final String product;
    private final String description;
    private double price;

    public Product(String product, String description, double price) {
        this.product = product;
        this.description = description;
        this.price = price;
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

    public void setPrice(double price) {
        this.price = price;
    }
}
