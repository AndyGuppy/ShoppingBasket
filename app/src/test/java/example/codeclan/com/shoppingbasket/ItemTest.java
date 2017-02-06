package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by Andy Guppy on 05/02/2017.
 */

public class ItemTest {

    Item football;

    @Before
    public void setup() {
        football = new Item("football", true, 2);
    }

    @Test
    public void canGetItemName() {
        assertEquals("football", football.getName());
    }

    @Test
    public void canGetItemPrice() {
        assertEquals(2, football.getItemPrice());
    }

    @Test
    public void canGetItemSpecial() {
        assertEquals(true, football.getBogof());
    }

    @Test
    public void canSetItemPrice() {
        football.setItemPrice(17);
        assertEquals(17, football.getItemPrice());
    }

    @Test
    public void canSetItemSpecial() {
        football.setBogof(false);
        assertEquals(false, football.getBogof());
    }
}