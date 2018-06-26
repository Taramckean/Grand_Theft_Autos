public class Chassis extends Component {
    private String colour;

    public Chassis(String name, String size, String type, int weight, String colour){
        super(name, size, type, weight);
        this.colour = colour;
    }


    public String getChassisColour() {
        return this.colour;
    }
}
