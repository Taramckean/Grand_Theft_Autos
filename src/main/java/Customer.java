import java.util.ArrayList;

public class Customer {

    private String name;
    private int pocketMoney;
    Car car;


    public Customer(String name, int pocketMoney) {
        this.name = name;
        this.pocketMoney = pocketMoney;
    }

    public String getName() {
        return name;
    }

    public int getPocketMoney() {
        return pocketMoney;
    }

    public void buyACar(Car car){
        pocketMoney -= car.getPrice();
    }

}