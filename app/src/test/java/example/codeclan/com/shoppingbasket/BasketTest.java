package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Andy Guppy on 05/02/2017.
 */


    public class BasketTest {
        private Basket basket;
        private Item firestick, xbox, ps4;

        @Before
        public void before(){
            basket = new Basket();     // has a loyalty card

            firestick = new Item("FireStick", true,38.00);
            xbox = new Item("XBox", false, 199.00);
            ps4 = new Item("PS4", false, 100.00);


        }

        @Test
        public void isBasketEmpty(){
            assertEquals(0,basket.getSize());
        }

        @Test
        public void canAddItemToBasket(){
            basket.addItem(firestick);
            assertEquals(1,basket.getSize());
        }

        @Test
        public void canRemoveItemFromBasket(){
            loadBasket();
            basket.removeItem();
            assertEquals(5,basket.getSize());
        }

        @Test
        public void canRemoveItemByNameFromBasket(){
            loadBasket();
            basket.removeByName(firestick);
            assertEquals(3,basket.getSize());
        }
        @Test
        public void canEmptyBasket(){
            loadBasket();
            assertEquals(6,basket.getSize());
            basket.emptyBasket();
            assertEquals(0,basket.getSize());
        }



    private void loadBasket(){

        basket.addItem(firestick);
        basket.addItem(ps4);
        basket.addItem(firestick);
        basket.addItem(ps4);
        basket.addItem(xbox);
        basket.addItem(firestick);
    }
    }
