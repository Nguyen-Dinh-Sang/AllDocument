package com.javacode.slide4;

public class Main {
    public static void main(String[] args) {
        // viDuClass();
        // demo13();
        // viDu18();
        // viDu19();
        // viDu25();
        viDu28();
    }

    static void viDu28() {
        SinhVien2 sinhVien = new SinhVien2();
        sinhVien.setHoVaTen("Nguyễn Đình Sang");
        sinhVien.setDiem(10);

        System.out.println("Họ tên sinh viên: " + sinhVien.getHoVaTen());
        System.out.println("Điểm: " + sinhVien.getDiem());
        System.out.println(sinhVien.diemNull());
    }

    static void viDu25() {
        DacTaTruyXuat dacTaTruyXuat = new DacTaTruyXuat(3, 2);
        dacTaTruyXuat.chieuDai = 7;
        dacTaTruyXuat.dienTich();
    }

    static void viDu19() {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(5, 3);
        hinhChuNhat.tinhDienTichHinhChuNhat();
    }

    static void viDu18() {
        MayTinh mayTinh = new MayTinh();
        System.out.println("Cộng 2 số: " + mayTinh.tinhTong(1, 2));
        System.out.println("Cộng 3 số: " + mayTinh.tinhTong(1, 2, 3));
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
