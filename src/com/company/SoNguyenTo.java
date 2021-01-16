package com.company;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int a = nhap.nextInt();
        int sont = 0;
        for (int i = 2; i <= a; i++) {
            if (check(i)) {
                sont += 1;
            }
        }
        System.out.println("Số lượng số nguyên tố từ 1 đến " + a + " là " + sont);
    }

    static boolean check(int num) {
        boolean def = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                def = false;
            }
        }
        return def;
    }
}