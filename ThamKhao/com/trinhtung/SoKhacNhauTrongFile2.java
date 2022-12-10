package com.trinhtung;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SoKhacNhauTrongFile2 {
	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
			Map<Integer, Integer> m = new TreeMap<>((i1, i2) -> i1.compareTo(i2));
			try {
				while (true) {
					int a = dis.readInt();
					if (!m.containsKey(a)) {
						m.put(a, 1);
					} else {
						m.put(a, m.get(a) + 1);
					}
				}
			} catch (EOFException e) {

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
