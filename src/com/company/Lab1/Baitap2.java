package com.company.Lab1;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        String stt = "STT"; String Hoten = "Họ tên"; String namsinh = "Năm sinh";
        String gioitinh = "Giới tính"; String chieucao = "Chiều cao";
        System.out.println("===============================================");
        System.out.println(String.format("%-5s%-20s%-15s%-15s%-15s", stt, Hoten, namsinh, gioitinh, chieucao));
        Scanner sc = new Scanner(System.in);
        byte sott = 1;
        System.out.print("Tên 1: "); String Hoten1 = sc.nextLine();
        System.out.print("Năm sinh: "); int namsinh1 = sc.nextInt();
        Scanner sr = new Scanner(System.in);
        System.out.print("Giới tính: "); String gioitinh1 = sr.nextLine();
        System.out.print("Chiều cao: "); float chieucao1 = sc.nextFloat();
        System.out.print(String.format("%-5d%-20s%-15s%-15s%-15.1s", sott, Hoten1, namsinh1, gioitinh1, chieucao1));
    }
}
