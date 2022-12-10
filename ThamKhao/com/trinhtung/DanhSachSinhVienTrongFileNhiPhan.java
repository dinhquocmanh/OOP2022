
package com.trinhtung;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DanhSachSinhVienTrongFileNhiPhan {
	public static void main(String[] args) throws Exception {
		File file = new File("SV.in");
		if (!file.exists()) {
			file.createNewFile();
		}
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
		ArrayList<SinhVien> ds = (ArrayList<SinhVien>) ois.readObject();
		for (SinhVien s : ds) {
			System.out.println(s);
		}
		ois.close();
	}
}

class SinhVien implements Serializable {
	private String ma, ten, lop;
	private Date ngaysinh;
	private float gpa;

	public SinhVien(int id, String name, String lop, String dob, float gpa) throws ParseException {
		this.ma = "B20DCCN" + String.format("%03d", id);
		this.ten = name;
		this.lop = lop;
		this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " "
				+ String.format("%.2f", gpa);
	}
}
