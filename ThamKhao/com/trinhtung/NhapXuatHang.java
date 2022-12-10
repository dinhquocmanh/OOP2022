package com.trinhtung;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NhapXuatHang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		Map<String, MatHang> m = new HashMap<String, MatHang>();
		while (t-- > 0) {
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			String xepLoai = sc.nextLine();
			m.put(ma, new MatHang(ma, ten, xepLoai));
		}
		t = sc.nextInt();
		while(t-- > 0) {
			String ma = sc.next();
			int soLuongNhap = sc.nextInt();
			int donGia = sc.nextInt();
			int soLuongXuat = sc.nextInt();
			ThongKe thongKe = new ThongKe(ma, soLuongNhap, donGia, soLuongXuat);
			thongKe.matHang = m.get(ma);
			System.out.println(thongKe);
		}
		sc.close();
	}
}
class MatHang {
	String ma;
	String ten;
	String xepLoai;
	public MatHang(String ma, String ten, String xepLoai) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.xepLoai = xepLoai;
	}
}
class ThongKe {
	String ma;
	int soLuongNhap;
	int donGia;
	int soLuongXuat;
	MatHang matHang;
	public ThongKe(String ma, int soLuongNhap, int donGia, int soLuongXuat) {
		super();
		this.ma = ma;
		this.soLuongNhap = soLuongNhap;
		this.donGia = donGia;
		this.soLuongXuat = soLuongXuat;
	}
	public int getGiaTriXuat() {
		if(matHang.xepLoai.equals("A")) {
			return (int) (donGia * soLuongXuat * 1.08);
		} else if(matHang.xepLoai.equals("B")) {
			return (int) (donGia * soLuongXuat * 1.05);
		}  else {
			return (int) (donGia * soLuongXuat * 1.02);
		}
	}
	@Override
	public String toString() {
		return ma + " " + matHang.ten + " " + (donGia * soLuongNhap) + " " + getGiaTriXuat();
	}
	
}