public class Engine extends Component {

    private int horsepower;
    public Engine(String name, String size, String type, int weight, int horsepower){
        super(name, size, type, weight);
        this.horsepower = horsepower;
    }


    public int getHorsepower() {
        return this.horsepower;
    }
}
