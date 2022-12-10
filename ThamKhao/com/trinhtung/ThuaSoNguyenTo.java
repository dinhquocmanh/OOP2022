package com.trinhtung;

import java.util.Scanner;

public class ThuaSoNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = (long) Math.pow(b, a);
		long d = 1000000000;
		if (c > d) {
			System.out.println(0);
		} else {
			System.out.println(c);
		}
		sc.close();
	}
}
