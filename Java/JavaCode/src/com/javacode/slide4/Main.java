package com.javacode.slide4;

public class Main {
    public static void main(String[] args) {
        // viDuClass();
        demo13();
    }

    static void demo13() {
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();
        SinhVien sinhVien3 = new SinhVien();

        sinhVien1.nhapSinhVien();
        sinhVien2.nhapSinhVien();

        sinhVien1.xuatSinhVien();

        sinhVien2.xepLoaiHocLuc();
    }

    static void viDuClass() {
        OTo oToCuaDung = new OTo();
        oToCuaDung.nam = 2010;
        oToCuaDung.nhaSanXuat = "Honda";
        oToCuaDung.model = "Accord";
        oToCuaDung.mau = "Xanh";

        System.out.println(oToCuaDung.model);
    }
}
