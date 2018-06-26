import java.util.ArrayList;

public class Car {
    private String colour;
    private int price;
    private String brand;
    private int year;
    private int mileage;
    private ArrayList<Component> components;

    public Car(String colour, int price, String brand, int year, int mileage){
        this.colour = colour;
        this.price = price;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
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
}
