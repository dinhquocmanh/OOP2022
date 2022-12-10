package org.trinhtung;

import java.util.Scanner;
//In
//2
//2
//3
//Out
//21 12 
//321 312 231 213 132 123  
public class HoanViNguoc {
	static int a[], n;
	static boolean b[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			a = new int[15];
			b = new boolean[15];
			quaylui(1);
			System.out.println();
		}
		sc.close();
	}

	private static void quaylui(int i) {
		for (int j = n; j >= 1; j--) {
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

	public static void in() {
		for (int i = 1; i <= n; i++) {
			System.out.print(a[i]);
		}
		System.out.print(" ");
	}
}