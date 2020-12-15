package ru.mirea;

public class MyArray<E>  {
    E[] arr;
    public MyArray(E[] arr)
    {
        this.arr = arr;
    }
    public E getArrIndex(int i){ return arr[i]; }
}
