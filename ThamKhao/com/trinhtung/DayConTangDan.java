package com.trinhtung;

import java.io.*;
import java.util.*;

public class DayConTangDan {
	static List<String> l = new ArrayList<String>();

	public static void recursive(int[] a, int index, ArrayList<Integer> al) {
		if (index == a.length) {
			if (al.size() > 1) {
				if (check(al)) {
					l.add(toString(al));
				}
			}
		} else {
			recursive(a, index + 1, al);
			al.add(a[index]);
			recursive(a, index + 1, al);
			al.remove(al.size() - 1);
		}
		return;
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileInputStream("DAYSO.in"));
			int t = sc.nextInt();
			int[] a = new int[t];
			for (int i = 0; i < t; i++) {
				a[i] = sc.nextInt();
			}
			ArrayList<Integer> al = new ArrayList<>();
			recursive(a, 0, al);
			l.sort(null);
			l.forEach(s -> System.out.println(s));
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	static boolean check(ArrayList<Integer> al) {
		int sz = al.size() - 1;
		for (int i = 0; i < sz; i++) {
			if (al.get(i) >= al.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

	static String toString(ArrayList<Integer> al) {
		String res = "";
		for (int i : al) {
			res += (i + " ");
		}
		return res.trim();
	}
}
