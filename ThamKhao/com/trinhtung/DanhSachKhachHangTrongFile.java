package com.trinhtung;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DanhSachKhachHangTrongFile {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileInputStream("KHACHHANG.in"));
		int t = sc.nextInt();
		sc.nextLine();
		List<Khach> l = new ArrayList<Khach>();
		while (t-- > 0) {
			l.add(new Khach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(l);
		l.forEach(k -> System.out.println(k));
	}
}

class Khach implements Comparable<Khach> {
	static int sId = 1;
	String ma;
	String ten;
	String gioiTinh;
	String ngaySinh;
	String diaChi;

	public Khach(String ten, String gioiTinh, String ngaySinh, String diaChi) {
		super();
		this.ma = "KH" + String.format("%03d", sId++);
		String res = "";
		String[] ss = ten.toLowerCase().trim().split("\\s+");
		for (String sss : ss) {
			res += sss.substring(0, 1).toUpperCase() + sss.substring(1) + " ";
		}
		this.ten = res.trim();
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			this.ngaySinh = format.format(format.parse(ngaySinh));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + gioiTinh + " " + diaChi + " " + ngaySinh;
	}

	@Override
	public int compareTo(Khach k) {
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return format.parse(this.ngaySinh).compareTo(format.parse(k.ngaySinh));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
