package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachSinhVien {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("SINHVIEN.in"));
		int t = sc.nextInt();
		List<SinhVien4> l = new ArrayList<SinhVien4>();
		sc.nextLine();
		while (t-- > 0) {
			String ma = sc.nextLine();
			String ten = name(sc.nextLine());
			String lop = sc.nextLine();
			String email = sc.nextLine();
			l.add(new SinhVien4(ma, ten, lop, email));
		}
		l.sort((s1, s2) -> s1.ma.compareTo(s2.ma));
		l.forEach(System.out::println);

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

class SinhVien4 {
	String ma;
	String ten;
	String lop;
	String email;

	public SinhVien4(String ma, String ten, String lop, String email) {
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
