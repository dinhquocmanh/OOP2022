package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DanhSachSinhVienTrongFileVanBan {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileInputStream("SV.in"));
			int t = sc.nextInt();
			SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
			int index = 1;
			while (t-- > 0) {
				sc.nextLine();
				String name = sc.nextLine();
				String clazz = sc.nextLine();
				String dob = format.format(format.parse(sc.nextLine()));
				float gpa = sc.nextFloat();
				SinhVien2 sv1 = new SinhVien2();
				sv1.setMsv("B20DCCN" + String.format("%03d", index));
				index++;
				sv1.setName(name);
				sv1.setClazz(clazz);
				sv1.setDate(dob);
				sv1.setPoint(gpa);
				sv1.Xuat();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class SinhVien2 {
	String name;
	String date;
	String clazz;
	String msv;
	float point;

	public SinhVien2() {
		super();
		this.name = "";
		this.date = "";
		this.clazz = "";
		this.msv = "";
		this.point = 0;
	}

	public String getPoint() {
		String result = String.format("%.2f", this.point);
		result = result.replace(",", ".");
		return result;
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
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public void Xuat() {
		System.out.println(this.msv + " " + this.name + " " + this.clazz + " " + this.date + " " + this.getPoint());
	}
}
