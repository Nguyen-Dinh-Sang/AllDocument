package com.javacode.slide3;

public class ViDu19 {

    public static void main(String[] args) {
        int[] mangInt = {4, 5, 6, 7, 6, 10, 3, 7, 9, 15, 20};

        int tong = 0;

        for (int i = 0; i < mangInt.length; i++) {
            if (mangInt[i] % 2 == 0) {
                tong += mangInt[i];
            }
        }

        System.out.println("Tong các so chia het cho 2: " + tong);
    }
}
