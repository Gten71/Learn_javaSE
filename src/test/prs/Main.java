package test.prs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args){

    List<Person> personList = new ArrayList<>();
    Person person1 = new Person("test1");
    Person person2 = new Person("test2");


    personList.add(person1);
    personList.add(person2);

        System.out.println(personList.size());
    }
}
