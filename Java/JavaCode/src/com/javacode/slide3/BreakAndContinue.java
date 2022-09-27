package com.javacode.slide3;

public class BreakAndContinue {
    public static void main(String[] args) {
        // Tìm kiếm số 20

        System.out.println("Bắt đầu.");

        for (int i = 1; i < 100; i++) {
            System.out.println("i = " + i);

            if (i == 20) {
                System.out.println("Đã tìm thấy số 20.");
                // break;

                continue;
            }

            System.out.println("-----");
        }

        System.out.println("Kết thúc.");
    }
}
