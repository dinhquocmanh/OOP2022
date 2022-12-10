package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuanHoaDanhSachSinhVien {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner sc = new Scanner(new FileInputStream("SINHVIEN.in"));
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		List<SinhVien3> list = new ArrayList<SinhVien3>();
		int index = 1;
		int t = sc.nextInt();
		while (t-- > 0) {
			sc.nextLine();
			String name = sc.nextLine();
			String clazz = sc.nextLine();
			String dob = format.format(format.parse(sc.nextLine()));
			float gpa = sc.nextFloat();
			SinhVien3 sv2 = new SinhVien3();
			sv2.setName(name);
			sv2.setClazz(clazz);
			sv2.setDob(dob);
			sv2.setGpa(gpa);
			sv2.setMsv("B20DCCN" + String.format("%03d", index++));
			list.add(sv2);
		}
		for (SinhVien3 sv : list) {
			sv.Xuat();
		}
	}
}

class SinhVien3 {
	private String msv;
	private String name;
	private String clazz;
	private String dob;
	private Float gpa;

	public SinhVien3() {
		this.name = "";
		this.msv = "";
		this.clazz = "";
		this.dob = "";
		this.gpa = 0f;
	}

	public String getMsv() {
		return msv;
	}

	public void setMsv(String msv) {
		this.msv = msv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
		n = n.trim();
		this.name = n;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public String getStringGpa() {
		String res = String.format("%.2f", this.gpa);
		res = res.replace(",", ".");
		return res;
	}

	public void Xuat() {
		System.out.println(this.msv + " " + this.name + " " + this.clazz + " " + this.dob + " " + this.getStringGpa());

	}
}