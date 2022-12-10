package com.trinhtung;

import java.util.Scanner;

public class SoChinhPhuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			double s = Math.sqrt(a);
			if(s == Math.floor(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
}
