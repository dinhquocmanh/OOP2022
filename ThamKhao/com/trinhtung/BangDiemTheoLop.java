package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BangDiemTheoLop {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("SINHVIEN.in"));
		Map<String, SinhVien5> mapSV = new HashMap<String, SinhVien5>();
		Map<String, MonHoc2> mapMH = new HashMap<String, MonHoc2>();
		List<String> mh = new ArrayList<String>();
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String ma = sc.nextLine();
			String ten = name(sc.nextLine());
			String lop = sc.nextLine();
			String email = sc.nextLine();
			mapSV.put(ma, new SinhVien5(ma, ten, lop, email));
		}

		sc = new Scanner(new FileInputStream("MONHOC.in"));
		t = sc.nextInt();
		while (t-- > 0) {
			sc.nextLine();
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			int tin = sc.nextInt();
			mapMH.put(ma, new MonHoc2(ma, ten, tin));
			mh.add(ma);
		}
		mh.sort((m1, m2) -> m1.compareTo(m2));

		sc = new Scanner(new FileInputStream("BANGDIEM.in"));
		t = sc.nextInt();
		List<BangDiem> l = new ArrayList<BangDiem>();
		while (t-- > 0) {
			String msv = sc.next();
			String mmh = sc.next();
			String diem = sc.next();
			l.add(new BangDiem(mapSV.get(msv), mapMH.get(mmh), diem));
		}
		l.sort((bd1, bd2) -> bd1.sv.ma.compareTo(bd2.sv.ma));

		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String ma = sc.nextLine();
			System.out.println("BANG DIEM lop " + ma + ":");
			for (String mmh : mh) {
				for (BangDiem b : l) {
					if (ma.equals(b.sv.lop)) {
						if (b.mh.ma.equals(mmh)) {
							System.out.println(b);
						}
					}
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

class SinhVien5 {
	String ma;
	String ten;
	String lop;
	String email;

	public SinhVien5(String ma, String ten, String lop, String email) {
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

class MonHoc2 {
	String ma;
	String ten;
	int tin;

	public MonHoc2(String ma, String ten, int tin) {
		this.ma = ma;
		this.ten = ten;
		this.tin = tin;
	}

}

class BangDiem {
	SinhVien5 sv;
	MonHoc2 mh;
	String diem;

	public BangDiem(SinhVien5 sv, MonHoc2 mh, String diem) {
		super();
		this.sv = sv;
		this.mh = mh;
		this.diem = diem;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sv.ma + " " + sv.ten + " " + mh.ma + " " + mh.ten + " " + diem;
	}
}
