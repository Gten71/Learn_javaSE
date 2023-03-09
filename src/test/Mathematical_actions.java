package test;

import java.util.Scanner;

public class Mathematical_actions {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in );

        System.out.print("Введите 1 число");
        float num1 = scan.nextFloat();
        System.out.print("Введите 2 число");
        float num2 = scan.nextFloat();

        float rez1 = num1 + num2;
        float rez2 = num1 - num2;
        float rez3 = num1 * num2;
        float rez4 = num1 / num2;

        System.out.println("Результат: ");
        System.out.print(rez1 + "\n"+rez2 + "\n"+rez3 + "\n"+rez4 + "\n");


        //dz1
        Scanner test = new Scanner(System.in);
        System.out.print("Chs: ");
        float testi = test.nextFloat();
        System.out.print("Rez: " + testi);

        //дз его
        System.out.print("Введите число с точкой: ");
        Scanner num = new Scanner(System.in);
        System.out.println("Ваше число - " + num.nextFloat ());

    }
    //nextLine for String
    //nextInt for int
    //nextFloat for float

    //        System.out.print("Set name: ");
//        String user_name= scan.nextLine();
//        System.out.println("You name: "+user_name);
//        int num1 = scan.nextInt();
}
