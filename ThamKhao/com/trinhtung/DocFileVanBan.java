package com.trinhtung;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DocFileVanBan {
	public static void main(String[] args) {
		try {
			FileInputStream fos = new FileInputStream("DATA.in");
			BufferedInputStream bof = new BufferedInputStream(fos);
			String s = "";
			int c;
			while ((c = bof.read()) != -1) {
				s += String.valueOf((char) c + "");
			}
			System.out.println(s);
			fos.close();
			bof.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
