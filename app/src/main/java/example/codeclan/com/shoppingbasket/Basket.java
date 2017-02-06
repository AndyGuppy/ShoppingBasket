package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Andy Guppy on 05/02/2017.
 */

public class Basket {

    private ArrayList<Item> basket;

    public Basket() {
        this.basket = new ArrayList<>();

    }

    public int getSize() {
        return basket.size();
    }
    public void addItem(Item item) {
        basket.add(item);
    }
    public void removeItem() {
        basket.remove(0);
    }
    public void emptyBasket() {
        basket.clear();
    }
    public void removeByName(Item name){
        basket.removeAll(Collections.singleton(name));

    //public int getBasketTotal() {


        // To Tired



    //}
    }
}
