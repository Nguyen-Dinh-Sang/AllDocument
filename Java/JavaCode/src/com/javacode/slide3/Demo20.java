package com.javacode.slide3;

import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soPhanTuCuaMang = 0;
        int[] mangSoNguyen;
        int tong = 0;
        double trungBinhCong = 0;

        System.out.print("Nhập số lượng phần tử của mảng: ");
        soPhanTuCuaMang = scanner.nextInt();
        mangSoNguyen = new int[soPhanTuCuaMang];

        for (int i = 0; i < soPhanTuCuaMang; i++) {
            System.out.print("Nhập vào phần tử của mảng tại vị trí " + (i + 1) + " :");
            mangSoNguyen[i] = scanner.nextInt();
        }

        for (int i = 0; i < soPhanTuCuaMang; i++) {
            tong += mangSoNguyen[i];
        }

        System.out.println("Tổng mảng: " + tong);

        trungBinhCong = tong  * 1.0 / soPhanTuCuaMang;

        System.out.println("Trung bình cộng: " + trungBinhCong);

        for (int i = 0; i < soPhanTuCuaMang; i++) {
            System.out.printf("Lập phương của: %d là: %f \n",mangSoNguyen[i], Math.pow(mangSoNguyen[i], 3));
        }
    }
}
