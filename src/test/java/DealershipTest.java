import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealer dealer;
    Customer customer;
    Dealership dealership;

    @Before
    public void setUp(){
        dealer = new Dealer("Michael Theft");
        customer = new Customer("Jessy Knows", 1000);
        dealership = new Dealership("Every car is a steal", "Grand Theft Auto");
    }

    @Test
    public void hasAMotto(){
        assertEquals("Every car is a steal", dealership.getMotto());
    }

    @Test
    public void hasAName(){
        assertEquals("Grand Theft Auto", dealership.getName());
    }

    @Test
    public void hasATill(){
        assertEquals(0, dealership.getTill());
    }
}
