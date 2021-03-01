package com.company;

import com.company.lesson11.SimpleBox;
import com.company.lesson11.Stats;
import com.company.lesson11.TestGeneric;
import com.company.lesson11.TwoGen;

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


    private void lesson11() { // методичка
        SimpleBox intBox1 = new SimpleBox(20);
        SimpleBox intBox2 = new SimpleBox(30);

        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
            int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
            System.out.println("sum = " + sum);
        } else {
            System.out.println("Содержимое коробок отличается по типу");
        }
        intBox1.setObj("Java");

        // продолжаем наш код, и при выполнении получим ClassCastException
        // int secondSum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();


        TestGeneric<String> genStr = new TestGeneric<>("Hello");

        genStr.showType();
        String valueFromGenString = genStr.getObj();

        System.out.println("genStr.getObject(): "
                + genStr.getObj() + " "
                + valueFromGenString);

        TestGeneric<Integer> genInt = new TestGeneric<>(140);

        genInt.showType();

        int valueFromGenInt = genInt.getObj();
        System.out.println("genInt.getObject(): "
                + genInt.getObj() +
                " " +
                valueFromGenInt);


        //  genInt.setObj("Java"); // Ошибка компиляции !!!

        TwoGen<Integer, String> twoGenObj = new TwoGen<Integer, String>(555, "Hello");
        twoGenObj.showTypes();
        int intValue = twoGenObj.getObj1();
        String strValue = twoGenObj.getObj2();
        System.out.println(intValue);
        System.out.println(strValue);


        Stats<Integer> intStats = new Stats<Integer>(1, 2, 3, 4, 5);
        System.out.println("Ср. знач. intStats равно " + intStats.avg());
        Stats<Double> doubleStats = new Stats<Double>(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Ср. знач. doubleStats равно " + doubleStats.avg());
        // Это не скомпилируется, потому что String не является подклассом Number
        // Stats<String> strStats = new Stats<>("1", "2", "3", "4", "5");
        // System.out.println("Ср. знач. strStats равно " + strStats.avg());


        Stats<Integer> intStats1 = new Stats<>(1, 2, 3, 4, 5);
        Stats<Integer> doubleStats1 = new Stats<>(1, 2, 3, 4, 5);


        if (intStats1.sameAvg(doubleStats1)) {
            System.out.println("Средние значения равны");
        } else {
            System.out.println("Средние значения не равны");
        }


        Stats<Integer> intStats2 = new Stats<>(1, 2, 3, 4, 5);
        Stats<Integer> intStats3 = new Stats<>(2, 1, 3, 4, 5);
        Stats<Double> doubleStats3 = new Stats<>(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(intStats2.sameAvg(intStats3)); // Так работает
        // System.out.println(intStats1.sameAvg(doubleStats)); // Ошибка
        // (T = Integer) != (T = Double)
        Stats<Integer> iStats = new Stats<>(1, 2, 3, 4, 5);
        System.out.println("Среднее iStats = " + iStats.avg());


        Stats<Double> dStats = new Stats<>(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Среднее dStats = " + dStats.avg());


        Stats<Float> fStats = new Stats<>(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
        System.out.println("Среднее fStats = " + fStats.avg());

        System.out.print("Средние iStats и dStats ");
        if (iStats.sameAvg(dStats)) {
            System.out.println("равны");
        } else {
            System.out.println("отличаются");
        }

        System.out.print("Средние iStats и fStats");
        if (iStats.sameAvg(fStats)) {
            System.out.println("равны");
        } else {
            System.out.println("отличаются");
        }

    } //по методичке


}
