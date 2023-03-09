package test;

public class Packets_overloads_static_modifier_second {


    //любой метод или же любое поле не пренадлежит к обьекту а пренадлежит к классу в целом
    public static int count;

    public Packets_overloads_static_modifier_second() {
        count++;
    }
    public static void getCount(){
        System.out.println("Value: " + count);
    }
}
