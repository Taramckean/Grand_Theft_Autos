import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Michelin", "Medium", "Ford", 7 , "Black");
    }

    @Test
    public void canTestName(){
        assertEquals("Michelin", tyre.getName());
    }

    @Test
    public void canTestSize(){
        assertEquals("Medium", tyre.getSize());
    }

    @Test
    public void canTestType(){
        assertEquals("Ford", tyre.getType());
    }

    @Test
    public void canTestWeight(){
        assertEquals(7, tyre.getWeight());
    }

    @Test public void canTestColour(){
        assertEquals("Black", tyre.getColour());
    }


}
