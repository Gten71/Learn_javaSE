package test.video12;

public abstract class All_Transport {

    // protected какое либо класс\поле\метод он будет доступен только внутри только этого класса или классов наследования

    protected float speed ;
    private int weight;
    private String color;
    private byte[] coordinate ;
    public All_Transport(){}

    public All_Transport(float _speed , int _weight , String _color , byte [] _coordinate){
        System.out.println("Object Created: ");
        setValues(_speed , _weight , _color , _coordinate);
//        System.out.println(getValues());

    }
    public All_Transport (int weight, byte [] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
//        System.out.println(getValues());
    }


    //грубо говоря абстрактные методы это методы напомиания мол нужно такой то метод реализовать в классе наследнике

    public abstract void moveObject(float speed);
    public abstract boolean stopObject(float speed);


    protected void setValues (float speed , int weight , String color , byte [] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    protected String getValues(){
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + "\n";
        String infoCoordinate = "Coordrinates:\n";
        for (int i = 0 ; i < coordinate.length; i++){
            infoCoordinate += coordinate[i] + "\n";

        }
        return info + infoCoordinate;
    }


    class Engine{
        public void setReady(boolean ready) {
            isReady = ready;
        }

        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }

//        public void isReady(boolean isReady) {
//            this.isReady = isReady;
//        }

        public void info(){
            if (isReady){
                System.out.println("Engine is ready");
            }else System.out.println("Engine not ready and already passed: " + km + " km");
        }
    }
}

