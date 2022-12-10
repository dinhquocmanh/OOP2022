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

public class NguyenToVaThuanNghich {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
		ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
		ois1.close();
		ois2.close();
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		for (Integer i : list1) {
			if (!map1.containsKey(i)) {
				map1.put(i, 1);
			} else {
				map1.put(i, map1.get(i) + 1);
			}
		}
		for (Integer i : list2) {
			if (!map2.containsKey(i)) {
				map2.put(i, 1);
			} else {
				map2.put(i, map2.get(i) + 1);
			}
		}
		Set<Integer> set = new TreeSet<>((i1, i2) -> i1.compareTo(i2));
		set.addAll(list1);
		set.addAll(list2);
		for (Integer i : set) {
			if (isPrime(i) && map1.containsKey(i) && map2.containsKey(i) && thuanNghich(i)) {
				System.out.println(i + " " + map1.get(i) + " " + map2.get(i));
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

	public static boolean thuanNghich(int a) {
		StringBuilder sb = new StringBuilder(a + "");
		String s1 = sb.toString();
		String s2 = sb.reverse().toString();
		return s1.equals(s2);
	}
}
