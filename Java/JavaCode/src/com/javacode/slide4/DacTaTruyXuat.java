package com.javacode.slide4;

public class DacTaTruyXuat {
    // Default (mặc đinh) public với chung package private với khác package
    Integer chieuDai;

    // Private chỉ cho phép sử dụng bên trong class.
    private Integer chieuRong;

    public DacTaTruyXuat(Integer chieuDai, Integer chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void dienTich() {
        System.out.println("Diện tich: " + (chieuDai * chieuRong));
    }
}
