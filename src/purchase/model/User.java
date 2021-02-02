package purchase.model;

public class User {
 
    private final String name;
    private final int telephone;
    private final String email;

    public User(String name, int telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    
}
