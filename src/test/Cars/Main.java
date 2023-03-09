package test.Cars;

public class Main {
    public static void main (String[] args){

//        Car bmw = new Car(220.4f, 2300, "White " , new byte[]{2,34,0}) ;
//      bmw.engine.setValues(true,100);
//      bmw.engine.info();
//
//        Truck truck = new Truck(5100 , new byte[]{12 , 21 , 1}, false);
//        truck.setValues(220.4f, 2300, "White " , new byte[]{2,34,0}, true);
//        System.out.println(truck.getValues());
//        truck.engine.setValues(false,600);
//        truck.engine.info();

//        Car flyCar = new Car(220.4f, 2300, "White " , new byte[]{2,34,0}) {
//            @Override
//            public void moveObject(float speed) {
//                super.moveObject(speed);
//
//                this.engine.setReady(true);
//                System.out.println("Car flying");
//            }
//        };
//
//        flyCar.moveObject(450);

        Car bmw = new Car();

        bmw.setLight(true);
        bmw.blinkLight();
        //interface
    }
}
