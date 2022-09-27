package com.javacode.slide3;

public class Demo1_2 {
    public static void main(String[] args) {
        int dem = 27;

        int tong = 0;
        int cacSoChiaHetCho3 = 0;

        while (dem < 250) {
            if (dem % 3 == 0) {
                 tong += dem;
                 cacSoChiaHetCho3++;
            }

            dem++;
        }

        double trungBinhCong = tong/cacSoChiaHetCho3;

        System.out.println("Trung bình cộng các số chia hết cho 3: " + trungBinhCong);
    }
}
