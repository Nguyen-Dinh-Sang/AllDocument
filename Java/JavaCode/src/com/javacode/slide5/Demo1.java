package com.javacode.slide5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5);
        doubleList.add(20.2);
        doubleList.add(3.0);
        doubleList.add(20.2);

        System.out.println(doubleList);

        doubleList.add(10.0);
        doubleList.add(10000.0);

        System.out.println(doubleList);

        Double tong = 0.0;
        for (int i = 0; i < doubleList.size(); i++) {
            tong += doubleList.get(i);
        }

        System.out.println("Tong: " + tong);

        Collections.sort(doubleList);

        System.out.println(doubleList);

        System.out.println("Vi trí: " + doubleList.indexOf(20.2));

        System.out.println(doubleList);

        doubleList.removeIf(aDouble -> aDouble == 20.2);
        System.out.println(doubleList);
    }
}
