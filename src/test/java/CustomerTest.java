import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Car car2;
    Car car3;

    Dealership dealership;

    @Before
    public void setUp(){
        customer = new Customer("Jessy Knows", 12000);
        car = new Car("Silver", 5000, "Mercedes", 2018, 0 , 0, 5);
        car2 = new Car("Silver", 5000, "Mercedes", 2018, 0 , 0, 6);
        car3 = new Car("Silver", 5000, "Mercedes", 2018, 0 , 0, 7);

        dealership = new Dealership("Every car is a steal", "Grand Theft Auto");
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
        dealership.addCar(car);
        dealership.addCar(car2);
        dealership.addCar(car3);
        customer.buyACar(car, dealership);
        assertEquals(7000, customer.getPocketMoney());
        assertEquals(5000, dealership.getTill(), 0.1);
        assertEquals(5, car.getId());
        assertEquals(1, customer.countCars());
        assertEquals(2, dealership.getVehicles().size());
    }
}