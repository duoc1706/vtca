package com.company;

import java.util.Scanner;

public class MainMark {
    public static void main(String[] args) {
        Mark diem[] = new Mark [8]; //tạo 8 đối tượng
        Scanner sc = new Scanner(System.in);
        //System.out.print("Nhập tên môn: ");
        String monhoc="Toán";
        System.out.print("Điểm lý thuyết: "); float diemlt = sc.nextFloat();
        System.out.print("Điểm thực hành: "); float diemth = sc.nextFloat();
        Mark mh = new Mark();
        mh.NhapMonHoc(monhoc,diemlt,diemth);
    }
}
