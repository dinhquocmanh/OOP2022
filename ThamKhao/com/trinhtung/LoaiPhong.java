package com.trinhtung;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LoaiPhong implements Comparable<LoaiPhong> {
	String kyHieu;
	String loai;
	Integer donGia;
	Float phi;

	public LoaiPhong(String nextLine) {
		String[] s = nextLine.split("\\s+");
		kyHieu = s[0];
		loai = s[1];
		donGia = Integer.valueOf(s[2]);
		phi = Float.valueOf(s[3]);
	}

	@Override
	public String toString() {
		return kyHieu + " " + loai + " " + donGia + " " + phi;
	}

	public static void main(String[] args) throws IOException {
		ArrayList<LoaiPhong> ds = new ArrayList<>();
		Scanner in = new Scanner(new File("PHONG.in"));
		int n = Integer.parseInt(in.nextLine());
		while (n-- > 0) {
			ds.add(new LoaiPhong(in.nextLine()));
		}
		Collections.sort(ds);
		for (LoaiPhong tmp : ds) {
			System.out.println(tmp);
		}
	}

	@Override
	public int compareTo(LoaiPhong o) {
		return this.loai.compareTo(o.loai);
	}
}
