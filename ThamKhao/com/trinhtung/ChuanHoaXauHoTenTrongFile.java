package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChuanHoaXauHoTenTrongFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("DATA.in"));
		while (true) {
			String s = sc.nextLine();
			if (s.equals("END")) {
				break;
			}
			System.out.println(res(s));
		}
		sc.close();
	}

	static String res(String s) {
		String res = "";
		String[] ss = s.toLowerCase().trim().split("\\s+");
		for (String sss : ss) {
			res += sss.substring(0, 1).toUpperCase() + sss.substring(1) + " ";
		}
		return res.trim();
	}
}
