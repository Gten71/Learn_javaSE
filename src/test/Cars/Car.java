package test.Cars;

public class Car  extends  All_Transport implements ILights {
    private boolean isOn;
    public Engine engine = new Engine();

    public Car(float _speed , int _weight , String _color , byte [] _coordinate){
        super(_speed , _weight , _color , _coordinate);
// super ищет в классе родители игнорируя класс в котором находится
    }

    public Car(){}
    @Override
    public void moveObject(float speed) {
        System.out.println("Speed object:" + speed);

    }
    @Override
    public boolean stopObject(float speed) {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("blink lights");
    }
}
