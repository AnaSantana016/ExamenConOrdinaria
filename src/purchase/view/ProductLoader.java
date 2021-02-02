package purchase.view;

import java.util.List;
import purchase.model.Product;

public interface ProductLoader {
    List<Product> load();
}
