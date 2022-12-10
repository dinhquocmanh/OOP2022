package com.trinhtung;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SoThuanNghichTrongFile {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
		ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> list2 = (ArrayList<Integer>) ois.readObject();
		Set<Integer> set1 = new TreeSet<>(list1);
		Set<Integer> set2 = new TreeSet<>(list2);
		list1.addAll(list2);
		set1.retainAll(set2);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>((k1, k2) -> k1.compareTo(k2));
		for (int i : set1) {
			if (check(i)) {
				map.put(i, Collections.frequency(list1, i));
			}
		}
		int i = 0;
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
			i++;
			if(i == 10) {
				break;
			}
		}
	}

	static boolean check(int x) {
		String s = x + "";
		int len = s.length();
		if(len == 1 || len % 2 == 0) {
			return false;
		}
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}
		for(int i = 0;i < len;i++) {
			if(Integer.valueOf(s.charAt(i) + "") % 2 == 0) {
				return false;
			}
		}
		
		return true;
	}
}
