package test;

import test.db.DB;

public class Packets_overloads_static_modifier {

    public static void main(String[] args){

        Packets_overloads_static_modifier_second test1 = new Packets_overloads_static_modifier_second();
        Packets_overloads_static_modifier_second test2 = new Packets_overloads_static_modifier_second();
        Packets_overloads_static_modifier_second test3 = new Packets_overloads_static_modifier_second();
        Packets_overloads_static_modifier_second test4 = new Packets_overloads_static_modifier_second();
        DB db = new DB();
        info("");
    }
    public static void info(){
        System.out.println("Hello");
    }

    public static void info(String word){
        System.out.println(word + "!");
    }
}
