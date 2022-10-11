package com.javacode.oop;

public class MonThi {
    private String maMonThi;
    private String tenMonThi;

    public MonThi(String maMonThi, String tenMonThi) {
        this.maMonThi = maMonThi;
        this.tenMonThi = tenMonThi;
    }

    public String getMaMonThi() {
        return maMonThi;
    }

    public void setMaMonThi(String maMonThi) {
        this.maMonThi = maMonThi;
    }

    public String getTenMonThi() {
        return tenMonThi;
    }

    public void setTenMonThi(String tenMonThi) {
        this.tenMonThi = tenMonThi;
    }
}
