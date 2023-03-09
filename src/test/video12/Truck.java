package test.video12;

public class Truck extends All_Transport{
    private boolean isLoaded;
    public Engine engine = new Engine();

    public Truck (int weight, byte [] coordinate){
        super(weight, coordinate);
    }


    public Truck (int weight, byte [] coordinate, boolean isLoaded){
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Speed object:" + speed);

    }

    @Override
    public boolean stopObject(float speed) {
        this.speed = 0;
        return true;
    }

    public void setValues(float speed , int weight , String color , byte [] coordinate, boolean isLoaded){
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded (boolean loaded) {
        this.isLoaded = loaded;
    }

    public String getLoaded ( ){
        if (isLoaded){
            return "Truck is full";
        }else{
            return "Truck is not full";
        }
    }


}
