package com.company.Lab1;

import java.util.Scanner;

public class Lab3II4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập 3 số thực bất kỳ: ");
        double a = nhap.nextFloat(); double b = nhap.nextFloat();
        double c = nhap.nextFloat();
        if ((a+b>=c)&&(a+c>=b)&&(b+c>=a)){System.out.printf("%.1f, %.1f, %.1f là 3 cạnh của 1 hình tam giác", a,b,c);
        } else System.out.printf("%.1f, %.1f, %.1f không phải là 3 cạnh của 1 hình tam giác", a,b,c);
    }
}