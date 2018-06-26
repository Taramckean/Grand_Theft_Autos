import java.util.ArrayList;

public class Customer{

    private String name;
    private int pocketMoney;
    private ArrayList<Car>vehicles;
    Car car;


    public Customer(String name, int pocketMoney) {
        this.name = name;
        this.pocketMoney = pocketMoney;
        this.vehicles = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public int getPocketMoney() {
        return pocketMoney;
    }

    public void buyACar(Car car, Dealership dealership){
        Car car_to_be_removed = null;
        for(Car car1 : dealership.getVehicles()){
            if(car1.getId() == car.getId()){
                pocketMoney = pocketMoney - car.getPrice();
                dealership.setTill(dealership.getTill() + car.getPrice());
                this.vehicles.add(car);
                car_to_be_removed = car;

            }
        }
        dealership.getVehicles().remove(car_to_be_removed);

    }

    public int countCars() {
        return this.vehicles.size();
    }




}