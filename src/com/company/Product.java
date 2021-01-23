package com.company;

public class Product {
    private String tensanpham;
    private int soluong;
    private int giaban;
    private int tongtien;

    public Product(String tensanpham, int soluong, int giaban) {
        this.tensanpham = tensanpham;
        this.soluong = soluong;
        this.giaban = giaban;
        this.tongtien = soluong*giaban;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int soluong, int giaban) {
        this.tongtien = soluong*giaban;
    }

    public void print(int i){
        System.out.println((i+1)+": "+tensanpham+" ; số lượng: "+soluong
        +" ; đơn giá: "+giaban+" ; tổng tiền: "+(soluong*giaban));
    }
}
