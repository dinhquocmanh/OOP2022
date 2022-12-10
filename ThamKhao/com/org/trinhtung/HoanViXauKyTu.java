package org.trinhtung;

import java.util.Scanner;
//2
//AB
//ABC
public class HoanViXauKyTu {

	static int a[], n;
	static boolean b[];;
	static String s;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			a = new int[15];
			b = new boolean[15];
			s = scanner.next();
			n = s.length();
			quaylui(1);
			System.out.println();
		}
		scanner.close();
	}

	private static void quaylui(int i) {
		for (int j = 1; j <= n; j++) {
			if (b[j] == false) {
				a[i] = j;
				b[j] = true;
				if (i == n)
					in();
				else
					quaylui(i + 1);
				b[j] = false;
			}
		}
	}

	private static void in() {
		for (int i = 1; i <= n; i++) {
			System.out.print(s.charAt(a[i] - 1));
		}
		System.out.print(" ");
	}
}
