package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HoaDon1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("DATA1.in"));
		long t = sc.nextInt();
		Map<String, SanPham> m = new HashMap<String, SanPham>();
		while (t-- > 0) {
			sc.nextLine();
			String ma = sc.nextLine();
			String ten = sc.nextLine();
			long gia1 = sc.nextInt();
			long gia2 = sc.nextInt();
			m.put(ma, new SanPham(ma, ten, gia1, gia2));
		}
		Scanner sc1 = new Scanner(new FileInputStream("DATA2.in"));
		t = sc1.nextInt();
		List<HoaDon> l = new ArrayList<HoaDon>();
		while (t-- > 0) {
			String ma = sc1.next();
			long soLuong = sc1.nextInt();
			HoaDon hoaDon = new HoaDon(ma, m.get(ma.substring(0, 2)), soLuong);
			l.add(hoaDon);
		}
		l.forEach(hd -> System.out.println(hd));
	}
}

class HoaDon {
	static long sId = 1;
	SanPham sanPham;
	long soLuong;
	String maSanPham;
	String ma;

	public HoaDon(String maSanPham, SanPham sanPham, long soLuong) {
		super();
		this.maSanPham = maSanPham;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.ma = maSanPham + "-" + String.format("%03d", sId++);
	}

	public long getGiaTien() {
		String loai = maSanPham.substring(2);
		if (loai.equals("1")) {
			return sanPham.getGia1();
		} else {
			return sanPham.getGia2();
		}
	}

	public long getGiamGia() {
		if (soLuong >= 150) {
			return Math.round(soLuong * getGiaTien() * 50.0 / 100);
		} else if (soLuong >= 100) {
			return Math.round(soLuong * getGiaTien() * 30.0 / 100);
		} else if (soLuong >= 50) {
			return Math.round(soLuong * getGiaTien() * 15.0 / 100);
		}
		return 0;
	}

	public long getThanhTien() {
		return soLuong * getGiaTien() - getGiamGia();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ma + " " + sanPham.getTen() + " " + getGiamGia() + " " + getThanhTien();
	}

}

class SanPham {
	String ma;
	String ten;
	long gia1;
	long gia2;

	public SanPham(String ma, String ten, long gia1, long gia2) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia1 = gia1;
		this.gia2 = gia2;
	}

	public String getMa() {
		return ma;
	}

	public String getTen() {
		return ten;
	}

	public long getGia1() {
		return gia1;
	}

	public long getGia2() {
		return gia2;
	}

}
