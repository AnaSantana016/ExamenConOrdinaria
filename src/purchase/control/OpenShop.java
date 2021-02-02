package purchase.control;

import java.util.ArrayList;
import java.util.List;
import purchase.model.Catalogue;
import purchase.model.User;

public class OpenShop implements Shop{

    private final List<User> users;
    private final List<Catalogue> catalogue;

    public OpenShop() {
        this.users = new ArrayList<>();
        this.catalogue = new ArrayList<>();
    }
    
    @Override
    public void execute() {
    }
    
}
