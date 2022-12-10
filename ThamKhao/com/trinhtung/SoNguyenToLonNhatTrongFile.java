package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SoNguyenToLonNhatTrongFile {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
		Map<Integer, Integer> map = new TreeMap<>((k1, k2) -> k2.compareTo(k1));
		for (int i : list) {
			if (isPrime(i)) {
				if (!map.containsKey(i)) {
					map.put(i, 1);
				} else {
					map.put(i, map.get(i) + 1);
				}
			}
		}
		int i = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			i++;
			if (i > 10) {
				break;
			}
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	public static boolean isPrime(int a) {
		if (a == 1 || a == 0) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
