package com.trinhtung;

import java.util.Arrays;
import java.util.Scanner;

public class QuayPhai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			String s = "";
			int[] a = new int[n];
			for(int i = 0;i <n;i++) {
				int x = sc.nextInt();
				a[i] = x;
				s += (x + " ");
			}
			Arrays.sort(a);
			String ss = "";
			for(int i = 0;i <n;i++) {
				ss += (a[i] + " ");
			}
			s = s.trim();
			ss = ss.trim();
			int res = 0;
			while(!s.equals(ss)) {
				res++;
				ss = quay(ss);
			}
			System.out.println(res);
		}
		sc.close();
	}
	static String quay(String s) {
//		1 2 3 4 5
//		5 1 2 3 4
		s = s.trim();
		String sn = s.substring(s.lastIndexOf(" ") + 1);
		s = sn + " " + s.substring(0, s.lastIndexOf(" "));
		return s.trim();
	}
}
