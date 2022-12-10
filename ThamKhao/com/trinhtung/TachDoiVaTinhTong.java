package com.trinhtung;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;

public class TachDoiVaTinhTong {
	public static void main(String[] args) {
		try {
			FileInputStream fos = new FileInputStream("DATA.in");
			BufferedInputStream bof = new BufferedInputStream(fos);
			String s = "";
			int c;
			while ((c = bof.read()) != -1) {
				s += String.valueOf((char) c + "");
			}
			while (s.length() > 1) {
				BigInteger b = new BigInteger(dau(s)).add(new BigInteger(cuoi(s)));
				s = b.toString();
				System.out.println(s);
			}
			fos.close();
			bof.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static String dau(String s) {
		return s.substring(0, s.length() / 2);
	}

	static String cuoi(String s) {
		return s.substring(s.length() / 2);
	}
}
