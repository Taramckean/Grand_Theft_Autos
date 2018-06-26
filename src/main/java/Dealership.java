import java.util.ArrayList;

public class Dealership {

    private String motto;
    private String name;
    private double till;
    ArrayList<Car> vehicles;
    Dealer dealer;
    Customer customer;

    public Dealership(String motto, String name) {
        this.motto = motto;
        this.name = name;
        this.till = 0;
        this.vehicles = new ArrayList<Car>();
    }

    public String getMotto() {
        return motto;
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }


    public void addCar(Car car) {
        this.vehicles.add(car);
    }

    public int countCars() {
        return this.vehicles.size();
    }

    public ArrayList<Car> getVehicles() {
        return vehicles;
    }
}


