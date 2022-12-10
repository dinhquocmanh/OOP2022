package com.trinhtung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TinhLuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Map<String, String> m = new HashMap<String, String>();
		List<NhanVien> l = new ArrayList<NhanVien>();
		while (t-- > 0) {
			String ma = sc.next();
			String ten = sc.nextLine();
			m.put(ma, ten);
		}
		t = sc.nextInt();
		while (t-- > 0) {
			sc.nextLine();
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			int luongCoBan = sc.nextInt();
			int soNgayCong = sc.nextInt();
			NhanVien nv = new NhanVien(ma, ten, luongCoBan, soNgayCong);
			nv.phongBan = m.get(nv.maPhongBan);
			l.add(nv);
		}
//		sc.nextLine();
//		String pb = sc.nextLine().trim();
//		System.out.println("Bang luong phong " + m.get(pb) + ":");
//		for(NhanVien nv : l) {
//			if(nv.maPhongBan.equals(pb)) {
//				System.out.println(nv);
//			}
//		}

		for(NhanVien nv : l) {
			nv.phongBan = m.get(nv.ma.substring(3));
			System.out.println(nv);
		}
		sc.close();
	}
}

class PhongBan {
	String ma;
	String ten;

	public PhongBan(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}

}

class NhanVien {
	String ma;
	String ten;
	int luongCoBan;
	int soNgayCong;
	String maLoai;
	String maPhongBan;
	int namCongTac;
	String phongBan;
	public NhanVien(String ma, String ten, int luongCoBan, int soNgayCong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.luongCoBan = luongCoBan;
		this.soNgayCong = soNgayCong;
		this.maLoai = ma.substring(0, 1);
		this.maPhongBan = ma.substring(3);
		this.namCongTac = Integer.valueOf(ma.substring(1, 3));
	}

	public int getHeSoLuong() {
		if (maLoai.equals("A")) {
			if (namCongTac <= 3) {
				return 10;
			} else if (namCongTac <= 8) {
				return 12;
			} else if (namCongTac <= 15) {
				return 14;
			} else {
				return 20;
			}
		} else if (maLoai.equals("B")) {
			if (namCongTac <= 3) {
				return 10;
			} else if (namCongTac <= 8) {
				return 11;
			} else if (namCongTac <= 15) {
				return 13;
			} else {
				return 16;
			}
		} else if (maLoai.equals("C")) {
			if (namCongTac <= 3) {
				return 9;
			} else if (namCongTac <= 8) {
				return 10;
			} else if (namCongTac <= 15) {
				return 12;
			} else {
				return 14;
			}
		} else {
			if (namCongTac <= 3) {
				return 8;
			} else if (namCongTac <= 8) {
				return 9;
			} else if (namCongTac <= 15) {
				return 11;
			} else {
				return 13;
			}
		}
	}
	public int getLuong() {
		return luongCoBan * soNgayCong * getHeSoLuong() * 1000;
	}
	@Override
	public String toString() {
		return ma + " " + ten + " " + phongBan + " " + getLuong();
	}
}