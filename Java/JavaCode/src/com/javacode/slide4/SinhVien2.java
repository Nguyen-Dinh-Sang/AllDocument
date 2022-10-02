package com.javacode.slide4;

public class SinhVien2 {
    private String hoVaTen;
    private Integer diem;

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setDiem(Integer diem) {
        if (diem >= 0 && diem <= 10) {
            this.diem = diem;
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public Integer getDiem() {
        return diem - 1;
    }

    public Boolean diemNull() {
        if (diem == null) {
            return true;
        } else {
            return false;
        }
    }
}
