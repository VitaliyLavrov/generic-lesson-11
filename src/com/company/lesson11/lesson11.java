package com.company.lesson11;

public class lesson11 {
    private void lesson11() { // методичка mein
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
