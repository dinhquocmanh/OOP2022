package com.trinhtung;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class BienDoiST {
	static int res(int s, int t) {
		Set<Integer> set = new HashSet<>();
		LinkedList<X> q = new LinkedList<>();
		q.add(new X(s, 0));
		while (!q.isEmpty()) {
			X temp = q.remove();
			if (temp.a == t)
				return temp.b;
			if (temp.a * 2 == t || temp.a - 1 == t)
				return temp.b + 1;
			if (!set.contains(temp.a * 2) && temp.a < t) {
				q.add(new X(temp.a * 2, temp.b + 1));
				set.add(temp.a * 2);
			}
			if (temp.a - 1 > 0 && !set.contains(temp.a - 1)) {
				q.add(new X(temp.a - 1, temp.b + 1));
				set.add(temp.a - 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			System.out.println(res(s, t));
		}
		sc.close();
	}
}

class X {
	int a;
	int b;

	public X(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public X() {
		this.a = 0;
		this.b = 0;
	}
}
