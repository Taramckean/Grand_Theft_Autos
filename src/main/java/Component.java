public abstract class Component {
    private String name;
    private String size;
    private String type;
    private int weight;

    public Component(String name, String size, String type, int weight){
        this.name = name;
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public String getType() {
        return this.type;
    }


    public int getWeight() {
        return this.weight;
    }
}
