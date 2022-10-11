package com.javacode.slide1;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        String hoVaTen;
        Integer diem;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        hoVaTen = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        diem = scanner.nextInt();

        System.out.println("<<" + hoVaTen + ">>" + "<<" + diem + ">>" + "điểm");
    }
}
