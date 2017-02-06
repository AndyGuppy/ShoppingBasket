package example.codeclan.com.shoppingbasket;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by Andy Guppy on 05/02/2017.
 */


public class CustomerTest {

    Customer Robert;
    Customer Shiela;

    @Before
    public void before() {
        this.Robert = new Customer(false, "Robert");
        this.Shiela = new Customer(true, "Shiela");
    }

    @Test
    public void canGetNonLoyal() {
        assertEquals(false, Robert.getLoyalty());
    }

    @Test
    public void canGetLoyal() {
        assertEquals(true, Shiela.getLoyalty());
    }

    @Test
    public void canGetName() {
        assertEquals("Shiela", Shiela.getName());
    }
}