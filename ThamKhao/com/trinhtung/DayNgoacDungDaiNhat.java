package com.trinhtung;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s = sc.nextLine();
			int dem = 0;
			int max = 0;
			int n = s.length();
			int[] a = new int[n + 1];
			Arrays.fill(a, 0);
			Stack<Integer> st = new Stack<Integer>();
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) == '(') {
					st.push(i);
				} else if (!st.empty()) {
					a[i] = 1;
					a[st.lastElement()] = 1;
					st.pop();
				}
			}
			for (int i = 0; i <= n; i++) {
				if (max <= dem) {
					max = dem;
				}
				if (a[i] == 1) {
					dem++;
				} else {
					dem = 0;
				}
			}
			System.out.println(max);
		}
		sc.close();
	}
}
