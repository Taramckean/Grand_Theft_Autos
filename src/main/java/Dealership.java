import java.util.ArrayList;

public class Dealership {

    private String motto;
    private String name;
    private double till;
    //    ArrayList<Car> vehicles;
    Dealer dealer;
    Customer customer;

    public Dealership(String motto, String name) {
        this.motto = motto;
        this.name = name;
        this.till = 0;
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
}


