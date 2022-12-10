package org.trinhtung;

import java.util.Scanner;

//2

//6
//5 5 10 100 10 5
//4
//3 2 7 10

//110
//13
public class NhaKhongKeNhau {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			System.out.println(qhd(a, n));
		}
	}

	public static int qhd(int a[], int n) {
		int f[] = new int[n], i, j, kq = 0;
		f[0] = a[0];
		f[1] = Math.max(a[0], a[1]);
		for (i = 2; i < n; i++) {
			f[i] = Math.max(f[i - 2] + a[i], f[i - 1]);

		}

		return f[n - 1];
	}

}
