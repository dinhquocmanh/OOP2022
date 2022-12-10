package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachMonHoc {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("MONHOC.in"));
		int t = sc.nextInt();
		List<MonHoc1> l = new ArrayList<MonHoc1>();
		while (t-- > 0) {
			sc.nextLine();
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			int tin = sc.nextInt();
			l.add(new MonHoc1(ma, ten, tin));
		}
		l.sort((s1, s2) -> s1.ten.compareTo(s2.ten));
		l.forEach(System.out::println);

		sc.close();
	}
}

class MonHoc1 {
	String ma;
	String ten;
	int tin;

	public MonHoc1(String ma, String ten, int tin) {
		this.ma = ma;
		this.tin = tin;
		this.ten = ten;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + tin;
	}
}
