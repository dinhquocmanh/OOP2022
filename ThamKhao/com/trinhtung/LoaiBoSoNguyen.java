package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2147483647
public class LoaiBoSoNguyen {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("DATA.in"));
		List<String> l = new ArrayList<String>();
		while (sc.hasNext()) {
			String s = sc.next();
			if (s.matches("\\d+") && s.length() < 11) {
				long temp = Long.parseLong(s);
				if (temp > 2147483647) {
					l.add(s);
				}
			} else {
				l.add(s);
			}
		}
		l.sort((s1, s2) -> s1.compareTo(s2));
		l.forEach(s -> System.out.print(s + " "));
		sc.close();
	}
}
