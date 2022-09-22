package com.javacode.slide1;

import java.util.Scanner;

public class DemoMath {
    public static void main(String[] args) {
        // Viết chương trình nhập vào 2 số và tím số lớn nhất.
        Scanner scanner = new Scanner(System.in);

        int soThuNhat;
        int soThuHai;

        System.out.print("Nhập số thứ nhất: ");
        soThuNhat = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        soThuHai = scanner.nextInt();

        int soLonNhat = Math.max(soThuNhat, soThuHai);

        System.out.println("Số lớn nhất là: " + soLonNhat);
    }
}
