package test.human;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Set your Name,Height and Weight:");
        System.out.println("1.Name\n2.Height\n3.Weight");
        Human person1 = new Human("Man" , new byte[] {27,35,6});
        System.out.println("Set your Name,Height and Weight:");
        System.out.println("1.Name\n2.Height\n3.Weight");
        Human person2 = new Human("we" , new byte[] {27,35,6});
    }
}
