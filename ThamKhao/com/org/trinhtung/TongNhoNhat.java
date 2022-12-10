package org.trinhtung;

import java.util.Arrays;
import java.util.Scanner;
//2
//6
//6 8 4 5 2 3
//5
//5 3 0 7 4

//604
//82
public class TongNhoNhat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		while (T-- > 0 && T < 100) {
			int n = in.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);

			long x = 0, y = 0;
			for (int i = 0; i < n; i += 2) {
				x = x * 10 + a[i];
			}
			for (int i = 1; i < n; i += 2) {
				y = y * 10 + a[i];
			}
			System.out.println(x + y);
		}
	}
}
