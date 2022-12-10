package com.trinhtung;

import java.util.Arrays;
import java.util.Scanner;

public class HinhVuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[4];
		int[] y = new int[4];
		for (int i = 0; i < 4; i++) {
			y[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		int w = y[3] - y[0];
		int h = x[3] - x[0];
		System.out.println((h > w) ? h * h : w * w);

		sc.close();
	}
}
