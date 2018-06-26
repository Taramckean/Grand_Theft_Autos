import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    Engine engine;
    Tyre tyre1,tyre2, tyre3, tyre4;
    Chassis chassis;

    @Before
    public void before(){
        car = new Car("Silver", 55000, "Mercedes", 2018, 0 , 0, 2);
        engine = new Engine("Mercedes", "Large", "Cadillac V8", 400, 200);
        chassis = new Chassis("Mercedes W Chassis", "Small", "Sedan", 1000, "Silver");
        tyre1 = new Tyre("Michelin", "Medium", "Ford", 7 , "Black");
        tyre2 = new Tyre("Michelin", "Medium", "Ford", 7 , "Black");
        tyre3 = new Tyre("Michelin", "Medium", "Ford", 7 , "Black");
        tyre4 = new Tyre("Michelin", "Medium", "Ford", 7 , "Black");
    }

    @Test
    public void canTestColour(){
        assertEquals("Silver", car.getColour());
    }

    @Test
    public void canTestPrice(){
        assertEquals(55000, car.getPrice());
    }

    @Test
    public void canTestBrand(){
        assertEquals("Mercedes", car.getBrand());
    }

    @Test
    public void canTestYear(){
        assertEquals(2018, car.getYear());
    }

    @Test
    public void canTestSpeed(){
        assertEquals(0, car.getSpeed());
    }

   @Test
    public void canBuildCar(){
        car.addComponent(engine);
        car.addComponent(chassis);
        car.addComponent(tyre1);
       car.addComponent(tyre2);
       car.addComponent(tyre3);
       car.addComponent(tyre4);
       assertEquals(6, car.countComponents());
   }

   @Test
    public void canTurnSpeedup() {
       car.turnSpeedUp(30);
       assertEquals(30, car.getSpeed());
   }

    @Test
    public void canTurnSpeedDown() {
        car.turnSpeedUp(30);
        car.turnSpeedDown(10);
        assertEquals(20, car.getSpeed());
    }

    @Test
    public void canBreak(){
        assertEquals("SCREECH", car.breakCar());
    }

}
