import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("MacLaren", "Large", "Cadillac V8", 400, 200);
    }

    @Test
    public void canTestName(){
        assertEquals("MacLaren", engine.getName());
    }

    @Test
    public void canTestSize(){
        assertEquals("Large", engine.getSize());
    }

    @Test
    public void canTestType(){
        assertEquals("Cadillac V8", engine.getType());
    }

    @Test
    public void canTestWeight(){
        assertEquals(400, engine.getWeight());
    }

    @Test public void canTestHorsePower(){
        assertEquals(200, engine.getHorsepower());
    }
}
