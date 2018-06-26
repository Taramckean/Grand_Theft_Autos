import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void setUp(){
        dealer = new Dealer("Michael Theft");
    }

    @Test
    public void hasAName(){
        assertEquals("Michael Theft", dealer.getName());
    }

    @Test
    public void canTalk(){
        assertEquals("Hello, welcome to Grand Theft Auto", dealer.Talk());
    }

}