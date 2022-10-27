package com.javacode.slide6;

import java.util.ArrayList;
import java.util.List;

public class Slide6 {
    public static void main(String[] args) {
        System.out.println("\t a\n bcdef \"");

        String hoVaTen = "Nguyễn,ĐìnhSang,a";
        String hoVaTen2 = "    Nguyễn,Văn,Sáng      ";
        String ten = hoVaTen.substring(12);
        String tenLot = hoVaTen.substring(7, 12);
        System.out.println(ten);
        System.out.println(tenLot);

        List<String> listTen = new ArrayList<>();
        listTen.add(hoVaTen);
        listTen.add(hoVaTen2);

        for (int i = 0; i < listTen.size(); i++) {
            String[] tach = listTen.get(i).split(",");
            System.out.println(tach[2]);
        }

        System.out.println(hoVaTen2.toLowerCase());
        System.out.println(hoVaTen2.toUpperCase());
        System.out.println(hoVaTen2.trim());

        System.out.println(hoVaTen2.trim().toLowerCase().equals("    nguyễn,Văn,Sáng      ".trim().toLowerCase()));
    }
}
