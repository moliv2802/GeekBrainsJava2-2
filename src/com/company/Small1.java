package com.company;

public class Small1 {

    public static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

}

