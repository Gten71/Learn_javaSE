package test;

import java.util.Scanner;

public class Conditional_constructions {
    public static void main (String [] args ){
        //dz2 Создайте условный оператор switch case для проверки числовой переменной.
//        Scanner user = new Scanner(System.in);
//        int num = user.nextInt();
//        switch (num){
//            case 3:
//                System.out.print("Num = 3");
//                break;
//            case 7:
//                System.out.print("Num = 7");
//                break;
//            default:
//                System.out.print("!= 3 && !=7");
//                break;
//        }

        // это сложнее как дз хз калькулятор через свитч xdd
        Scanner kalk = new Scanner(System.in);
        System.out.print("First value: ");
        int num1 = kalk.nextInt();

        System.out.print("Second value: ");
        int num2 = kalk.nextInt();

        System.out.println("What? 1= + 2= - 3= * 4= /");
        int num3 = kalk.nextInt();
        switch (num3){
            case 1:
                System.out.print("Result is :" + num1 + num2);
                break;
            case 2:
                System.out.print("Result is: ");
                System.out.print(num1 - num2);
                break;
            case 3:
                System.out.print("Result is :" + num1 * num2);
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("Error");
                }else System.out.print("Result is :" + num1 / num2);
                break;
            default:
                System.out.println("Please select 1 - 4 ");
                break;
        }

    }
}
