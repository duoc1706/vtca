package com.company.Lab1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab3II5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập số kilômét: ");
        double km = nhap.nextFloat(); double gia = 0;
        if (km<=1){gia = 15000;
        } if (km<=5){gia = gia + 13500*(km-1);}
        if (km>5){gia = gia + 11000*(km-5);}
        if (km>120){gia = 90/100*gia;}
        System.out.printf("Giá taxi là %,.0f",gia);
    }
}
