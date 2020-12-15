package ru.mirea;

import java.util.LinkedList;
import java.util.List;

public class ToList {
   /* public static<E> List toList(E[] arr)
    {
        List<E> list = new LinkedList<E>();
        for(int i = 0;i < arr.length;i++)
        {
            list.add(arr[i]);
        }

        return list;
    }*/

    public static List toList(Object[] arr)
    {
        List list = new LinkedList();
        for(int i = 0;i < arr.length;i++)
        {
            list.add(arr[i]);
        }

        return list;
    }

}
