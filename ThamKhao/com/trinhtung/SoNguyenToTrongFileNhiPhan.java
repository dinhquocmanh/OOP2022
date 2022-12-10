package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SoNguyenToTrongFileNhiPhan {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
		ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
		ois1.close();
		Map<Integer, Integer> map1 = new HashMap<>();
		for (Integer i : list1) {
			if (!map1.containsKey(i)) {
				map1.put(i, 1);
			} else {
				map1.put(i, map1.get(i) + 1);
			}
		}
		Set<Integer> set = new TreeSet<>((i1, i2) -> i1.compareTo(i2));
		set.addAll(list1);
		for (Integer i : set) {
			if (isPrime(i)) {
				System.out.println(i + " " + map1.get(i));
			}
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
