package test;

import java.util.Scanner;

public class Arrays {

    public static void main (String[] args){
        //dz
//        int [] mass1 = new int[] {11,129,12,43,67};
//        int max = mass1[0];
//        for ( int i = 0; i < mass1.length;i++ ){
//            if (mass1[i] > max){
//                max = mass1[i];
//            }
//        }
//        System.out.println(max);

//        int[] arr = new int[4];
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < arr.length;i++){  // пользовательн вводит числа
//            System.out.print("Set value :" );
//            int value = scan.nextInt();
//            arr[i] = value;
//        }
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++){ // работает с массивоч чисел введенных пользователем
//            if (arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Minimal: " + min);

//        char[][] syms = new char[2][3];
//        syms[0][0] = 't';
//        System.out.println(syms[0][0]);
//
//        byte [][] nums = new byte[][]{
//                {5,4},
//                {3,7},
//                {7,8}
//        };
//        nums[1][1] = 34;
//        System.out.println(nums[1][1]);

//        for() // для каждого массива отдельный цикл
//            for()


        int [] arr = new int[4];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length;i ++){
            System.out.print("Set value: ");
            int value = scan.nextInt();
            arr[i] = value;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max value: " + max);



    }
}
