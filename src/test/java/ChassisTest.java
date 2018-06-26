import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChassisTest {
    Chassis chassis;

    @Before
    public void before(){
        chassis = new Chassis("Mercedes W Chassis", "Small", "Sedan", 1000, "Silver");
    }

    @Test
    public void canTestName(){
        assertEquals("Mercedes W Chassis", chassis.getName());
    }

    @Test
    public void canTestSize(){
        assertEquals("Small", chassis.getSize());
    }

    @Test
    public void canTestType(){
        assertEquals("Sedan", chassis.getType());
    }

    @Test
    public void canTestWeight(){
        assertEquals(1000, chassis.getWeight());
    }

    @Test public void canTestChassisColour(){
        assertEquals("Silver", chassis.getChassisColour());
    }
}
