public class Tyre extends Component{

    private String colour;

    public Tyre(String name, String size, String type, int weight, String colour){
        super(name, size, type, weight);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }
}
