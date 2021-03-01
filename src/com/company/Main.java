package com.company;



import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        Integer[] intArr = new Integer[]{0, 1, 2, 3};
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
        }
        System.out.println();
        swapsTwoElements(intArr,3, 0);
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
        }
        System.out.println();
        //Написать метод, который преобразует массив в ArrayList
            ArrayList<Integer> intlist = arrToArrList(intArr);
                System.out.println(intlist);


    }


    public static <T>ArrayList<T> arrToArrList(T[] arr){
        ArrayList<T> list = new ArrayList<T>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static <T> void swapsTwoElements( T[] arr, int i, int j) {
        if (i < arr.length && j < arr.length && i >= 0 && j >= 0) {
            T arg = arr[j];
            arr[j] = arr[i];
            arr[i] = arg;
        } else System.out.println("аргументы вне дипапзона");
    }





}
