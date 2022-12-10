package org.trinhtung;

import java.util.*;
//1
//15 10
//5 2 1 3 5 2 5 8 9 6 3 1 4 7 8
//1 2 3 5 1 2 5 8 7 4 1 2 3 2 1

//15
public class CaiTui {
	static int f[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), v = in.nextInt();
			int a[] = new int[n + 1], c[] = new int[n + 1];
			for (int i = 1; i <= n; i++)
				a[i] = in.nextInt();
			for (int i = 1; i <= n; i++)
				c[i] = in.nextInt();
			System.out.println(qhd(a, c, n, v));
		}
	}

	public static int qhd(int a[], int c[], int n, int v) {
		f = new int[n + 1][v + 1];
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= v; j++) {
				f[i][j] = f[i - 1][j];
				if (j >= a[i])
					f[i][j] = Math.max(f[i][j], f[i - 1][j - a[i]] + c[i]);
			}
		}
		return f[n][v];
	}

}
