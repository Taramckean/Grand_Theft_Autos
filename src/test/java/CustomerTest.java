import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer("Jessy Knows", 1000);
    }

    @Test
    public void hasAName(){
        assertEquals("Jessy Knows", customer.getName());
    }

    @Test
    public void hasPocketMoney(){
        assertEquals(1000, customer.getPocketMoney());
    }

    @Test
    public void canBuyACar(){
        assertEquals();
    }
}