import java.util.ArrayList;

public class Car {
    private String colour;
    private int price;
    private String brand;
    private int year;
    private int mileage;
    private int speed;
    private ArrayList<Component> components;

    public Car(String colour, int price, String brand, int year, int speed, int mileage){
        this.colour = colour;
        this.price = price;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
        this.speed = speed;
        this.components = new ArrayList<Component>();
    }


    public String getColour() {
        return this.colour;
    }

    public int getPrice() {
        return price;
    }


    public String getBrand() {
        return this.brand;
    }


    public int getYear() {
        return this.year;
    }


    public void addComponent(Component component) {
        components.add(component);
    }

    public int countComponents() {
        return components.size();
    }

    public int getSpeed() {
        return this.speed;
    }

    public void turnSpeedUp(int speed) {
        this.speed += speed;
    }

    public void turnSpeedDown(int speed) {
        this.speed -= speed;
    }

    public String breakCar() {
        return "SCREECH";
    }
}
