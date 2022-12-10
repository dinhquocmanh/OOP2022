package com.trinhtung;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TinhNgayHetHanBaoHanh {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("MUAHANG.in"));
		List<SanPham2> sanPhams = new ArrayList<>();
		List<KhachHang> khachHangs = new ArrayList<>();
		List<HoaDon3> hoaDons = new ArrayList<>();
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			sanPhams.add(new SanPham2(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
					Integer.parseInt(sc.nextLine())));
		}
		t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			khachHangs.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
					sc.nextLine()));
		}
		for (KhachHang khachHang : khachHangs) {
			for (SanPham2 sanPham : sanPhams) {
				int gia = 0;
				String date = "";
				if (khachHang.getMa().equals(sanPham.getId())) {
					String dates[] = khachHang.getNgay().split("/");
					gia = khachHang.soLuong * sanPham.getGia();
					int x = Integer.parseInt(dates[1]) + sanPham.getBaoHanh();
					int temp = x / 12 + Integer.parseInt(dates[2]);
					x = x % 12;
					date = date + dates[0] + "/" + String.format("%02d", x) + "/" + String.format("%04d", temp);
					hoaDons.add(new HoaDon3(khachHang.toString(), date, gia));
					break;
				}
			}
		}
		hoaDons.sort((k1, k2) -> {
			return k1.getDate().compareTo(k2.getDate()) == 0 ? k1.getMa().compareTo(k2.getMa())
					: k1.getDate().compareTo(k2.getDate());
		});
		hoaDons.forEach(k -> System.out.println(k));
		sc.close();
	}
}

class SanPham2 {
	String ma;
	String ten;
	int gia;
	int baoHanh;

	public SanPham2(String ma, String ten, int gia, int baoHanh) {
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
		this.baoHanh = baoHanh;
	}

	public String getId() {
		return ma;
	}

	public int getGia() {
		return gia;
	}

	public int getBaoHanh() {
		return baoHanh;
	}

}

class HoaDon3 {
	String sanPham;
	Date date;
	int gia;

	public HoaDon3(String sanPham, String date, int gia) throws ParseException {
		this.sanPham = sanPham;
		this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		this.gia = gia;
	}

	public Date getDate() {
		return date;
	}

	public String getMa() {
		String[] s = sanPham.split("\\s+");
		return s[0];
	}

	@Override
	public String toString() {
		return sanPham + " " + gia + " " + new SimpleDateFormat("dd/MM/yyyy").format(date);
	}

}

class KhachHang {
	static int sId = 1;
	String id;
	String ten;
	String diaChi;
	String ma;
	String ngay;
	int soLuong;

	public KhachHang(String ten, String diaChi, String ma, int soLuong, String ngay) {
		this.id = "KH" + String.format("%02d", sId++);
		this.ten = ten;
		this.diaChi = diaChi;
		this.ma = ma;
		this.ngay = ngay;
		this.soLuong = soLuong;
	}

	public String getNgay() {
		return ngay;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public String getMa() {
		return ma;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + " " + ten + " " + diaChi + " " + ma;
	}

}