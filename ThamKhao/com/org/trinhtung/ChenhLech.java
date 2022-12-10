package org.trinhtung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChenhLech {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<String> list = new ArrayList<String>();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLine());
		}
		List<List<String>> ll = new ArrayList<List<String>>();
		for (int i = 0; i < list.size(); i++) {
			ll.add(hoanVi(list.get(i)));
		}
		int res = Math.abs(Integer.valueOf(ll.get(0).get(0)) - Integer.valueOf(ll.get(1).get(0)));
		for (int i = 0; i < ll.get(0).size(); i++) {
			List<Integer> li = new ArrayList<Integer>();
			for (int j = 0; j < ll.size(); j++) {
				li.add(Integer.valueOf(ll.get(j).get(i)));
			}
			li.sort(null);
			if(Math.abs(li.get(1) - li.get(0)) < res) {
				res = Math.abs(li.get(1) - li.get(0));
			}
		}
		System.out.println(res);
	}

	public static List<String> hoanVi(String s) {
		List<String> res = new ArrayList<String>();
		if (s.length() == 1) {
			res.add(s);
		} else if (s.length() > 1) {
			int lastIndex = s.length() - 1;
			String last = s.substring(lastIndex);
			String rest = s.substring(0, lastIndex);
			res = check(hoanVi(rest), last);
		}
		return res;
	}

	public static List<String> check(List<String> list, String c) {
		ArrayList<String> res = new ArrayList<>();
		for (String s : list) {
			for (int i = 0; i <= s.length(); ++i) {
				String ps = new StringBuffer(s).insert(i, c).toString();
				res.add(ps);
			}
		}
		return res;
	}
}
