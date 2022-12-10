package com.trinhtung;

import java.util.Scanner;
import java.util.Stack;

public class HinhChuNhatDonSac {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = m - a[i];
		}
		long x = max(a, n);
		long y = max(b, n);
		System.out.println(x > y ? x : y);
		sc.close();
	}

	static long max(int h[], long n) {
		Stack<Long> s = new Stack<Long>();
		long a = 0;
		long b;
		long tp = 0, i = 0;
		while (i < n) {
			if (!s.empty()) {
				tp = s.peek();
			}
			if (s.empty() || h[(int) tp] <= h[(int) i]) {
				s.push(i++);
			} else {
				tp = s.pop();
				b = h[(int) tp] * (s.empty() ? i : i - s.peek() - 1);
				if (a < b) {
					a = b;
				}
			}
		}
		while (!s.empty()) {
			tp = s.peek();
			s.pop();
			b = h[(int) tp] * (s.empty() ? i : i - s.peek() - 1);
			if (a < b) {
				a = b;
			}
		}
		return a;
	}
}
