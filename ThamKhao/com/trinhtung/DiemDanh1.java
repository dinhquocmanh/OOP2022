package com.trinhtung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DiemDanh1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		Map<String, SinhVien1> m = new HashMap<String, SinhVien1>();
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < t; i++) {
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			String lop = sc.nextLine();
			m.put(ma, new SinhVien1(ma, ten, lop));
			l.add(ma);
		}
		for (int i = 0; i < t; i++) {
			String ma = sc.next();
			String diemDanh = sc.next();
			SinhVien1 s = m.get(ma);
			s.diemDanh = diemDanh;
		}
		sc.nextLine();
		String lop = sc.nextLine();
		for (String s : l) {
			if(m.get(s).lop.equals(lop)) {
				System.out.println(m.get(s));
			}
		}
		sc.close();
	}
}

class SinhVien1 {
	String ma;
	String ten;
	String lop;
	String diemChuyenCan;
	String ghiChu;
	String diemDanh;

	public SinhVien1(String ma, String ten, String lop) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.ghiChu = "";
	}

	public int xuLyChuyenCan() {
		int v = (int) diemDanh.codePoints().filter(c -> c == 'v').count();
		int m = (int) diemDanh.codePoints().filter(c -> c == 'm').count();
		int diem = 10 - 2 * v - m;
		int res = (diem < 0) ? 0 : diem;
		if (res == 0) {
			ghiChu = "KDDK";
		}
		return res;
	}

	@Override
	public String toString() {
		return (ma + " " + ten + " " + lop + " " + xuLyChuyenCan() + " " + ghiChu).trim();
	}
}
