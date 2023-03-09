package test.human;

import java.util.ArrayList;
import java.util.Scanner;

public class Human {
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    Scanner scannerHeight = new Scanner(System.in);
    float height = scannerHeight.nextFloat();
    Scanner scannerWeight = new Scanner(System.in);
    float weight = scannerWeight.nextFloat();
    String orientation;
    byte [] test ;

    public void setValue(String orientation, byte [] test ){
        this.orientation = orientation;
        this.test = test;
    }
    public Human(String orientation, byte [] test){
        System.out.println("Create Human");
        setValue(orientation , test);
        System.out.println(getValue());
        YesNo();
    }

    public String getValue(){
        String info = "Height: "+ height + "\nWeight: "+ weight + "\nName: " + name + "\nOrientation:" + orientation + "\n";
        String testValue = "Test value: \n";
        for (int i = 0; i < test.length; i++){
            testValue += test[i] + "\n" ;
        }
        return info + testValue;

    }
    public void YesNo(){
        int first = 180;
        if (first < height ){
            System.out.print("Yes that's normal");
        }else{
            System.out.print("No it's not " + first + "\n");
        }
    }
}
