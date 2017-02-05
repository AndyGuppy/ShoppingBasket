package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;


import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by Andy Guppy on 05/02/2017.
 */

public class ItemTest {

    Item football;

    @Before
    public void setup() {
        football = new Item("football", SpecialsEnum.NONE, 2);
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
        assertEquals(SpecialsEnum.NONE, football.getSpecial());
    }

    @Test
    public void canSetItemPrice() {
        football.setItemPrice(17);
        assertEquals(17, football.getItemPrice());
    }

    @Test
    public void canSetItemSpecial() {
        football.setSpecial(SpecialsEnum.BOGOF);
        assertEquals(SpecialsEnum.BOGOF, football.getSpecial());
    }
}