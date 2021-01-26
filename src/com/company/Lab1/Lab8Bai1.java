package com.company.Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab8Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean lap = true;
        ArrayList<String> string = new ArrayList<>();
        String nhap;
        do {
            System.out.println("1- khoi tao danh sach.\n" +
                    "2- them 1 phan tu vao danh sach.\n" +
                    "3- xoa 1 phan tu ra khoi danh sach.\n" +
                    "4- chen 1 phan tu vao danh sach.\n" +
                    "5- duyet danh sach.\n" +
                    "6- tim 1 phan tu.\n" +
                    "7- sap xep danh sach tang dan\n" +
                    "8- sap xep danh sach giam dan\n" +
                    "0- thoat chuong trinh\n");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Nhập 1 chuỗi bất kỳ: ");
                    nhap = sc.nextLine();
                    string.add(nhap);
                    System.out.println("Kết quả: " + string);
                    nhap = "";
                    break;
                case 2:
                    System.out.print("Nhập 1 chuỗi bất kỳ: ");
                    nhap = sc.nextLine();
                    string.add(nhap);
                    System.out.println("Kết quả: " + string);
                    nhap = "";
                    break;
                case 3:
                    System.out.println("Nhập phần tử muốn xoá: ");
                    int x = sc.nextInt();
                    string.remove(x);
                    System.out.println("Kết quả: " + string);
                    break;
                case 4:
                    System.out.println("Nhập vị trí và phần tử muốn thêm");
                    int y = sc.nextInt(); nhap = sc.nextLine();
                    string.add(y, nhap);
                    break;
                case 5:
                    for (int i = 0; i < string.size(); i++) {
                        System.out.print(string.get(i)+" ");
                    }
                    break;
                case 6:
                    System.out.println("Nhập phần tử cần tìm: ");
                    nhap = sc.nextLine();
                    if (string.contains(nhap)){
                        System.out.println("Vị trí của "+nhap+" trong mảng là "+string.indexOf(nhap));
                    } else System.out.println(nhap +" không có trong mảng");
                    break;
                case 0:
                    lap = false;
                    break;
                default:
                    System.out.println("Sai!");
                    break;
            }
        } while (lap = true);
    }
}
