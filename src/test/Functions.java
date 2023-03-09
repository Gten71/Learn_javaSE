package test;

import java.util.Scanner;

public class Functions {
    // типы переменных созданных в одной функции не ведны в другой функции
//    public static void main (String [] args){
////        info("1"); // передается значение в параметр word
////        String java = "Java"; // текст переменной
////        info(java); // передача переменной
////        info("");
//
//
//
//        short num1 = 7;
//        int result1 = summa( (short) 5 , num1);
////        summa( (short) 5 , (short) 7); можно и так
//
//        short num2 = 94;
//        int result2 = summa( (short) 32 , num2);
//        // valueof - преобразование типа данных в другой
//        // String.valueof  = преобразоватие переменной типа Integer в типа данных String
//        info(String.valueOf(result1));
//    }
//
//    // можно создавать сколько угодно параметров даже с разными типами данных
//    // что бы создать функцию возвращяемого типа нужно после public static указать тип данных который нужно возвращять
//    public static int summa (short a, short b){
//        int res = a + b;
//        String result = "Результат: "+ res;
//        info(result);
//        return res; // возвразение какого либо значения из функции
//    }
//
//
//    // void ключевое слово функции означающее что функция ничего не возвращает
//    public static void info (String word) // первое это параметр данных второе это название параметра
//    {
//        System.out.print(word); // выводит результат типа стринг
//        System.out.println("!");
//
//    }

    public static void main (String [] args){
        int [] arr1 = new int[4];
        int result = summaArray(arr1);
        System.out.println(result);
    }
    // функция для подсчета суммы всех эллементов массива введенных пользователем
    public static int summaArray(int[] arr){
        Scanner scan = new Scanner(System.in);
        int summa = 0;
        for ( int i = 0 ; i < arr.length; i++){
            System.out.print("Set value of array: ");
            int value = scan.nextInt();
            arr[i] = value;
            summa += arr[i];
        }
        return summa ;
    }
}
