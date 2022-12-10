package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SoKhacNhauTrongFile3 {
	public static void main(String[] args) {
		try {
			ObjectInputStream dis = new ObjectInputStream(new FileInputStream("DATA.in"));
			Map<Integer, Integer> m = new TreeMap<>((i1, i2) -> i1.compareTo(i2));
			try {
				ArrayList<Integer> list = (ArrayList<Integer>) dis.readObject();
				for (int a : list) {
					if (!m.containsKey(a)) {
						m.put(a, 1);
					} else {
						m.put(a, m.get(a) + 1);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for (Map.Entry<Integer, Integer> e : m.entrySet()) {
				System.out.println(e.getKey() + " " + e.getValue());
			}
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
