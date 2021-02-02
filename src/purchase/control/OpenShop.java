package purchase.control;

import java.util.List;
import purchase.model.Catalogue;
import purchase.model.User;

public class OpenShop implements Shop{

    private final List<User> users;
    private final List<Catalogue> catalogue;

    public OpenShop(List<User> users, List<Catalogue> catalogue) {
        this.users = users;
        this.catalogue = catalogue;
    }
    
    @Override
    public void execute() {
    }
    
}
