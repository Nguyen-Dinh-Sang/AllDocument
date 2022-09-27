package com.javacode.slide4;

import java.util.Scanner;

public class SinhVien {
    String hoVaTen;
    int   diem;

    void nhapSinhVien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        hoVaTen = scanner.nextLine();

        System.out.print("Nhập điểm sinh viên: ");
        diem = scanner.nextInt();
    }

    void xuatSinhVien() {
        System.out.printf("Sinh viên: %s có điểm: %d\n", hoVaTen, diem);
    }

    void xepLoaiHocLuc() {
        if (diem > 5) {
            System.out.println("Học lực khá.");
        } else {
            System.out.println("Học lực trung bình.");
        }
    }
}
