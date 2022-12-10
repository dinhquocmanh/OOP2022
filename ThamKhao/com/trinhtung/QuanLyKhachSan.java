package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuanLyKhachSan {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("DATA.in"));
		List<Phong> phongs = new ArrayList<Phong>();
		List<KhachHang1> khachHangs = new ArrayList<KhachHang1>();
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			phongs.add(new Phong(sc.nextLine()));
		}
		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			khachHangs.add(new KhachHang1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		khachHangs.sort((k1, k2) -> {
			return k2.getNgay().compareTo(k1.getNgay());
		});
		for (KhachHang1 khachHang : khachHangs) {
			float tienPhaiTra = 0;
			for (Phong phong : phongs) {
				if (khachHang.getMaPhong().equals(phong.kyHieu)) {
					if (khachHang.getNgay() == 0) {
						tienPhaiTra = phong.donGia * (phong.phiPhucVu + 1);
					} else {
						tienPhaiTra = khachHang.getNgay() * phong.donGia * (phong.phiPhucVu + 1);
					}
					break;
				}
			}
			if (khachHang.getNgay() < 10) {

			} else if (khachHang.getNgay() < 20) {
				tienPhaiTra -= tienPhaiTra * 2 / 100;
			} else if (khachHang.getNgay() <= 30) {
				tienPhaiTra -= tienPhaiTra * 4 / 100;
			} else {
				tienPhaiTra -= tienPhaiTra * 6 / 100;
			}
			System.out.println(khachHang + " " + String.format("%.2f", tienPhaiTra));
		}
		sc.close();
	}
}

class Phong {
	String kyHieu;
	String ten;
	Integer donGia;
	Float phiPhucVu;

	public Phong(String s) {
		String[] ss = s.trim().split("\\s+");
		this.kyHieu = ss[0];
		this.ten = ss[1];
		this.donGia = Integer.parseInt(ss[2]);
		this.phiPhucVu = Float.parseFloat(ss[3]);
	}
}

class KhachHang1 {
	static int sId = 1;
	String ma;
	String ten;
	String maPhong;
	String den;
	String di;

	public KhachHang1(String ten, String maPhong, String den, String di) {
		this.ma = "KH" + String.format("%02d", sId++);
		this.ten = ten;
		this.maPhong = maPhong;
		this.den = den;
		this.di = di;
	}

	public Integer getNgay() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Long den = 0l;
		Long di = 0l;
		try {
			den = format.parse(this.den).getTime();
			di = format.parse(this.di).getTime();
		} catch (ParseException e) {

		}
		TimeUnit timeUnit = TimeUnit.DAYS;
		return (int) timeUnit.convert(di - den, timeUnit.MILLISECONDS);
	}

	public String getMaPhong() {
		return String.valueOf(maPhong.charAt(2));
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + maPhong + " " + getNgay();
	}

}