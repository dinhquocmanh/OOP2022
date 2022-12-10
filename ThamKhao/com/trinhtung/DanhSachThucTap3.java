package com.trinhtung;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DanhSachThucTap3 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileInputStream("SINHVIEN.in"));
		Map<String, DoanhNghiep1> mapDN = new HashMap<String, DoanhNghiep1>();
		Map<String, SinhVien7> mapSV = new HashMap<String, SinhVien7>();
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String ma = sc.nextLine();
			String ten = name(sc.nextLine());
			String lop = sc.nextLine();
			String email = sc.nextLine();
			mapSV.put(ma, new SinhVien7(ma, ten, lop, email));
		}

		sc = new Scanner(new FileInputStream("DN.in"));
		t = sc.nextInt();
		while (t-- > 0) {
			sc.nextLine();
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			Integer soLuong = sc.nextInt();
			mapDN.put(ma, new DoanhNghiep1(ma, ten, soLuong));
		}

		List<ThucTap> l = new ArrayList<ThucTap>();
		sc = new Scanner(new FileInputStream("THUCTAP.in"));
		t = sc.nextInt();
		while (t-- > 0) {
			String msv = sc.next();
			String mdn = sc.next();
			l.add(new ThucTap(mapSV.get(msv), mapDN.get(mdn)));
		}
		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String ma = sc.nextLine();
			System.out.println("DANH SACH THUC TAP TAI " + mapDN.get(ma).ten + ":");
			List<ThucTap> thucTaps = new ArrayList<ThucTap>();
			for (ThucTap tt : l) {
				if (tt.dn.ma.equals(ma)) {
					thucTaps.add(tt);
				}
			}
			thucTaps.sort((tt1, tt2) -> tt1.sv.ma.compareTo(tt2.sv.ma));
			for (int i = 0; i < thucTaps.size(); i++) {
				System.out.println(thucTaps.get(i));
				if (i == mapDN.get(ma).soLuong - 1) {
					break;
				}
			}

		}
		sc.close();
	}

	static String name(String name) {
		String n = name.trim().toLowerCase();
		n = n.trim();
		String[] arr = n.split(" ");
		n = "";
		for (String a : arr) {
			if (!a.isEmpty()) {
				n += String.valueOf(a.charAt(0)).toUpperCase() + a.substring(1, a.length());
				n += " ";
			}
		}
		return n.trim();
	}
}

class DoanhNghiep1 {
	String ma;
	String ten;
	Integer soLuong;

	public DoanhNghiep1(String ma, String ten, Integer soLuong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.soLuong = soLuong;
	}

	public String getMa() {
		return ma;
	}

	public String getTen() {
		return ten;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + soLuong;
	}
}

class SinhVien7 {
	String ma;
	String ten;
	String lop;
	String email;

	public SinhVien7(String ma, String ten, String lop, String email) {
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + email;
	}
}

class ThucTap {
	SinhVien7 sv;
	DoanhNghiep1 dn;

	public ThucTap(SinhVien7 sv, DoanhNghiep1 dn) {
		super();
		this.sv = sv;
		this.dn = dn;
	}

	@Override
	public String toString() {
		return sv.ma + " " + sv.ten + " " + sv.lop;
	}
}