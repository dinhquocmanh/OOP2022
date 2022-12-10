package com.trinhtung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class XoayVongKyTu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[t];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < t; i++) {
			arr[i] = sc.nextLine();
		}
		if (!check(arr)) {
			System.out.println("-1");
		} else {
			String s = arr[0];
			for (int k = 0; k < arr[0].length(); k++) {
				s = xoay(s);
				int count = 0;
				for (int i = 0; i < arr.length; i++) {
					String ss = arr[i];
					while (!ss.equals(s)) {
						count++;
						ss = xoay(ss);
					}
				}
				list.add(count);
			}
			int min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
			System.out.println(min);
		}

		sc.close();
	}

	static String xoay(String s) {
		s = s.substring(1) + s.substring(0, 1);
		return s;
	}

	static boolean check(String[] a) {
		String[] arr = Arrays.copyOf(a,a.length);
		for (int i = 0; i < arr.length; i++) {
			char[] c = arr[i].toCharArray();
			Arrays.sort(c);
			arr[i] = String.valueOf(c);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (!arr[i].equals(arr[i + 1])) {
				return false;
			}
		}
		return true;
	}
}
