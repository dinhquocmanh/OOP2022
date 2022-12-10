package com.trinhtung;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TinhGioChuan {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		Map<String, Float> m = new HashMap<String, Float>();
		Map<String, String> maGV = new HashMap<String, String>();
		List<String> list = new ArrayList<String>();
		Map<String, String> maMH = new HashMap<String, String>();
		int t = sc.nextInt();
		while (t-- > 0) {
			String ma = sc.next().trim();
			String ten = sc.nextLine().trim();
			maMH.put(ma, ten);
		}
		sc = new Scanner(new File("GIANGVIEN.in"));
		t = sc.nextInt();
		while (t-- > 0) {
			String ma = sc.next().trim();
			String ten = sc.nextLine().trim();
			maGV.put(ma, ten);
			list.add(ma);
		}
		sc = new Scanner(new File("GIOCHUAN.in"));
		t = sc.nextInt();
		while (t-- > 0) {
			String maGiangVien = sc.next().trim();
			sc.next().trim();
			float gioChuan = sc.nextFloat();
			if (!m.containsKey(maGiangVien)) {
				m.put(maGiangVien, gioChuan);
			} else {
				m.put(maGiangVien, gioChuan + m.get(maGiangVien));
			}
		}
		for (String s : list) {
			System.out.println(maGV.get(s) + " " + String.format("%.2f", m.get(s)));
		}
		sc.close();
	}
}

class GV {
	String ma;
	String ten;

	public GV(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
}

class LHP {
	String maGiangVien;
	String maMon;
	float gioChuan;

	public LHP(String maGiangVien, String maMon, float gioChuan) {
		super();
		this.maGiangVien = maGiangVien;
		this.maMon = maMon;
		this.gioChuan = gioChuan;
	}

}

class GC {
	String ma;
	String ten;

	public GC(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}

}