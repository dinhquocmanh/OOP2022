package com.trinhtung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LopHocPhan1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		List<Lop> list = new ArrayList<Lop>();
		while (t-- > 0) {
			Lop l = new Lop(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			list.add(l);
		}
		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s = sc.nextLine();
			System.out.println("Danh sach cho giang vien " + s + ":");
			list.stream().filter(l -> l.giangVien.toLowerCase().equals(s.toLowerCase())).sorted(
					(l1, l2) -> l1.ma.compareTo(l2.ma) == 0 ? l1.nhom.compareTo(l2.nhom) : l1.ma.compareTo(l2.ma))
					.forEach(l -> System.out.println(l));
		}
		sc.close();
	}
}

class Lop {
	String ma, ten, nhom, giangVien;

	public Lop(String ma, String ten, String nhom, String giangVien) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.nhom = nhom;
		this.giangVien = giangVien;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + nhom;
	}
}