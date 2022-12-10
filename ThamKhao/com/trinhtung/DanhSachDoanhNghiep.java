package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachDoanhNghiep {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("DN.in"));
		int t = sc.nextInt();
		List<DoanhNghiep> l = new ArrayList<DoanhNghiep>();
		while (t-- > 0) {
			sc.nextLine();
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			int tin = sc.nextInt();
			l.add(new DoanhNghiep(ma, ten, tin));
		}
		l.sort((s1, s2) -> s1.ma.compareTo(s2.ma));
		l.forEach(System.out::println);

		sc.close();
	}
}

class DoanhNghiep {
	String ma;
	String ten;
	int tin;

	public DoanhNghiep(String ma, String ten, int tin) {
		this.ma = ma;
		this.tin = tin;
		this.ten = ten;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + tin;
	}
}
