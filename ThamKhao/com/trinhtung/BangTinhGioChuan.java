package com.trinhtung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BangTinhGioChuan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Map<String, Float> m = new HashMap<String, Float>();
		Map<String, String> mmh = new HashMap<String, String>();
		Map<String, String> mgv = new HashMap<String, String>();
		List<String> l = new ArrayList<String>();
		List<LopHocPhan> lopHocPhans = new ArrayList<LopHocPhan>();
		while (t-- > 0) {
			String ma = sc.next().trim();
			String ten = sc.nextLine().trim();
			mmh.put(ma, ten);
		}
		t = sc.nextInt();
		while(t-- > 0) {
			String ma = sc.next().trim();
			String ten = sc.nextLine().trim();
			mgv.put(ma, ten);
			l.add(ma);
		}
		t = sc.nextInt();
		while(t-- > 0) {
			String maGiangVien = sc.next().trim();
			String maMon = sc.next().trim();
			float gioChuan = sc.nextFloat();
			lopHocPhans.add(new LopHocPhan(maGiangVien, maMon, gioChuan));
			if(!m.containsKey(maGiangVien)) {
				m.put(maGiangVien, gioChuan);
			} else {
				m.put(maGiangVien, gioChuan + m.get(maGiangVien));
			}
		}
		String ma = sc.next().trim();
		System.out.println("Giang vien: " + mgv.get(ma));
		for(LopHocPhan lhp : lopHocPhans) {
			if(lhp.maGiangVien.equals(ma)) {
				System.out.println(mmh.get(lhp.maMon) + " " + lhp.gioChuan);
			}
		}
		System.out.println("Tong: " + String.format("%.2f", m.get(ma)));
		sc.close();
	}
}
class MonHoc {
	String ma;
	String ten;
	public MonHoc(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	
}
class GiangVien {
	String ma;
	String ten;
	public GiangVien(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
}
class LopHocPhan {
	String maGiangVien;
	String maMon;
	float gioChuan;
	public LopHocPhan(String maGiangVien, String maMon, float gioChuan) {
		super();
		this.maGiangVien = maGiangVien;
		this.maMon = maMon;
		this.gioChuan = gioChuan;
	}
	
}
