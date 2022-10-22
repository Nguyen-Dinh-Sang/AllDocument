package com.javacode.slide3;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Integer so;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên: ");
        so = scanner.nextInt();

        boolean kiemTraSoNguyenTo = true;

        if (so < 2) {
            kiemTraSoNguyenTo = false;
        } else {
            for (int i = 2; i < so - 1; i++) {
                if (so % i == 0) {
                    kiemTraSoNguyenTo = false;
                    break;
                }
            }

        }

        if (kiemTraSoNguyenTo == true) {
            System.out.println("Số nguyên tố");
        } else {
            System.out.println("Không là số nguyên tố");
        }
    }
}
