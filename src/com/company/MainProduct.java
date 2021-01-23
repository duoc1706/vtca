package com.company;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Product product[] = new Product[5];
        String sanpham;
        int soluong;
        int giaban;
        int sumtong = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < product.length; i++) {
            sc.nextLine();
            System.out.println();
            System.out.print("Nhập tên sản phẩm " + (i + 1) + ": ");
            sanpham = sc.nextLine();
            System.out.print("Nhập số lượng sản phẩm " + (i + 1) + ": ");
            soluong = sc.nextInt();
            System.out.print("Nhập giá bán sản phẩm " + (i + 1) + ": ");
            giaban = sc.nextInt();
            product[i] = new Product(sanpham, soluong, giaban);
        }
        System.out.println();
        System.out.println("DANH MỤC SẢN PHẨM");
        System.out.println("|STT|  Tên sản phẩm  | Số lượng  |  Đơn giá  |  Tổng tiền  |");
        for (int i = 0; i < product.length; i++) {
            sumtong += product[i].getTongtien();
            System.out.printf("|%3d|%16s|%11d|%11d|%13d|", (i + 1), product[i].getTensanpham(),
                    product[i].getSoluong(), product[i].getGiaban(),
                    product[i].getTongtien());
            System.out.println();
            System.out.printf("|%54d|", sumtong);
        }
    }
}
