package com.trinhtung;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuanLyBaiTapNhom {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		Map<String, SV> sv = new HashMap<String, SV>();
		Map<Integer, BT> bt = new HashMap<Integer, BT>();
		int t = sc.nextInt();
		int n = t;
		sc.nextLine();
		while (t-- > 0) {
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			String sdt = sc.nextLine();
			sv.put(ma, new SV(ma, ten, sdt));
		}

		sc = new Scanner(new File("BAITAP.in"));
		t = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= t; i++) {
			String ten = sc.nextLine();
			bt.put(i, new BT(ten, i));
		}
		sc = new Scanner(new File("NHOM.in"));
		List<N> l = new ArrayList<N>();
		while (n-- > 0) {
			String msv = sc.next();
			int mbt = sc.nextInt();
			l.add(new N(sv.get(msv), bt.get(mbt)));
		}
		Collections.sort(l);
		l.forEach(nh -> System.out.println(nh));
	}
}

class SV {
	String ma;
	String ten;
	String sdt;

	public SV(String ma, String ten, String sdt) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.sdt = sdt;
	}

}

class BT {
	String ten;
	int stt;

	public BT(String ten, int stt) {
		super();
		this.ten = ten;
		this.stt = stt;
	}

}

class N implements Comparable<N> {
	SV sv;
	BT bt;

	public N(SV sv, BT bt) {
		super();
		this.sv = sv;
		this.bt = bt;
	}

	@Override
	public String toString() {
		return sv.ma + " " + sv.ten + " " + sv.sdt + " " + bt.stt + " " + bt.ten;
	}

	@Override
	public int compareTo(N o) {

		return this.sv.ma.compareTo(o.sv.ma);
	}
}