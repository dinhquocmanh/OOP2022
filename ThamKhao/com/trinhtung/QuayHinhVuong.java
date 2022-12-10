package com.trinhtung;

import java.util.LinkedList;
import java.util.Scanner;

public class QuayHinhVuong {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s1 = "";
			String s2 = "";
			for (int i = 0; i < 6; i++) {
				s1 += sc.nextInt();
			}
			for (int i = 0; i < 6; i++) {
				s2 += sc.nextInt();
			}
			System.out.println(Solve(s1, s2));
		}
		sc.close();
	}

	static String phai(String s) {
		char[] res = new char[6];
		res[0] = s.charAt(0);
		res[1] = s.charAt(4);
		res[2] = s.charAt(1);
		res[3] = s.charAt(3);
		res[4] = s.charAt(5);
		res[5] = s.charAt(2);
		return new String(res);
	}

	static String trai(String s) {
		char[] res = new char[6];
		res[0] = s.charAt(3);
		res[1] = s.charAt(0);
		res[2] = s.charAt(2);
		res[3] = s.charAt(4);
		res[4] = s.charAt(1);
		res[5] = s.charAt(5);
		return new String(res);
	}

	static int Solve(String s1, String s2) {
		LinkedList<Y> q = new LinkedList<>();
		q.push(new Y(s1, 0));
		while (!q.isEmpty()) {
			Y tmp = q.pop();
			if (s2.equals(tmp.s)) {
				return tmp.i;
			}
			q.add(new Y(trai(tmp.s), tmp.i + 1));
			q.add(new Y(phai(tmp.s), tmp.i + 1));
		}
		return 0;
	}

}

class Y {
	String s;
	int i;

	public Y(String s, int i) {
		this.s = s;
		this.i = i;
	}

	public Y() {
		this.s = "";
		this.i = 0;
	}
}
