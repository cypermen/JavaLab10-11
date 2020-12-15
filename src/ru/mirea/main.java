package ru.mirea;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;


public class main {


    public static void main(String [] args){
        //Тест первого задания Написать метод для конвертации массива строк/чисел в список.
        Integer [] int1 = {1,2,3,4,5};
        String [] str = {"a","b","c","d","e"};
        List list1 = ToList.toList(int1);
        List list2 = ToList.toList(str);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        //Тест второго задания Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
        Long[] l = {1L,2L,3L,4L,5L};
        Byte[] b = {1,2,3,4,5};
        Short[] s = {1,2,3,4,5};
        MyArray arrl = new MyArray(l);
        MyArray arri = new MyArray(int1);
        MyArray arrb = new MyArray(b);
        MyArray arrs = new MyArray(s);
        //Тест третьего задания Написать функцию, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.
        arrl.getArrIndex(2);
        arri.getArrIndex(2);
        arrb.getArrIndex(2);
        arrs.getArrIndex(2);



    }
}
