package org.trinhtung;

import java.util.Scanner;
//2
//3
//abc
//5
//axxxy

//0
//2
public class DayConLapLaiDaiNhat {
	static int c[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			char s[] = in.next().toCharArray();
			System.out.println(qhd(s, n));
		}
	}

	public static int qhd(char s[], int n) {
		int i, j;
		c = new int[n + 1][n + 1];
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (s[i - 1] == s[j - 1] && j != i)
					c[i][j] = c[i - 1][j - 1] + 1;
				else
					c[i][j] = Math.max(c[i][j - 1], c[i - 1][j]);
			}
		}
		return c[n][n];
	}
}
