package com.javacode.slide4;

public class HinhChuNhat {
    Integer chieuDai;
    Integer chieuRong;

    public HinhChuNhat(Integer chieuDai, Integer chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat(Integer canh) {
        chieuRong = canh;
        chieuDai = canh;
    }

    public void tinhDienTichHinhChuNhat() {
        System.out.println("Diện tích hình chữ nhật là: " + (chieuDai * chieuRong));
    }
}
