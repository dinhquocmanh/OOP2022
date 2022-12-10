package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SoKhacNhauTrongFile {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileInputStream("DATA.IN"));
			Map<String, Integer> m = new TreeMap<String, Integer>((i1, i2) -> Integer.valueOf(i1).compareTo(Integer.valueOf(i2)));
			while (sc.hasNext()) {
				String s = sc.next();
				if (!m.containsKey(s)) {
					m.put(s, 1);
				} else {
					m.put(s, m.get(s) + 1);
				}
			}
			for (Map.Entry<String, Integer> e : m.entrySet()) {
				System.out.println(e.getKey() + " " + e.getValue());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
