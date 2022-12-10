package com.trinhtung;

import java.util.Scanner;
import java.util.Stack;

public class HinhChuNhatLonNhat {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] h = new int[n];
			for (int i = 0; i < h.length; i++) {
				h[i] = sc.nextInt();
			}
			System.out.println(max(h, n));
		}
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
