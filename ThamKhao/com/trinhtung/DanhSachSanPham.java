package com.trinhtung;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSanPham {
	public static void main(String[] args) throws IOException {
		ArrayList<SanPham1> ds = new ArrayList<>();
		Scanner sc = new Scanner(new File("SANPHAM.in"));
		int n = Integer.parseInt(sc.nextLine());
		while (n-- > 0) {
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			Integer giaBan = Integer.parseInt(sc.nextLine());
			Integer baoHanh = Integer.parseInt(sc.nextLine());

			ds.add(new SanPham1(ma, ten, giaBan, baoHanh));
		}
		Collections.sort(ds);
		for (SanPham1 tmp : ds) {
			System.out.println(tmp);
		}
	}
}

class SanPham1 implements Comparable<SanPham1> {
	String ma;
	String ten;
	Integer giaBan;
	Integer baoHanh;

	public SanPham1(String ma, String ten, Integer giaBan, Integer baoHanh) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.giaBan = giaBan;
		this.baoHanh = baoHanh;
	}

	@Override
	public int compareTo(SanPham1 o) {
		int temp = o.giaBan.compareTo(this.giaBan);
		return temp == 0 ? this.ma.compareTo(o.ma) : temp;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + giaBan + " " + baoHanh;
	}

}