package com.javacode.slide4;

public class Ham {
    public static void main(String[] args) {
         int soA = 5;
         int soB = 10;
         int tongAVaB = congHaiSo(soA, soB);
        System.out.println(tongAVaB);

        inRaManHinh("Sang");
    }

    static int congHaiSo(int soThuNhat, int soThuHai) {
        int tongHaiSo = soThuNhat + soThuHai;
        return tongHaiSo;
    }

    static void inRaManHinh(String name) {
        System.out.println("Hello: " + name);
    }
}
