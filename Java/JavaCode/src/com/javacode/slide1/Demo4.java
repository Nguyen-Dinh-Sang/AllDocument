package com.javacode.slide1;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hoTen;
        int tuoi;

        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();

        System.out.print("<<" + hoTen + ">>");
        System.out.printf(" năm nay <<%d>> tuổi", tuoi);
    }
}
