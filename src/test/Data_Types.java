package test;

public class Data_Types {
    public static void main (String [] args ){


        byte age = 127;
        short num1 = 128;
        int num2 = 57;
        long num3 = 456;

// byte - от -128 до 127 и занимает 1 байт
// short- от -32768 до 32767 и занимает 2 байта
// int - от -2147483648 до 2147485647 и занимает 4 байта
// long - от -9 223 372 056 854 775 808 до 9 225 372 036 854 775 807 и занимает 8 байт

        float num4 = 5.3F;
        double num5 = 5.34D; // в два раза больше чем в типе данных float

        char ch = '1'; // для хранения одного символа

        String user_name = "Alex";
        System.out.println(user_name);

        boolean isHappy = true; // boolean хранит только 2 значения True/False
    }


}
