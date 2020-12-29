package com.company;

import java.net.SocketOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Chương trình nhập xuất thông tin ứng viên");
        System.out.println("==========================================");
        System.out.println("Mời nhập ứng viên số 1: ");
        Scanner nhapten = new Scanner(System.in);
        System.out.print("\t+ Nhập họ tên: "); String name = nhapten.nextLine();
        System.out.print("\t+ Nhập ngày sinh: "); int dob = nhapten.nextByte();
        System.out.print("\t+ Nhập tháng sinh: ");int mob = nhapten.nextByte();
        System.out.print("\t+ Nhập năm sinh: "); int yob = nhapten.nextInt();
        System.out.print("\t+ Nhập giới tính: "); String sex = nhapten.next();
        System.out.print("\t+ Nhập chiều cao: "); float hight = nhapten.nextFloat();
        System.out.print("\t+ Nhập quê quán: "); String tp = nhapten.nextLine();
        System.out.print("\t+ Nhập điểm TB: "); float mark = nhapten.nextFloat();

        //ra kết quả
        System.out.println("Danh sách ứng viên");
        System.out.println("\tHọ tên là " + name); System.out.println("\tNgày tháng năm sinh là " + dob +"/"+mob+"/"+yob);
        System.out.println("\tGiới tính là "+sex); System.out.println("\tChiều cao là "+hight);
        System.out.println("\tQuê quán là "+tp); System.out.println("\tMark: "+mark);

    }
}
