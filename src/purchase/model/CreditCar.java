package purchase.model;

public class CreditCar {
    
    private final int cartId;
    private final String ownerNmae;
    private final int securityNumber;

    public CreditCar(int cartId, String ownerNmae, int securityNumber) {
        this.cartId = cartId;
        this.ownerNmae = ownerNmae;
        this.securityNumber = securityNumber;
    }

    public int getCartId() {
        return cartId;
    }

    public String getOwnerNmae() {
        return ownerNmae;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    
    
    
    
}
