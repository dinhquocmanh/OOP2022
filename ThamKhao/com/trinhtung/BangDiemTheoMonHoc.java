package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BangDiemTheoMonHoc {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("SINHVIEN.in"));
		Map<String, SinhVien6> mapSV = new HashMap<String, SinhVien6>();
		Map<String, MonHoc3> mapMH = new HashMap<String, MonHoc3>();
		List<String> mh = new ArrayList<String>();
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String ma = sc.nextLine();
			String ten = name(sc.nextLine());
			String lop = sc.nextLine();
			String email = sc.nextLine();
			mapSV.put(ma, new SinhVien6(ma, ten, lop, email));
		}

		sc = new Scanner(new FileInputStream("MONHOC.in"));
		t = sc.nextInt();
		while (t-- > 0) {
			sc.nextLine();
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			int tin = sc.nextInt();
			mapMH.put(ma, new MonHoc3(ma, ten, tin));
			mh.add(ma);
		}
		mh.sort((m1, m2) -> m1.compareTo(m2));

		sc = new Scanner(new FileInputStream("BANGDIEM.in"));
		t = sc.nextInt();
		List<BangDiem1> l = new ArrayList<BangDiem1>();
		while (t-- > 0) {
			String msv = sc.next();
			String mmh = sc.next();
			Float diem = sc.nextFloat();
			l.add(new BangDiem1(mapSV.get(msv), mapMH.get(mmh), diem));
		}
		l.sort((bd1, bd2) -> bd1.diem.compareTo(bd2.diem) == 0 ? bd1.sv.ma.compareTo(bd2.sv.ma)
				: bd2.diem.compareTo(bd1.diem));

		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String ma = sc.nextLine();
			System.out.println("BANG DIEM MON " + mapMH.get(ma).ten + ":");
			for (BangDiem1 b : l) {
				if (b.mh.ma.equals(ma)) {
					System.out.println(b);
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

class SinhVien6 {
	String ma;
	String ten;
	String lop;
	String email;

	public SinhVien6(String ma, String ten, String lop, String email) {
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

class MonHoc3 {
	String ma;
	String ten;
	int tin;

	public MonHoc3(String ma, String ten, int tin) {
		this.ma = ma;
		this.ten = ten;
		this.tin = tin;
	}

}

class BangDiem1 {
	SinhVien6 sv;
	MonHoc3 mh;
	Float diem;

	public BangDiem1(SinhVien6 sv, MonHoc3 mh, Float diem) {
		super();
		this.sv = sv;
		this.mh = mh;
		this.diem = diem;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sv.ma + " " + sv.ten + " " + sv.lop + " " + String.valueOf(diem).replaceAll("\\.?0*$", "");
	}
}
