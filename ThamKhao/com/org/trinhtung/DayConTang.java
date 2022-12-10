package org.trinhtung;

import java.util.Arrays;
import java.util.Scanner;

public class DayConTang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[1000];
		Arrays.fill(a, 0);
		int i, dem;
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			dem = 0;
			while (a[i] < a[i + 1]) {
				if (dem == 0)
					System.out.print(a[i] + " " + a[i + 1] + " ");
				else
					System.out.print(a[i + 1]);
				i++;
				dem++;
			}
			System.out.println("");
		}
	}

}
