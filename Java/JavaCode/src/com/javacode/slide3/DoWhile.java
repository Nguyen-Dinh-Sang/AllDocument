package com.javacode.slide3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // nhập 1 số nguyên kiểm tra số có chia hết cho 2 không:
        // nếu đúng thì in ra: hợp lệ.
        // nếu sai thì bắt nhập lại.

        Scanner scanner = new Scanner(System.in);
        int soNguyen;

        do {
            System.out.print("Nhập số nguyên: ");
            soNguyen = scanner.nextInt();
        } while (soNguyen % 2 != 0);

        System.out.println("Hợp lệ.");
    }
}
