package com.trinhtung;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DanhSachLuuTru {
	public static void main(String[] args) throws IOException {
		ArrayList<Khach1> ds = new ArrayList<>();
		Scanner sc = new Scanner(new File("KHACH.in"));
		int n = Integer.parseInt(sc.nextLine());
		while (n-- > 0) {
			String ten = sc.nextLine();
			String ma = sc.nextLine();
			String den = sc.nextLine();
			String di = sc.nextLine();

			ds.add(new Khach1(ten, ma, den, di));
		}
		Collections.sort(ds);
		for (Khach1 tmp : ds) {
			System.out.println(tmp);
		}
	}
}

class Khach1 implements Comparable<Khach1> {
	static int sId = 1;
	String id;
	String ten;
	String ma;
	String den;
	String di;

	public Khach1(String ten, String ma, String den, String di) {
		super();
		this.ten = ten;
		this.id = "KH" + String.format("%02d", sId++);
		this.ma = ma;
		this.den = den;
		this.di = di;
	}

	Integer getNgay() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Long den = format.parse(this.den).getTime();
		Long di = format.parse(this.di).getTime();
		TimeUnit timeUnit = TimeUnit.DAYS;
		return (int) timeUnit.convert(di - den, timeUnit.MILLISECONDS);
	}

	@Override
	public int compareTo(Khach1 o) {
		try {
			return o.getNgay().compareTo(this.getNgay());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public String toString() {
		try {
			return id + " " + ten + " " + ma + " " + getNgay();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

}