package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HoaDon2 {
	public static void main(String[] args)  throws FileNotFoundException {
		Scanner sc1 = new Scanner(new FileInputStream("KH.in"));
		Scanner sc2 = new Scanner(new FileInputStream("MH.in"));
		Scanner sc3 = new Scanner(new FileInputStream("HD.in"));
		Map<String, KH> mapKhachHang = new HashMap<String, KH>();
		Map<String, MH> mapMatHang = new HashMap<String, MH>();
		int n = sc1.nextInt();
		sc1.nextLine();
		while (n-- > 0) {
			String ma = "KH" + String.format("%03d", KH.sId++);
			String ten = sc1.nextLine();
			String gioiTinh = sc1.nextLine();
			String ngaySinh = sc1.nextLine();
			String diaChi = sc1.nextLine();
			mapKhachHang.put(ma, new KH(ma, ten, gioiTinh, ngaySinh, diaChi));
		}
		int m = sc2.nextInt();
		while (m-- > 0) {
			sc2.nextLine();
			String ma = "MH" + String.format("%03d", MH.sId++);
			String ten = sc2.nextLine();
			String donViTinh = sc2.nextLine();
			int giaMua = sc2.nextInt();
			int giaBan = sc2.nextInt();
			mapMatHang.put(ma, new MH(ma, ten, donViTinh, giaMua, giaBan));
		}
		int k = sc3.nextInt();
		while (k-- > 0) {
			String ma = "HD" + String.format("%03d", HD.sId++);
			String maKhachHang = sc3.next();
			String maMatHang = sc3.next();
			int soLuong = sc3.nextInt();
			KH khachHang = mapKhachHang.get(maKhachHang);
			MH matHang = mapMatHang.get(maMatHang);
			StringBuilder sb = new StringBuilder(ma + " ");
			sb.append(khachHang.getTen() + " ").append(khachHang.getDiaChi() + " ").append(matHang.getTen() + " ")
					.append(matHang.getDonViTinh() + " ").append(matHang.getGiaMua() + " ")
					.append(matHang.getGiaBan() + " ").append(soLuong + " ").append(matHang.getGiaBan() * soLuong);
			System.out.println(sb.toString());
		}
	}
}

class KH {
	public static int sId = 1;
	String ma;
	String ten;
	String gioiTinh;
	String ngaySinh;
	String diaChi;

	public KH(String ma, String ten, String gioiTinh, String ngaySinh, String diaChi) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public static int getsId() {
		return sId;
	}

	public String getMa() {
		return ma;
	}

	public String getTen() {
		return ten;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

}

class MH {
	public static int sId = 1;
	String ma;
	String ten;
	String donViTinh;
	int giaMua;
	int giaBan;

	public MH(String ma, String ten, String donViTinh, int giaMua, int giaBan) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.donViTinh = donViTinh;
		this.giaMua = giaMua;
		this.giaBan = giaBan;
	}

	public static int getsId() {
		return sId;
	}

	public String getMa() {
		return ma;
	}

	public String getTen() {
		return ten;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public int getGiaMua() {
		return giaMua;
	}

	public int getGiaBan() {
		return giaBan;
	}

}

class HD {
	public static int sId = 1;
	String ma;
	String maKhachHang;
	String maMatHang;
	int soLuong;

	public HD(String ma, String maKhachHang, String maMatHang, int soLuong) {
		super();
		this.ma = ma;
		this.maKhachHang = maKhachHang;
		this.maMatHang = maMatHang;
		this.soLuong = soLuong;
	}

}