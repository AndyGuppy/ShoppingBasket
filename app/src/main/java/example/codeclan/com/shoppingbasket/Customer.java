package example.codeclan.com.shoppingbasket;

/**
 * Created by Andy Guppy on 05/02/2017.
 */

public class Customer {

    // if time permits add customer name
    private boolean loyaltyCard;
    private String name;


    public Customer(boolean loyaltyCard, String name) {
        this.loyaltyCard = loyaltyCard;
        this.name = name;
    }

    public boolean getLoyalty() {
        return loyaltyCard;
    }

    public String getName() {
        return name;
    }
}