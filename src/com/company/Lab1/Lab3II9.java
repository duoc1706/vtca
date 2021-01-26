package com.company.Lab1;

import java.util.Scanner;

public class Lab3II9 {
    public static void main(String[] args) {
        boolean check = false;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập 3 điểm:");
        System.out.print("Điểm x: ");
        float x1 = nhap.nextFloat();
        float y1 = nhap.nextFloat();
        System.out.print("Điểm y: ");
        float x2 = nhap.nextFloat();
        float y2 = nhap.nextFloat();
        System.out.print("Điểm z: ");
        float x3 = nhap.nextFloat();
        float y3 = nhap.nextFloat();
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            check = true;
            System.out.println("3 điểm trên tạo thành tam giác");
        } else System.out.println("3 điểm trên không tạo thành tam giác");
        if (check == true) {
            if (a == b && a == c && b == c) {
                System.out.println("Hình trên là tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("Hình trên là tam giác cân");
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                System.out.println("Hình trên là tam giác vuông");
            } else System.out.println("Hình trên là tam giác thường");
        }
    }
}