package com.trinhtung;

import java.util.Scanner;

public class PhanTuBenPhaiDauTienLonHon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0;i < n;i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0;i < n - 1;i++) {
				for(int j = i+1;j < n;j++) {
					if(a[j] > a[i]) {
						b[i] = a[j];
						break;
					} else {
						b[i] = -1;
					}
				}
			}
			b[n - 1] = -1;
			for(int i = 0;i < n;i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
