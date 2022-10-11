package com.javacode.oop;

import java.util.Date;

public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private Date ngaySinh;
    private String noiSinh;
    private String namDuThi;

    public ThiSinh(String soBaoDanh, String hoTen, Date ngaySinh, String noiSinh, String namDuThi) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.namDuThi = namDuThi;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getNamDuThi() {
        return namDuThi;
    }

    public void setNamDuThi(String namDuThi) {
        this.namDuThi = namDuThi;
    }
}
