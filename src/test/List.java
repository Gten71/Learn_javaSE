package test;

import java.util.LinkedList;
// динамический массив данных

public class List {
    public static void main (String [] args ){
        //ArrayList<>
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(79);
//        numbers.set(1,80);


        //первое число это элемент по индексу масства второе это значение элемента
//        numbers.size();
//        numbers.get(0); // конкретный элемент
//        numbers.remove(1); //удаление определенного элемента по индексу
//        numbers.clear(); //удаление всех эллементов из массива

//        for (Integer el : numbers){ //новый метод перебора массива
//            System.out.println(el);
//
//        }


        //LinkedList разницы почти нету кроме привязки эллементов друг к другу
        LinkedList<Integer> mass = new LinkedList<>();
        mass.add(56);
        mass.add(89);
        mass.add(12);
        for (Integer el : mass){
            System.out.println(el);
        }


//        add() - добавление элемента в конец массива;
//        remove() - удаление элемента из массива по его индексу;
//        clear() - очистка всего массива;
//        size() - получение размера массива (количество элементов);
//        addFirst() - добавление элемента в начало массива;
//        addLast() - добавление элемента в конец;
//        clone() - выполняет клонирование массива;
//        get() - возвращает элемент по индексу;
//        getFirst() - возвращает первый элемент в массиве;
//        getLast() - возвращает последний элемент в массиве;
//        set(index, element) - меняет значение элемента по индексу.
    }
}
